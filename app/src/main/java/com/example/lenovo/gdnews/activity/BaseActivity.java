package com.example.lenovo.gdnews.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by lenovo on 2017/2/18 0018.
 */

public class BaseActivity extends AppCompatActivity {
    String TAG=getClass().getSimpleName();
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.e(TAG,TAG+"创建");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,TAG+"销毁");

    }
}
