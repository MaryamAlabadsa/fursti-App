package com.example.myapplication.BottomSheet;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.TakeActionLayoutBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class TakeActionBottomSheet extends BottomSheetDialogFragment {

    private TakeActionLayoutBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = TakeActionLayoutBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Example click listeners
        binding.btnCall.setOnClickListener(v -> {
            // Handle call
        });
        binding.btnWhats.setOnClickListener(v -> {
            // Handle whats
        });
        binding.btnSms.setOnClickListener(v -> {
            // Handle sms
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
