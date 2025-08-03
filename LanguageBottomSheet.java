package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class LanguageBottomSheet extends BottomSheetDialogFragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_language, container, false);
        recyclerView = view.findViewById(R.id.recyclerLanguages);
        setupLanguages();
        return view;
    }

    private void setupLanguages() {
        List<LanguageItem> languages = new ArrayList<>();
        languages.add(new LanguageItem("العربية", "ar", R.drawable.ic_ar));
        languages.add(new LanguageItem("English", "en", R.drawable.ic_en));

        String currentCode = getCurrentLangCode(); // يمكنك جلب اللغة من SharedPreferences

        LanguageAdapter adapter = new LanguageAdapter(languages, currentCode, item -> {
            saveLanguage(item.getCode());
            dismiss();
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    private String getCurrentLangCode() {
        SharedPreferences prefs = requireContext().getSharedPreferences("prefs", Context.MODE_PRIVATE);
        return prefs.getString("lang", "en");
    }

    private void saveLanguage(String langCode) {
        SharedPreferences prefs = requireContext().getSharedPreferences("prefs", Context.MODE_PRIVATE);
        prefs.edit().putString("lang", langCode).apply();
        Toast.makeText(getContext(), "Language changed to " + langCode, Toast.LENGTH_SHORT).show();
    }
}

