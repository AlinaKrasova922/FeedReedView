package com.example.alina.feedreedview.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Profile {
    public static final String ID = "com.mobile.campuspal.ID";
    public static final String VALUE = "com.mobile.campuspal.VALUE";
    public static final String EXPIRY = "com.mobile.campuspal.EXPIRY";
    public static final String ACCESS_TOKEN = "com.mobile.campuspal.ACCESS_TOKEN";
    public static final String EMAIL = "com.mobile.campuspal.EMAIL";
    public static final String PHOTO_ORIG = "com.mobile.campuspal.PHOTO_ORIG";
    public static final String LOGGED_IN = "com.mobile.campuspal.LOGGED_IN";
    public static final String PASSWORD = "com.mobile.campuspal.PASSWORD";
    public SharedPreferences prefs;

    public Profile(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
    }

    public int getId() {
        return prefs.getInt(ID, -1);
    }

    public void setId(int id) {
        prefs.edit().putInt(ID, id).apply();
    }

    public void setValue(String value) {
        prefs.edit().putString(VALUE, value).apply();
    }

    public String getFirstName() {
        return prefs.getString(VALUE, "");
    }

    public String getExpiry() {
        return prefs.getString(EXPIRY, "");
    }

    public void setExpiry(String expiry) {
        prefs.edit().putString(EXPIRY, expiry).apply();
    }

    public String getAccessToken() {
        return prefs.getString(ACCESS_TOKEN, "");
    }

    public void setAccessToken(String accessToken) {
        prefs.edit().putString(ACCESS_TOKEN, accessToken).apply();
    }

    public String getEmail() {
        return prefs.getString(EMAIL, "");
    }

    public void setEmail(String email) {
        prefs.edit().putString(EMAIL, email).apply();
    }

    public String getPhotoOrig() {
        return prefs.getString(PHOTO_ORIG, "");
    }

    public void setPhotoOrig(String photoOrig) {
        prefs.edit().putString(PHOTO_ORIG, photoOrig).apply();
    }

    public String getPassword() {
        return prefs.getString(PASSWORD, "");
    }

    public void setPassword(String password) {
        prefs.edit().putString(PASSWORD, password).apply();
    }

}
