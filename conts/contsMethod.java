package com.example.myapplication.conts;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public   class contsMethod {
    public static void openShareBottomSheet(Context context, int jobId) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
        View sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_share, null);
        bottomSheetDialog.setContentView(sheetView);

        String shareText = "Check out this job opportunity: https://yourapp.com/jobs/" + jobId;

        // Gmail
        sheetView.findViewById(R.id.imageViewGmail).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // فقط لفتح Gmail
            intent.putExtra(Intent.EXTRA_SUBJECT, "Job Opportunity");
            intent.putExtra(Intent.EXTRA_TEXT, shareText);
           context. startActivity(Intent.createChooser(intent, "Send Email"));
            bottomSheetDialog.dismiss();
        });

        // Facebook
        sheetView.findViewById(R.id.imageViewFacebook).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String facebookShareUrl = "https://www.facebook.com/sharer/sharer.php?u=" +
                    Uri.encode("https://yourapp.com/jobs/" + jobId);
            intent.setData(Uri.parse(facebookShareUrl));
            context. startActivity(intent);
            bottomSheetDialog.dismiss();
        });

        // Messenger
        sheetView.findViewById(R.id.imageViewMessenger).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.setPackage("com.facebook.orca");
            intent.putExtra(Intent.EXTRA_TEXT, shareText);
            try {
                context. startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(context, "Messenger not installed", Toast.LENGTH_SHORT).show();
            }
            bottomSheetDialog.dismiss();
        });

        // WhatsApp
        sheetView.findViewById(R.id.imageViewWhatsapp).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.setPackage("com.whatsapp");
            intent.putExtra(Intent.EXTRA_TEXT, shareText);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(context, "WhatsApp not installed", Toast.LENGTH_SHORT).show();
            }
            bottomSheetDialog.dismiss();
        });

        bottomSheetDialog.show();
    }
    public static void showLoginBottomSheet(Context context) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
        View sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_login_signup, null);
        bottomSheetDialog.setContentView(sheetView);
        bottomSheetDialog.show();
    }


}
