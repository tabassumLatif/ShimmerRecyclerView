package com.tabassum.shimmerexample.adapter;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.tabassum.shimmerexample.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.MyViewHolder> {
    private ArrayList<String> images;
    Context context;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imgPostImage)
        AppCompatImageView imgPostImage;


        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public ImagesAdapter(Context context, ArrayList<String> drawerItems) {
        this.images = drawerItems;
        this.context = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_image, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
            Glide.with(context).load(images.get(position))
                    .asBitmap().centerCrop()
                    .placeholder(R.drawable.img_placeholder)
                    .into(holder.imgPostImage);
    }


    @Override
    public int getItemCount() {
        if (images == null) {
            return 0;
        }
        return images.size();
    }



}
