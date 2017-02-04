package com.babic.filip.flexibleadapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;

import io.reactivex.functions.Consumer;

/**
 * Created by Filip Babic @cobe
 */

/**
 * T is the type of an object we want to be able to listen through the setSubscription method
 **/
public interface FlexibleHolder<T> {

    /**
     * @return the layout we need to inflate in each item
     **/
    @LayoutRes
    int getLayout();

    /**
     * @param rootView the View we inflated, ready to display
     **/
    void displayView(@NonNull View rootView);

    /**
     * @param observable the listener for an event, usually we define it
     *                   in a presenter, so we can handle data
     **/
    void setSubscription(Consumer<T> observable);
}
