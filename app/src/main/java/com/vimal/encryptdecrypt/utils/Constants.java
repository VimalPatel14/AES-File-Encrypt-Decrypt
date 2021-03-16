/**
 * Created by Vimal Mar-2021.
 */
package com.vimal.encryptdecrypt.utils;

import android.os.Environment;


public class Constants {

    // Files
    public static final String DOWNLOAD_AUDIO_URL = "http://www.noiseaddicts.com/samples_1w72b820/272.mp3";
    public static final String FILE_NAME = "vimaldownloadaudio.vimal";
    public static final String TEMP_FILE_NAME = "vilsdecrypt";
    public static final String FILE_EXT = ".mp3";
    public static final String DIR_NAME = Environment.getExternalStorageDirectory() + "/testvmlaudio/VimalAudio";
    //    public static final String DIR_NAME = "Audio";
    public static final int OUTPUT_KEY_LENGTH = 256;
    // Algorithm
    public static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final String KEY_SPEC_ALGORITHM = "AES";
    public static final String PROVIDER = "BC";
    public static final String SECRET_KEY = "SECRET_KEY";
}
