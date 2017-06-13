package com.tabassum.shimmerRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Tabassum on 6/6/2017.
 */

public class ShimmerViewHolder extends RecyclerView.ViewHolder {

    public ShimmerViewHolder(LayoutInflater inflater, ViewGroup parent, int innerViewResId) {
        super(inflater.inflate(R.layout.item_video_placeholder, parent, false));
        ShimmerFrameLayout layout = (ShimmerFrameLayout) itemView;

        View innerView = inflater.inflate(innerViewResId, layout, false);
        layout.addView(innerView);
        layout.setAutoStart(false);
    }

    /**
     * Binds the view
     */
    public void bind() {

        ShimmerFrameLayout layout = (ShimmerFrameLayout) itemView;
        layout.startShimmerAnimation();
    }
}