package com.tabassum.shimmerRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


/**
 * Created by Tabassum on 6/6/2017.
 */

public class ShimmerAdapter extends RecyclerView.Adapter<ShimmerViewHolder> {
    public  ShimmerAdapter(int layoutReference){
        mLayoutReference = layoutReference;
    }
    private int mItemCount = 10;
    private int mLayoutReference;


    public void setMinItemCount(int itemCount) {
        mItemCount = itemCount;
    }

    @Override
    public ShimmerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ShimmerViewHolder(inflater, parent, mLayoutReference);
    }

    @Override
    public void onBindViewHolder(ShimmerViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return mItemCount;
    }

    public void setLayoutReference(int layoutReference) {
        this.mLayoutReference = layoutReference;
    }
}