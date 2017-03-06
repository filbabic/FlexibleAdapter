package com.babic.filip.flexible_adapter.holders;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.babic.filip.flexible_adapter.R;
import com.babic.filip.flexible_adapter.model.ClothesItemModel;
import com.babic.filip.flexibleadapter.FlexibleHolder;
import com.bumptech.glide.Glide;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Filip Babic @cobe
 */

public class ClothesHolder implements FlexibleHolder {

    @BindView(R.id.text_title)
    TextView itemTitle;

    @BindView(R.id.text_cost)
    TextView itemCost;

    @BindView(R.id.image_item)
    ImageView itemImage;

    private final ClothesItemModel clothesModel;
    private Unbinder unbinder;

    public ClothesHolder(ClothesItemModel clothesModel) {
        this.clothesModel = clothesModel;
    }

    @Override
    public int getLayout() {
        return R.layout.clothes_item_layout;
    }

    @Override
    public void displayView(@NonNull View rootView) {
        unbinder = ButterKnife.bind(this, rootView);

        itemTitle.setText(clothesModel.getItemTitle());
        itemCost.setText(String.format(Locale.getDefault(), "%d$", clothesModel.getItemCost()));
        Glide.with(rootView.getContext()).load(clothesModel.getItemImagePath()).into(itemImage);
    }

    @Override
    public void recycle() {
        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
