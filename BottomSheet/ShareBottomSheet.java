package com.example.myapplication.BottomSheet;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.BottomSheetShareBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ShareBottomSheet extends BottomSheetDialogFragment {

    private BottomSheetShareBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = BottomSheetShareBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Example click listeners
        binding.imageViewGmail.setOnClickListener(v -> {
            // Handle Gmail share
        });

        binding.imageViewFacebook.setOnClickListener(v -> {
            // Handle Facebook share
        });

        binding.imageViewMessenger.setOnClickListener(v -> {
            // Handle Messenger share
        });

        binding.imageViewWhatsapp.setOnClickListener(v -> {
            // Handle WhatsApp share
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}