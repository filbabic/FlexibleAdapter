package com.babic.filip.flexible_adapter.holders;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.babic.filip.flexible_adapter.R;
import com.babic.filip.flexible_adapter.model.NewsItemModel;
import com.babic.filip.flexibleadapter.FlexibleHolder;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Filip Babic @cobe
 */

public class NewsHolder implements FlexibleHolder {

    @BindView(R.id.image_item)
    ImageView articleImage;

    @BindView(R.id.article_publication)
    TextView articlePublication;

    @BindView(R.id.article_title)
    TextView articleTitle;

    @BindView(R.id.number_recommends)
    TextView numberOfRecommends;

    @BindView(R.id.number_comments)
    TextView numberOfComments;

    private final NewsItemModel newsItem;

    public NewsHolder(NewsItemModel newsItem) {
        this.newsItem = newsItem;
    }

    @Override
    public int getLayout() {
        return R.layout.news_item_layout;
    }

    @Override
    public void displayView(@NonNull View rootView) {
        ButterKnife.bind(this, rootView);

        Glide.with(rootView.getContext()).load(newsItem.getArticleModel().getNewsImagePath()).into(articleImage);

        articlePublication.setText(newsItem.getArticleModel().getPublicationName());
        articleTitle.setText(newsItem.getArticleModel().getNewsTitle());
        numberOfComments.setText(String.valueOf(newsItem.getNumberOfComments()));
        numberOfRecommends.setText(String.valueOf(newsItem.getNumberOfRecommends()));
    }
}
