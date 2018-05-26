package com.rajanapps.sscenglish;

public class Words {
    private String mWord;
    private String mEngMeaning;
    private String mHindiMeaning;
    //private int mMemeResId;
    //constructor
    Words(String mWord,String mEngMeaning,String mHindiMeaning){
        this.mWord = mWord;
        this.mEngMeaning = mEngMeaning;
        this.mHindiMeaning = mHindiMeaning;
    }
    /**
     * @return mWord
     */
    public String getmWord(){
        return mWord;
    }
    /**\
     * @return mEngMeaning
     */
    public String getmEngMeaning() {
        return mEngMeaning;
    }
    /**
     * @return mHindiMeaning
     */
    public String getmHindiMeaning() {
        return mHindiMeaning;
    }
}
