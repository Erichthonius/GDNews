package com.example.lenovo.gdnews.Adapter;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.example.lenovo.gdnews.bean.MeiNV;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by lenovo on 2017/2/19 0019.
 */
public class ImageViewHolder extends BaseViewHolder<MeiNV> {
    ImageView imgPicture;

    public ImageViewHolder(ViewGroup parent) {
        super(new ImageView(parent.getContext()));
        imgPicture = (ImageView) itemView;
        imgPicture.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imgPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);
//        super(parent,R.layout.item_person);
//        imgPicture = $(R.id.person_face);

    }

    @Override
    public void setData(MeiNV data) {
        // final ViewGroup.LayoutParams params = imgPicture.getLayoutParams();
        final DisplayMetrics dm = getContext().getResources().getDisplayMetrics();
        Glide.with(getContext())
                .load(data.getPicUrl())
                .asBitmap()
                .into(new SimpleTarget<Bitmap>(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL) {
                          @Override
                          public void onResourceReady(Bitmap bitmap, GlideAnimation glideAnimation) {
                              int width = dm.widthPixels / 2 - 10;//宽度为屏幕宽度一半
                              int height = bitmap.getHeight() * width / bitmap.getWidth();//计算View的高度
                              //获取bitmap信息，可赋值给外部变量操作，也可在此时行操作。
                              ViewGroup.LayoutParams params = imgPicture.getLayoutParams();
                              params.height = height;
                              params.width = width;
                              imgPicture.setLayoutParams(params);
                              imgPicture.setScaleType(ImageView.ScaleType.FIT_XY);
                              imgPicture.setImageBitmap(bitmap);

                          }
                      }
                );
        Log.d("sss2",data.getPicUrl());
    }
}