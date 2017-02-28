package com.babic.filip.flexible_adapter.model;

/**
 * Created by Filip Babic @cobe
 */

public class NewsItemModel {

    private final ArticleModel articleModel;
    private int numberOfRecommends;
    private int numberOfComments;

    public NewsItemModel(ArticleModel articleModel,  int numberOfComments, int numberOfRecommends) {
        this.articleModel = articleModel;
        this.numberOfComments = numberOfComments;
        this.numberOfRecommends = numberOfRecommends;
    }

    public ArticleModel getArticleModel() {
        return articleModel;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public int getNumberOfRecommends() {
        return numberOfRecommends;
    }

    public void setNumberOfRecommends(int numberOfRecommends) {
        this.numberOfRecommends = numberOfRecommends;
    }
}
