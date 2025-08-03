package com.example.myapplication;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class NotificationSettingsBottomSheet extends BottomSheetDialogFragment {

    private SharedPreferences sharedPreferences;
    private static final String PREFS_NAME = "notification_prefs";
    private static final String PUSH_KEY = "push_enabled";

    public NotificationSettingsBottomSheet() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_sheet_notification_settings, container, false);
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch switchPush = view.findViewById(R.id.switchPush);

        sharedPreferences = requireContext().getSharedPreferences(PREFS_NAME, getContext().MODE_PRIVATE);
        boolean isPushEnabled = sharedPreferences.getBoolean(PUSH_KEY, true);
        switchPush.setChecked(isPushEnabled);

        switchPush.setOnCheckedChangeListener((buttonView, isChecked) ->
                sharedPreferences.edit().putBoolean(PUSH_KEY, isChecked).apply()
        );

        return view;
    }
}
