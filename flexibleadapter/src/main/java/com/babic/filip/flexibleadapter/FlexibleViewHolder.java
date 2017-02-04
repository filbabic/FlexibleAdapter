package com.babic.filip.flexibleadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Filip Babic @cobe
 */

public class FlexibleViewHolder extends RecyclerView.ViewHolder {

    /**
     * just call super(View) to bind the view to this holder instance
     **/
    public FlexibleViewHolder(View itemView) {
        super(itemView);
    }
    /**
     * @param item list item that handles view display
     * itemView is the root inflated View to which we bind
     **/
    public void handleItem(@NonNull FlexibleHolder item) {
        item.displayView(itemView);
    }
}
