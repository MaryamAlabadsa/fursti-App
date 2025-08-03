package com.example.myapplication.fragments;

import static com.example.myapplication.conts.contsMethod.showLoginBottomSheet;

import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHelpFeedbackBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class HelpFeedbackFragment extends Fragment {

    private FragmentHelpFeedbackBinding binding;
    private List<Uri> imageUris = new ArrayList<>();

    private ActivityResultLauncher<String> pickImagesLauncher;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHelpFeedbackBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.topAppBar.setNavigationOnClickListener(v -> requireActivity().onBackPressed());

        pickImagesLauncher = registerForActivityResult(new ActivityResultContracts.GetMultipleContents(),
                uris -> {
                    if (uris.size() + imageUris.size() <= 5) {
                        Toast.makeText(requireContext(), "You can only upload up to 5 files", Toast.LENGTH_SHORT).show();
                    } else {
                        imageUris.addAll(uris);
                        // TODO: عرض الصور داخل RecyclerView مثلاً
                    }
                });

        binding.imageUploadArea.setOnClickListener(v -> pickImagesLauncher.launch("image/*"));

        binding.btnSend.setOnClickListener(v -> {
            if (validateInputs()) {
//                Toast.makeText(requireContext(), "Submitting feedback...", Toast.LENGTH_SHORT).show();
               showLoginBottomSheet(getContext());
            }
        });
    }

    private boolean validateInputs() {
        String name = binding.etFullName.getText().toString().trim();
        String email = binding.etEmail.getText().toString().trim();
        String subject = binding.etSubject.getText().toString().trim();
        String details = binding.etDetails.getText().toString().trim();

        if (name.isEmpty()) {
            binding.etFullName.setError("Please enter your full name");
            return false;
        }

        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.etEmail.setError("Enter a valid email");
            return false;
        }

        if (subject.isEmpty()) {
            binding.etSubject.setError("Subject is required");
            return false;
        }

        if (details.isEmpty()) {
            binding.etDetails.setError("Please provide more details");
            return false;
        }

        return true;
    }
}
