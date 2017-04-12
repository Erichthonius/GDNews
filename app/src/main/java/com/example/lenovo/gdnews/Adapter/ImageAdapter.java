package com.example.lenovo.gdnews.Adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.lenovo.gdnews.bean.MeiNV;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by lenovo on 2017/2/19 0019.
 */

public class ImageAdapter extends RecyclerArrayAdapter<MeiNV> {
    public ImageAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageViewHolder(parent);
    }
}
