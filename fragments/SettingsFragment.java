package com.example.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.BottomSheet.PolicyBottomSheet;
import com.example.myapplication.NotificationSettingsBottomSheet;
import com.example.myapplication.R;
import com.example.myapplication.adapter.LanguageAdapter;
import com.example.myapplication.conts.PrefsHelper;
import com.example.myapplication.databinding.FragmentSettingsBinding;
import com.example.myapplication.databinding.ItemSettingOptionBinding;
import com.example.myapplication.model.LanguageModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class SettingsFragment extends Fragment {

    private FragmentSettingsBinding binding;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setupSettingOption(binding.itemJobPreference.getRoot(), R.drawable.ic_flag, "Job Preference Country");
        setupSettingOption(binding.itemFaqs.getRoot(), R.drawable.ic_question, "FAQs");
        setupSettingOption(binding.itemHelpFeedback.getRoot(), R.drawable.ic_help, "Help & Feedback");
        setupSettingOption(binding.itemPrivacyPolicy.getRoot(), R.drawable.ic_privacy, "Privacy Policy");
        setupSettingOption(binding.itemLanguagePreference.getRoot(), R.drawable.ic_language, "Language Preference");
        setupSettingOption(binding.itemNotificationSetting.getRoot(), R.drawable.ic_notification, "Notification Settings");

        // Add onClick listeners
        binding.itemNotificationSetting.getRoot().setOnClickListener(v -> {
            showNotificationBottomSheet();
        });
        binding.itemHelpFeedback.getRoot().setOnClickListener(v -> {
            FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, new HelpFeedbackFragment());
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.itemLanguagePreference.getRoot().setOnClickListener(v -> {
            showLanguageBottomSheet();
        });

        binding.itemFaqs.getRoot().setOnClickListener(v -> {
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new FaqsFragment()) // غيّر R.id.fragment_container حسب الـ id الحقيقي
                    .addToBackStack(null)
                    .commit();
        });
        binding.itemNotificationSetting.getRoot().setOnClickListener(v -> {
            NotificationSettingsBottomSheet bottomSheet = new NotificationSettingsBottomSheet();
            bottomSheet.show(requireActivity().getSupportFragmentManager(), bottomSheet.getTag());

        });
        binding.itemPrivacyPolicy.getRoot().setOnClickListener(v -> {
            PolicyBottomSheet sheet = new PolicyBottomSheet();
            sheet.show(requireActivity().getSupportFragmentManager(), sheet.getTag());

        });

    }
    private void showLanguageBottomSheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext());
        View sheetView = LayoutInflater.from(requireContext()).inflate(R.layout.bottom_sheet_language, null);
        bottomSheetDialog.setContentView(sheetView);

        RecyclerView recyclerView = sheetView.findViewById(R.id.recyclerLanguages);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        // استرجاع اللغة المحفوظة
        PrefsHelper prefsHelper = new PrefsHelper(requireContext());
        String savedLang = prefsHelper.getSelectedLanguage();

        // البيانات
        List<LanguageModel> languages = new ArrayList<>();
        languages.add(new LanguageModel("العربية", R.drawable.ic_ar, "ar".equals(savedLang)));
        languages.add(new LanguageModel("English", R.drawable.ic_en, "en".equals(savedLang)));
        // أضف المزيد حسب الحاجة

        LanguageAdapter adapter = new LanguageAdapter(languages, selectedLanguage -> {
            prefsHelper.saveSelectedLanguage(selectedLanguage.getName().equals("العربية") ? "ar" : "en");
            Toast.makeText(requireContext(), "Selected: " + selectedLanguage.getName(), Toast.LENGTH_SHORT).show();
            bottomSheetDialog.dismiss();
        });

        recyclerView.setAdapter(adapter);
        bottomSheetDialog.show();
    }

    private void setupSettingOption(View settingView, int iconRes, String title) {
        ItemSettingOptionBinding optionBinding = ItemSettingOptionBinding.bind(settingView);
        optionBinding.settingIcon.setImageResource(iconRes);
        optionBinding.settingTitle.setText(title);
    }
    public void showNotificationBottomSheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getContext());
        View sheetView = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheet_notification_settings, null);
        bottomSheetDialog.setContentView(sheetView);
        bottomSheetDialog.show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
