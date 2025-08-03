package com.example.myapplication.adapter;

import static com.example.myapplication.conts.contsMethod.openShareBottomSheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.api.response.jobResponse.Datum;
import com.example.myapplication.databinding.JobCardLayoutBinding;
import com.example.myapplication.fragments.CompanyDetailsFragment;
import com.example.myapplication.fragments.JobDetailsFragment;
import com.example.myapplication.model.JobData;

import java.io.Serializable;
import java.util.List;


public class JobsAdapter extends RecyclerView.Adapter<JobsAdapter.JobViewHolder> {

    private List<Datum> jobList;
    private Context context;

    public JobsAdapter(Context context, List<Datum> jobList) {
        this.context = context;
        this.jobList = jobList;
    }

    public void setJobList(List<Datum> jobList) {
        this.jobList = jobList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public JobsAdapter.JobViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        JobCardLayoutBinding binding = JobCardLayoutBinding.inflate(LayoutInflater
                        .from(parent.getContext())
                , parent, false);
        JobViewHolder myViewHolder = new JobViewHolder(binding);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull JobViewHolder holder, int position) {
        Datum job = jobList.get(position);
        setUpActions(holder, position);
        // العنوان
        holder.binding.tvTitle.setText(job.getTitle());

        // اسم الشركة (business_name)
        if (job.getBusinessMan() != null) {
            holder.binding.tvCompany.setText(job.getBusinessMan().getBusinessName());
        } else {
            holder.binding.tvCompany.setText("Unknown");
        }

        // وقت الإنشاء
        holder.binding.tvTime.setText(job.getCreateTime());

        // عدد المشاهدات
        holder.binding.tvViews.setText("(#" + job.getId() + ") 👁️ " + job.getWatchesCount());

        // المجال الوظيفي (مثل "Engineering")
        if (job.getWorkField() != null) {
            holder.binding.tvTag1.setText(job.getWorkField().getName());
        } else {
            holder.binding.tvTag1.setText("No Field");
        }

        // الراتب
        if (job.getSalaryShow() != null && job.getSalaryShow() == 1) {
            holder.binding.tvTag2.setText("Confidential");
        } else {
            holder.binding.tvTag2.setText("Hidden");
        }

        // الخبرة المطلوبة (مثل "3 Years")
        if (job.getExperienceYear() != null) {
            holder.binding.tvFooter1.setText(job.getExperienceYear().getName());
        } else {
            holder.binding.tvFooter1.setText("N/A");
        }

        // عدد الأيام المتبقية
        if (job.getExpireDate() != null) {
            holder.binding.tvFooter2.setText(job.getExpireDate() + " days rem.");
        } else {
            holder.binding.tvFooter2.setText("Unknown");
        }

        // صورة الشعار (Logo)
        if (job.getBusinessMan() != null && job.getBusinessMan().getImageUrl() != null) {
            Glide.with(context)
                    .load(job.getBusinessMan().getImageUrl())
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(holder.binding.ivLogo);
        } else {
            Glide.with(context)
                    .load(R.drawable.ic_launcher_background)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(holder.binding.ivLogo);
        }
    }

    @Override
    public int getItemCount() {
        return jobList.size();
    }


    class JobViewHolder extends RecyclerView.ViewHolder {
        JobCardLayoutBinding binding;


        public JobViewHolder(JobCardLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    private void setUpActions(JobsAdapter.JobViewHolder holder, int position) {
        openJobDetAct(holder, position);
        openCompanyAct(holder, position);
        openShare(holder);
    }

    private void openShare(JobViewHolder holder) {
        holder.binding.ivShare.setOnClickListener(v -> openShareBottomSheet(context, 1));

    }

    private void openCompanyAct(JobViewHolder holder, int position) {
        holder.binding.ivLogo.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putSerializable("businessMan", jobList.get(position).getBusinessMan());
            bundle.putSerializable("jobsList", (Serializable) jobList);

            Fragment companyDetailsFragment = new CompanyDetailsFragment();
            companyDetailsFragment.setArguments(bundle);

            FragmentTransaction transaction = ((AppCompatActivity) context)
                    .getSupportFragmentManager()
                    .beginTransaction();
            transaction.replace(R.id.fragment_container, companyDetailsFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
    }

    private void openJobDetAct(JobsAdapter.JobViewHolder holder, int position) {
        holder.binding.getRoot().setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putSerializable("job_id", jobList.get(position).getId());
//            bundle.putSerializable("jobsList", (Serializable) jobList);

            Fragment jobDetailsFragment = new JobDetailsFragment();
            jobDetailsFragment.setArguments(bundle);

            FragmentTransaction transaction = ((AppCompatActivity) context)
                    .getSupportFragmentManager()
                    .beginTransaction();
            transaction.replace(R.id.fragment_container, jobDetailsFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
    }
}



