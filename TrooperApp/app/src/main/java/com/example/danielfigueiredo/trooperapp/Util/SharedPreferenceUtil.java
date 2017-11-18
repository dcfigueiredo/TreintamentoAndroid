package com.example.danielfigueiredo.trooperapp.Util;

import android.content.SharedPreferences;

/**
 * Created by daniel.figueiredo on 18/11/2017.
 */

public class SharedPreferenceUtil {

    private SharedPreferences sharedPreferences;

    public SharedPreferenceUtil(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public String get(String key) {
        return this.sharedPreferences.getString(key, "");
    }

    public boolean hasValue(String key) {
        return this.sharedPreferences.contains(key);
    }

    public void save(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }
}
