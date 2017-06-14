# ShimmerRecyclerView
Shimmer effect in RecyclerView

# Download

Or use Gradle:

```
repositories {
  maven { url 'https://jitpack.io' }
}

dependencies {
  compile 'com.android.support:support-v4:25.3.1'
  compile 'com.github.tabassumLatif:ShimmerRecyclerView:0.1.0'
}
```

# How do I use ShimmerRecyclerView

Simple use cases with ShimmerRecyclerView's generated API will look something like this:
```
 <com.tabassum.shimmerRecyclerView.ShimmerRecyclerView
        android:id="@+id/rvImages"
        android:background="#ffffff"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:demo_layout="@layout/item_image_shimmer_view"
        app:demo_layout_manager_type="grid"/>
        
```

item_image_shimmer_view.xml

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="5dp">

    <View
        android:layout_width="match_parent"
        android:layout_height="140dp"
        android:background="#b4b4b4" />

</LinearLayout>
```
