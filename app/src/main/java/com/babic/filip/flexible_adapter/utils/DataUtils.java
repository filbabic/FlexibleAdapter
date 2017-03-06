package com.babic.filip.flexible_adapter.utils;

import com.babic.filip.flexible_adapter.holders.CardHolder;
import com.babic.filip.flexible_adapter.holders.ClothesHolder;
import com.babic.filip.flexible_adapter.holders.NewsHolder;
import com.babic.filip.flexible_adapter.model.ArticleModel;
import com.babic.filip.flexible_adapter.model.ClothesItemModel;
import com.babic.filip.flexible_adapter.model.CreditCardModel;
import com.babic.filip.flexible_adapter.model.NewsItemModel;
import com.babic.filip.flexibleadapter.FlexibleHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Filip Babic @cobe
 */

public class DataUtils {

    public static List<FlexibleHolder> getDataSource() {
        List<FlexibleHolder> dataSource = new ArrayList<>();

        ArticleModel articleModel = new ArticleModel("http://www.metserve.com/wp-content/uploads/2015/01/4716126_orig.jpg", "Shocking : Android and iOS claim both platforms are good, and are in fact in love with eachother.", "Totally legit News");
        NewsItemModel newsModel = new NewsItemModel(articleModel, 502, 1337);
        dataSource.add(new NewsHolder(newsModel));

        CreditCardModel cardModel = new CreditCardModel("BestestBankEver", "1234 5678 9876 5432", "Valid until 05/99", "Bat Man");
        dataSource.add(new CardHolder(cardModel));

        ClothesItemModel clothesModel = new ClothesItemModel(349, "Programming t-shirt", "http://static3.businessinsider.com/image/5743536e9105844d018c47f1-450-338/code-repeat-t-shirt.png");
        dataSource.add(new ClothesHolder(clothesModel));

        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));
        dataSource.add(new NewsHolder(newsModel));
        dataSource.add(new ClothesHolder(clothesModel));
        dataSource.add(new CardHolder(cardModel));

        return dataSource;
    }
}
