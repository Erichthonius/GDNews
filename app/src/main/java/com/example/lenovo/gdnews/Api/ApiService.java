package com.example.lenovo.gdnews.Api;

import com.example.lenovo.gdnews.gson.MeiNvGson;
import com.example.lenovo.gdnews.gson.NewsGson;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by lenovo on 2017/2/18 0018.
 */

public interface ApiService {
//    @GET("social/")
//    Observable<String> getString(@Query("key")String key, @Query("num") String num, @Query("page") int page);

    @GET("tiyu/")
    Observable <NewsGson> getNewsData(@Query("key")String key, @Query("num") String num, @Query("page") int page);

    @GET("meinv/")
    Observable <MeiNvGson> getPictureData(@Query("key")String key, @Query("num") String num, @Query("page") int page);
}

