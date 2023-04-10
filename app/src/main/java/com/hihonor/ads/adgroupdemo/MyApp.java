package com.hihonor.ads.adgroupdemo;

import android.app.Application;

import com.hihonor.ads.adgroupdemo.config.TTAdManagerHolder;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TTAdManagerHolder.init(this);
    }
}
