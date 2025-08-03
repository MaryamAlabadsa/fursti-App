package com.example.myapplication.model;

public class LanguageModel {
    private String name;
    private int flagResId;
    private boolean isSelected;

    public LanguageModel(String name, int flagResId, boolean isSelected) {
        this.name = name;
        this.flagResId = flagResId;
        this.isSelected = isSelected;
    }

    public String getName() {
        return name;
    }

    public int getFlagResId() {
        return flagResId;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
