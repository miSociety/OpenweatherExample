package net.misociety.example.openweatherexample.common;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by jaesunlee on 2017. 6. 9..
 * BindingAdapter
 */

public class BindingAdapter
{
    @android.databinding.BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView, String url)
    {
        Glide.with(imageView.getContext())
                .setDefaultRequestOptions(RequestOptions
                        .circleCropTransform()
                        .skipMemoryCache(true)
                        .centerCrop())
                .load(url)
                .into(imageView);
    }
}
