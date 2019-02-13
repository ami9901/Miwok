package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String mDefaultTranslation,String mMiwokTranslation){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
    }
    public Word(String mDefaultTranslation,String mMiwokTranslation,int ImageResourceId){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
        mImageResourceId=ImageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){ return mImageResourceId;}
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;//checks if image is provided or not if != return true i.e image is provided
    }
}
