package com.babic.filip.flexible_adapter.model;

/**
 * Created by Filip Babic @cobe
 */

public class ClothesItemModel {

    private final String itemTitle;
    private final int itemCost;
    private final String itemImagePath;

    public ClothesItemModel(int itemCost, String itemTitle, String itemImagePath) {
        this.itemCost = itemCost;
        this.itemTitle = itemTitle;
        this.itemImagePath = itemImagePath;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String getItemImagePath() {
        return itemImagePath;
    }

    public String getItemTitle() {
        return itemTitle;
    }
}
