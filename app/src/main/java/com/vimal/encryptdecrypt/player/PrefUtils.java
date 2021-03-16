/**
 * Created by Vimal Mar-2021.
 */
package com.vimal.encryptdecrypt.player;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import static com.vimal.encryptdecrypt.utils.Constants.SECRET_KEY;


public class PrefUtils {

    public static final PrefUtils prefUtils = new PrefUtils();
    public static SharedPreferences myPrefs = null;

    public static PrefUtils getInstance(Context context) {
        if (null == myPrefs)
            myPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefUtils;
    }

    public void saveSecretKey(String value) {
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString(SECRET_KEY, value);
        editor.commit();
    }

    public String getSecretKey( ) {
        return myPrefs.getString(SECRET_KEY, null);
    }
}
