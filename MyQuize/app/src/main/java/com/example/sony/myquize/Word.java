package com.example.sony.myquize;

/**
 * Created by SONY on 24-03-2018.
 */

public class Word {
      private String mDefaultTranslation;
    private String mMiwokTranslation;
    public Word(String defaultTranslation, String miwokTranslation) {
              mDefaultTranslation = defaultTranslation;
                mMiwokTranslation = miwokTranslation;

            }

    public String getDefaultTranslation() {
               return mDefaultTranslation;

           }
    public String getMiwokTranslation() {
                return mMiwokTranslation;
            }
}
