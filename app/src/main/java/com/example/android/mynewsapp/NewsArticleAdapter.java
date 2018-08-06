package com.example.android.mynewsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsArticleAdapter extends ArrayAdapter<Article> {

    NewsArticleAdapter(Activity context, ArrayList<Article> earth) {
        super(context, 0, earth);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        Article currentArticle = getItem(position);

        String originalArticle = currentArticle.getArticle();

        TextView webTitleView = (TextView) listItemView.findViewById(R.id.web_title);

        webTitleView.setText(originalArticle);

        return listItemView;
}
}
