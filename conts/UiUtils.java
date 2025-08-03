package com.example.myapplication.conts;

import android.view.View;

public class UiUtils {
    public static void showLoading(View progressBar, View contentLayout, boolean isLoading) {
        if (isLoading) {
            progressBar.setVisibility(View.VISIBLE);
            contentLayout.setVisibility(View.GONE);
        } else {
            progressBar.setVisibility(View.GONE);
            contentLayout.setVisibility(View.VISIBLE);
        }
    }
}
