package com.example.myapplication.conts;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefsHelper {
    private static final String PREF_NAME = "language_pref";
    private static final String KEY_SELECTED_LANGUAGE = "selected_language";

    private SharedPreferences prefs;

    public PrefsHelper(Context context) {
        prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void saveSelectedLanguage(String language) {
        prefs.edit().putString(KEY_SELECTED_LANGUAGE, language).apply();
    }

    public String getSelectedLanguage() {
        return prefs.getString(KEY_SELECTED_LANGUAGE, null);
    }
}

