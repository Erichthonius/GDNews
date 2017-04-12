package com.example.lenovo.gdnews.Adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.lenovo.gdnews.bean.News;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by lenovo on 2017/2/18 0018.
 */

public class NewsAdapter extends RecyclerArrayAdapter<News> {
    public NewsAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {

        return new NewsViewHolder(parent);
    }
}

