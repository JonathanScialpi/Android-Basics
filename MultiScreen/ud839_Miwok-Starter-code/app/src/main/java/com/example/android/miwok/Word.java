package com.example.android.miwok;

/**
 * Created by Jonathan Scialpi on 3/18/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;


    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }
}
