package com.example.loubinfeng.smallproject;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by loubinfeng on 2017/7/18.
 */

public class SmallApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Small.preSetUp(this);
    }
}
