package com.example.gustavemugabo.kinya;

import android.media.MediaPlayer;

/**
 * Created by gustavemugabo on 1/19/17.
 */

public class Word {

    private static int HAS_IMAGE = -1;
    private String kinyaVersion;
    private String englishVersion;
    private MediaPlayer audioPrononciation;
    private int drwableImageVersion = HAS_IMAGE;
    private int audiResourceId;


    public Word(String kinya, String english, int imagesDrawable, int audiResourceID) {

        this.kinyaVersion = kinya;
        this.englishVersion = english;
        this.drwableImageVersion = imagesDrawable;
        this.audiResourceId = audiResourceID;
//        this.audioPrononciation = MediaPlayer.create(get,songResourceId);
    }

    public Word(String kinya, String english, int imagesDrawable) {

        this.kinyaVersion = kinya;
        this.englishVersion = english;
        this.drwableImageVersion = imagesDrawable;
    }


    public Word(String kinya, String english) {

        this.kinyaVersion = kinya;
        this.englishVersion = english;
    }

    public String getKinyaVersion() {
        return kinyaVersion;
    }

    public void setKinyaVersion(String kinyaVersion) {
        this.kinyaVersion = kinyaVersion;
    }

    public String getEnglishVersion() {
        return englishVersion;
    }

    public void setEnglishVersion(String englishVersion) {
        this.englishVersion = englishVersion;
    }

    public int getDrwableImageVersion() {
        return drwableImageVersion;
    }

    public void setDrwableImageVersion(int drwableImageVersion) {
        this.drwableImageVersion = drwableImageVersion;
    }

    public int getAudiResourceId() {
        return audiResourceId;
    }

    public void setAudiResourceId(int audiResourceId) {
        this.audiResourceId = audiResourceId;
    }

    public boolean hasImage() {

        return HAS_IMAGE != drwableImageVersion;
    }
}
