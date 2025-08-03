package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class LoginSignupBottomSheet extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_login_signup, container, false);

        Button btnLogin = view.findViewById(R.id.btnLogin);
        Button btnSignup = view.findViewById(R.id.btnSignup);

        btnLogin.setOnClickListener(v -> {
            // TODO: navigate to Login screen
            dismiss();
        });

        btnSignup.setOnClickListener(v -> {
            // TODO: navigate to Signup screen
            dismiss();
        });

        return view;
    }
}

