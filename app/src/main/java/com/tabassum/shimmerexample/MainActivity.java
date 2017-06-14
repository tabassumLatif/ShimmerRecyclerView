package com.tabassum.shimmerexample;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;

import com.tabassum.shimmerRecyclerView.ShimmerRecyclerView;
import com.tabassum.shimmerexample.adapter.ImagesAdapter;
import com.tabassum.shimmerexample.utils.GridSpacingItemDecoration;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rvImages)
    ShimmerRecyclerView rvImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        rvImages.setLayoutManager(mLayoutManager);
        rvImages.addItemDecoration(new GridSpacingItemDecoration(3, dpToPx(10), false));
        rvImages.setItemAnimator(new DefaultItemAnimator());
        rvImages.setDrawingCacheEnabled(true);
        rvImages.setAdapter(new ImagesAdapter(this, getImage()));
        rvImages.showShimmerAdapter();

        rvImages.postDelayed(new Runnable() {
            @Override
            public void run() {
                rvImages.hideShimmerAdapter();
            }
        }, 2000);
    }

    private ArrayList<String> getImage(){
        ArrayList<String> images = new ArrayList<>();
        String image = "http://norwichnaturalbeauty.co.uk/wp-content/uploads/2011/11/naturalbeauty3.jpg";
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        images.add(image);
        return images;
    }

    private int dpToPx(int dp) {
        Resources resources = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.getDisplayMetrics()));
    }
}
