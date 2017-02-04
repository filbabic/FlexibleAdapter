package com.babic.filip.flexible_adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.babic.filip.flexibleadapter.FlexibleHolder;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Filip Babic @cobe
 */

public class TextViewHolder implements FlexibleHolder<String> {

    private TextView textView;

    private String textToDisplay;

    private Consumer<String> clickListener;

    public TextViewHolder(String textToDisplay) {
        this.textToDisplay = textToDisplay;
    }

    @Override
    public int getLayout() {
        return R.layout.text_view_item;
    }

    @Override
    public void displayView(@NonNull View rootView) {
        textView = (TextView) rootView.findViewById(R.id.text_view);

        textView.setText(textToDisplay);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Single.just(textToDisplay)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(clickListener);
            }
        });
    }

    @Override
    public void setSubscription(Consumer<String> observable) {
        clickListener = observable;
    }
}
