package com.babic.filip.flexibleadapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;

/**
 * Created by Filip Babic @cobe
 */

/**
 * T is the type of an object we want to be able to listen through the setSubscription method
 **/
public interface FlexibleHolder {

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
     * Use this method to trigger your recycle logic when needed,
     * a common example is to null out views, or unbind ButterKnife bound views,
     * stop requests(in case you have any) and similar.
     * **/
    void recycle();
}
