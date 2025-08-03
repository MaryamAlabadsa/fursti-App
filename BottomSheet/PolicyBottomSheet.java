package com.example.myapplication.BottomSheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.api.ApiClient;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.api.PolicyResponse;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PolicyBottomSheet extends BottomSheetDialogFragment {

    private TextView tvTitle, tvDescription;

    public PolicyBottomSheet() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_common, container, false);
        tvTitle = view.findViewById(R.id.titleTextView);
        tvDescription = view.findViewById(R.id.titleTextView);

        fetchPolicyData();

        return view;
    }

    private void fetchPolicyData() {
        ApiService api = ApiClient.getClient("").create(ApiService.class);
        Call<PolicyResponse> call = api.getPolicies();

        call.enqueue(new Callback<PolicyResponse>() {
            @Override
            public void onResponse(Call<PolicyResponse> call, Response<PolicyResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    PolicyResponse.Data data = response.body().getData();
                    tvTitle.setText(data.getTitle());
                    tvDescription.setText(data.getDescription());
                } else {
                    tvDescription.setText("فشل في التحميل");
                }
            }

            @Override
            public void onFailure(Call<PolicyResponse> call, Throwable t) {
                tvDescription.setText("خطأ في الاتصال");
                Toast.makeText(getContext(), "فشل الاتصال بالخادم", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
