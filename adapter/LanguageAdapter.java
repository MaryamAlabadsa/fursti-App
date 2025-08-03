package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.LanguageModel;

import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder> {

    public interface OnLanguageSelectedListener {
        void onSelected(LanguageModel language);
    }

    private List<LanguageModel> languages;
    private OnLanguageSelectedListener listener;

    public LanguageAdapter(List<LanguageModel> languages, OnLanguageSelectedListener listener) {
        this.languages = languages;
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
        LanguageModel language = languages.get(position);
        holder.tvLanguage.setText(language.getName());
        holder.imgFlag.setImageResource(language.getFlagResId());
        holder.imgCheck.setVisibility(language.isSelected() ? View.VISIBLE : View.GONE);

        holder.itemView.setOnClickListener(v -> {
            for (LanguageModel lang : languages) {
                lang.setSelected(false);
            }
            language.setSelected(true);
            notifyDataSetChanged();
            listener.onSelected(language);
        });
    }

    @Override
    public int getItemCount() {
        return languages.size();
    }

    static class LanguageViewHolder extends RecyclerView.ViewHolder {
        TextView tvLanguage;
        ImageView imgFlag, imgCheck;

        public LanguageViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLanguage = itemView.findViewById(R.id.tvLanguage);
            imgFlag = itemView.findViewById(R.id.imgFlag);
            imgCheck = itemView.findViewById(R.id.imgCheck);
        }
    }
}

