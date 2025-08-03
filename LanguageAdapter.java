package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder> {

    private final List<LanguageItem> languageList;
    private String selectedCode;
    private final OnLanguageSelected listener;

    public interface OnLanguageSelected {
        void onSelected(LanguageItem item);
    }

    public LanguageAdapter(List<LanguageItem> languageList, String selectedCode, OnLanguageSelected listener) {
        this.languageList = languageList;
        this.selectedCode = selectedCode;
        this.listener = listener;
    }

    @NonNull
    @Override
    public LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_language, parent, false);
        return new LanguageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder holder, int position) {
        LanguageItem item = languageList.get(position);
        holder.tvLanguage.setText(item.getName());
        holder.imgFlag.setImageResource(item.getFlagResId());

        holder.imgCheck.setVisibility(item.getCode().equals(selectedCode) ? View.VISIBLE : View.GONE);

        holder.itemView.setOnClickListener(v -> {
            selectedCode = item.getCode();
            notifyDataSetChanged();
            listener.onSelected(item);
        });
    }

    @Override
    public int getItemCount() {
        return languageList.size();
    }

    static class LanguageViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFlag, imgCheck;
        TextView tvLanguage;

        LanguageViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFlag = itemView.findViewById(R.id.imgFlag);
            tvLanguage = itemView.findViewById(R.id.tvLanguage);
            imgCheck = itemView.findViewById(R.id.imgCheck);
        }
    }
}

