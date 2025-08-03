package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myapplication.databinding.FragmentFaqAnswerBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class FaqAnswerBottomSheet extends BottomSheetDialogFragment {

    private FragmentFaqAnswerBottomSheetBinding binding;

    private String title;
    private String answer;

    public FaqAnswerBottomSheet(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFaqAnswerBottomSheetBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.faqTitle.setText(title);
        binding.faqAnswer.setText(answer);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
