package com.babic.filip.flexible_adapter.model;

/**
 * Created by Filip Babic @cobe
 */

public class ArticleModel {

    private final String publicationName;
    private final String newsTitle;
    private final String newsImagePath;

    public ArticleModel(String newsImagePath, String newsTitle, String publicationName) {
        this.newsImagePath = newsImagePath;
        this.newsTitle = newsTitle;
        this.publicationName = publicationName;
    }

    public String getNewsImagePath() {
        return newsImagePath;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getPublicationName() {
        return publicationName;
    }
}
