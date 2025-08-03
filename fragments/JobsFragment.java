package com.example.myapplication.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.myapplication.adapter.JobsAdapter;
import com.example.myapplication.api.ApiClient;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.api.response.jobResponse.Datum;
import com.example.myapplication.api.response.jobResponse.JobResponse;
import com.example.myapplication.conts.UiUtils;
import com.example.myapplication.databinding.FragmentJobsBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JobsFragment extends Fragment {

    private FragmentJobsBinding binding;
    private JobsAdapter adapter;
    private List<Datum> jobList = new ArrayList<>();

    public JobsFragment() {
        // Required empty public constructor
    }

    public static JobsFragment newInstance(String param1, String param2) {
        JobsFragment fragment = new JobsFragment();
        Bundle args = new Bundle();
        args.putString("param1", param1);
        args.putString("param2", param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentJobsBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        adapter = new JobsAdapter(getContext(), jobList);
        binding.recyclerJobs.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerJobs.setAdapter(adapter);

        UiUtils.showLoading(binding.progressBar, binding.recyclerJobs, true);

        fetchJobs();

        return view;
    }

    private void fetchJobs() {
        ApiService apiService = ApiClient.getClient("").create(ApiService.class);
        Call<JobResponse> call = apiService.getAllJobs();

        call.enqueue(new Callback<JobResponse>() {
            @Override
            public void onResponse(Call<JobResponse> call, Response<JobResponse> response) {
                UiUtils.showLoading(binding.progressBar, binding.recyclerJobs, false);

                if (response.isSuccessful() && response.body() != null) {
                    List<Datum> jobs = response.body().getData();
                    adapter.setJobList(jobs);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(getContext(), "خطأ في الاستجابة", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<JobResponse> call, Throwable t) {
                UiUtils.showLoading(binding.progressBar, binding.recyclerJobs, false);
                Toast.makeText(getContext(), "فشل الاتصال: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("JobsFragment", "Error: " + t.getMessage());
            }
        });
    }
}
