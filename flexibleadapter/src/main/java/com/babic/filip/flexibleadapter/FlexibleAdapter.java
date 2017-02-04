package com.babic.filip.flexibleadapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Filip Babic @cobe
 */

/**
 * This class represents a flexible, extensible, generic implementation of an adapter
 * for a RecyclerView. The way it's meant to be used is by having your own implementation
 * of FlexibleHolder items, that provide a layout and a way to display data within itself.
 * If any extra behaviour is needed, simply extend FlexibleHolder and add additional methods
 * for handling various use-cases and events, while also adding behaviour to the adapter.
 **/
public class FlexibleAdapter<T extends FlexibleHolder> extends RecyclerView.Adapter<FlexibleViewHolder> {

    /**
     * a list of instances(or subclasses) of FlexibleHolders
     * since these all extends from FH, we have access to the base methods
     * final here assures null-safety
     **/
    protected final List<T> flexibleItems = new ArrayList<>();

    /**
     * @param parent   the root parent group, use it's context for view inflating
     * @param viewType this represents the LAYOUT RESOURCE we need to inflate
     * @return a basic ViewHolder with inflated view as it's root
     **/
    @Override
    public FlexibleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FlexibleViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false));
    }

    /**
     * @param holder   the default ViewHolder, it's just passes root view to the item
     * @param position current position of the holder in data set, use to to retrieve an item
     **/
    @Override
    public void onBindViewHolder(FlexibleViewHolder holder, int position) {
        if (holder != null && getItem(position) != null) {
            holder.handleItem(getItem(position));
        }
    }

    /**
     * @param position the current item position(in adapter data set)
     * @return the layout resource to inflate for the said item
     * default layout here is just a transparent item divider
     **/
    @Override
    public int getItemViewType(int position) {
        return getItem(position) != null ? getItem(position).getLayout() : R.layout.default_layout;
    }

    @Override
    public int getItemCount() {
        return flexibleItems.size();
    }

    /**
     * @param position position in the adapter data set
     * @return the item for the position within lists's range, or null
     **/
    public T getItem(int position) {
        return position < flexibleItems.size() ? flexibleItems.get(position) : null;
    }

    /**
     * @param dataSource the new data source we want to set
     **/
    public void setItems(List<T> dataSource) {
        if (dataSource != null && !dataSource.isEmpty()) {
            flexibleItems.clear();
            flexibleItems.addAll(dataSource);
            notifyDataSetChanged();
        }
    }

    /** @param dataSource the new items we want to add **/
    public void addItems(List<T> dataSource) {
        if (dataSource != null && !dataSource.isEmpty()) {
            flexibleItems.addAll(dataSource);
            notifyDataSetChanged();
        }
    }
}
