package com.example.myapplication;

public class LanguageItem {
    private final String name;
    private final String code;
    private final int flagResId;

    public LanguageItem(String name, String code, int flagResId) {
        this.name = name;
        this.code = code;
        this.flagResId = flagResId;
    }

    public String getName() { return name; }
    public String getCode() { return code; }
    public int getFlagResId() { return flagResId; }
}
