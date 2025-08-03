package com.example.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.FaqAnswerBottomSheet;
import com.example.myapplication.R;
import com.example.myapplication.api.ApiClient;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.api.response.faqResponse.Datum;
import com.example.myapplication.api.response.faqResponse.FaqResponse;
import com.example.myapplication.conts.UiUtils;
import com.example.myapplication.databinding.FragmentFaqsBinding;
import com.example.myapplication.databinding.ItemFaqBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FaqsFragment extends Fragment {

    private FragmentFaqsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFaqsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.backButton.setOnClickListener(v -> requireActivity().onBackPressed());

        // Show loading
        UiUtils.showLoading(binding.progressBar, binding.contentLayout, true);
        fetchFaqs();
    }

    private void fetchFaqs() {
        ApiService apiService = ApiClient.getClient("").create(ApiService.class);
        apiService.getFaqs().enqueue(new Callback<FaqResponse>() {
            @Override
            public void onResponse(Call<FaqResponse> call, Response<FaqResponse> response) {
                // Hide loading
                UiUtils.showLoading(binding.progressBar, binding.contentLayout, false);

                if (response.isSuccessful() && response.body() != null) {
                    List<Datum> faqList = response.body().getData();
                    showFaqs(faqList);
                } else {
                    Toast.makeText(getContext(), "Error: couldn't load FAQs", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<FaqResponse> call, Throwable t) {
                UiUtils.showLoading(binding.progressBar, binding.contentLayout, false);
                Toast.makeText(getContext(), "Failed: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showFaqs(List<Datum> faqList) {
        LayoutInflater inflater = LayoutInflater.from(requireContext());
        binding.faqListContainer.removeAllViews();

        for (Datum faq : faqList) {
            View itemView = inflater.inflate(R.layout.item_faq, binding.faqListContainer, false);
            ItemFaqBinding itemBinding = ItemFaqBinding.bind(itemView);

            itemBinding.faqQuestion.setText(faq.getTitle());

            itemBinding.faqItemRoot.setOnClickListener(v -> {
                FaqAnswerBottomSheet sheet = new FaqAnswerBottomSheet(faq.getTitle(), faq.getDescription());
                sheet.show(getParentFragmentManager(), "faq_answer");
            });

            binding.faqListContainer.addView(itemView);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
