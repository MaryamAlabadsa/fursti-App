package com.example.myapplication.fragments;

import static com.example.myapplication.conts.contsMethod.openShareBottomSheet;
import static com.example.myapplication.conts.contsMethod.showLoginBottomSheet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.api.ApiClient;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.api.response.jobResponse.Datum;
import com.example.myapplication.api.response.jobResponse.JobDetailsResponse;
import com.example.myapplication.api.response.jobResponse.JobResponse;
import com.example.myapplication.api.response.jobResponse.Skill;
import com.example.myapplication.databinding.FragmentJobDetailsBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import android.content.ActivityNotFoundException;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class JobDetailsFragment extends Fragment {

    private FragmentJobDetailsBinding binding;
    private int jobId;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentJobDetailsBinding.inflate(inflater, container, false);

        if (getArguments() != null) {
            jobId = getArguments().getInt("job_id");
            fetchJobDetails(jobId);
        }

        setupListeners();

        return binding.getRoot();
    }

    private void setupListeners() {
        binding.btnBack.setOnClickListener(v -> requireActivity().onBackPressed());
        binding.btnApply.setOnClickListener(v ->
                showLoginBottomSheet(getContext())       );
    }

    private void fetchJobDetails(int jobId) {
        ApiService api = ApiClient.getClient("").create(ApiService.class);
        Call<JobDetailsResponse> call = api.getJobDetails(jobId);
        Toast.makeText(getContext(), jobId+"", Toast.LENGTH_SHORT).show();
        call.enqueue(new Callback<JobDetailsResponse>() {
            @Override
            public void onResponse(Call<JobDetailsResponse> call, Response<JobDetailsResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    populateUI(response.body().getData());
                } else {
                    Toast.makeText(getContext(), "Failed to load job data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<JobDetailsResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Failed: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void populateUI(Datum job) {
        // بيانات البطاقة
        binding.jobCard.tvTitle.setText(job.getTitle());
        binding.jobCard.tvCompany.setText(job.getBusinessMan().getName() + "");
        binding.jobCard.tvTime.setText(job.getCreateTime() + " ");  // حسب ما توفر من API
        binding.jobCard.tvViews.setText("(ID: " + job.getId() + ") 👁️ " + job.getWatchesCount());

        // إخفاء tags و footer
        binding.jobCard.llTags.setVisibility(View.GONE);
        binding.jobCard.llFooter.setVisibility(View.GONE);

        // إعداد زر المشاركة
        binding.jobCard.ivShare.setOnClickListener(v -> openShareBottomSheet(getContext(), 1));

        binding.tvJobType.setText(job.getEmploymentType());
        binding.tvWorkField.setText(job.getWorkField() != null ? job.getWorkField().getName() : "--");
        binding.tvCountry.setText(job.getCountryOfEmployment() != null ? job.getCountryOfEmployment().getName() : "--");
        binding.tvSalary.setText(job.getSalary() + "");
        binding.tvExperience.setText(job.getExperienceYear() + "");
        binding.tvDescription.setText(job.getSummary());

        binding.tvNationality.setText(job.getNationalityPrefrence() + "");
        binding.tvResidence.setText(job.getCountryOfEmployment() != null ? job.getCountryOfEmployment().getName() : "--");
        binding.tvGender.setText(job.getGenderPerfrence() + "");

        populateSkills(job.getSkills());
    }


    private void populateSkills(List<Skill> skills) {
        binding.skillsContainer.removeAllViews();

        if (skills != null && !skills.isEmpty()) {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            for (Skill skill : skills) {
                TextView skillView = new TextView(getContext());
                skillView.setText(skill.getName());
                skillView.setBackgroundResource(R.drawable.skill_chip_bg);
                skillView.setPadding(24, 12, 24, 12);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMarginEnd(16);
                skillView.setLayoutParams(params);
                binding.skillsContainer.addView(skillView);
            }
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // لتجنب تسريبات الذاكرة
    }
}

