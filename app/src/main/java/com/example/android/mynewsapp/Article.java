package com.example.android.mynewsapp;

public class Article {

//    TIME OF ARTICLE
    private long mTimeInMilliseconds;

    // LOCATION
    private String mArticle;

    private String mUrl;

    //   CREATING A EARTHQUAKE OBJECT
    public Article(String webTitle, long time, String url)
    {
//        mArticle = vArticle;
//        mTimeInMilliseconds = vDate;
        mUrl = url;
    }

    //   GETS THE ARTICLE
    public String getArticle() {
        return mArticle;
    }

    //   GETS THE DATE
    public long getDate() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
