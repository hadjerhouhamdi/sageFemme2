package com.example.sagefemme;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class PreferencesHelper {

    private static final String PREFS_NAME = "PlanningChecklistPrefs";

    public static void saveCheckedItems(Context context, String key, Set<String> checkedItems) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putStringSet(key, new HashSet<>(checkedItems));
        editor.apply();
    }

    public static Set<String> loadCheckedItems(Context context, String key) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getStringSet(key, new HashSet<>());
    }
}
