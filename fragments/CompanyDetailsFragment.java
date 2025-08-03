package com.example.myapplication.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.adapter.JobsAdapter;
import com.example.myapplication.api.response.jobResponse.BusinessMan;
import com.example.myapplication.api.response.jobResponse.Datum;
import com.example.myapplication.conts.UiUtils;
import com.example.myapplication.databinding.FragmentCompanyDetailsBinding;

import java.util.ArrayList;
import java.util.List;

public class CompanyDetailsFragment extends Fragment {

    private FragmentCompanyDetailsBinding binding;
    private JobsAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentCompanyDetailsBinding.inflate(inflater, container, false);

        UiUtils.showLoading(binding.progressBar, binding.mainContentLayout, true);

        BusinessMan businessMan = getBusinessData();
        List<Datum> jobList = getJobList();

        binding.getRoot().postDelayed(() -> {
            setArgumentsData(businessMan, jobList);
            UiUtils.showLoading(binding.progressBar, binding.mainContentLayout, false);
        }, 300);

        return binding.getRoot();
    }

    private void setArgumentsData(BusinessMan businessMan, List<Datum> jobList) {
        if (businessMan != null) {
            Glide.with(requireContext())
                    .load(businessMan.getCoverUrl())
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(binding.coverImageView);

            Glide.with(requireContext())
                    .load(businessMan.getImageUrl())
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .circleCrop()
                    .into(binding.logoImageView);

            binding.companyNameTextView.setText(
                    businessMan.getBusinessName() != null ? businessMan.getBusinessName() : "No Name");

            binding.typeOfBusiness.setText(
                    businessMan.getTypeBusiness() != null ? businessMan.getTypeBusiness()+"" : "N/A");

            binding.numberOfEmployees.setText(
                    businessMan.getEmployeeNo() != null ? businessMan.getEmployeeNo() : "N/A");

            binding.country.setText(
                    businessMan.getCountryId() != null ? businessMan.getCountryId().toString() : "N/A");

            binding.bioTextView.setText(
                    businessMan.getBio() != null ? businessMan.getBio() : "No bio available");
        }

        if (jobList != null) {
            binding.recentJobsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            adapter = new JobsAdapter(getContext(), jobList);
            binding.recentJobsRecyclerView.setAdapter(adapter);
        }
    }

    private BusinessMan getBusinessData() {
        return (BusinessMan) getArguments().getSerializable("businessMan");
    }

    private List<Datum> getJobList() {
        return (List<Datum>) getArguments().getSerializable("jobsList");
    }
}
