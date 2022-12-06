package com.laioffer.tinnews;

import android.app.Application;
import android.util.Log;

public class TinNewsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // TODO: new code here.
        Log.d("Application", "onCreate");
    }
}
