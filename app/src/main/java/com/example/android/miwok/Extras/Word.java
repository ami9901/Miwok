package com.example.android.miwok.Extras;

import android.media.MediaPlayer;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mediaPlayerId;

    public Word(String mDefaultTranslation, String mMiwokTranslation,int mediaPlayerId){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
        this.mediaPlayerId=mediaPlayerId;
    }
    public Word(String mDefaultTranslation,String mMiwokTranslation,int ImageResourceId,int mediaPlayerId){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
        mImageResourceId=ImageResourceId;
        this.mediaPlayerId=mediaPlayerId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){ return mImageResourceId;}
    public int getMediaPlayerId(){ return mediaPlayerId;}
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
        //checks if image is provided or not; if != return true i.e image is provided
    }
}
