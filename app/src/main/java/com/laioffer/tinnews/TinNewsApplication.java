package com.laioffer.tinnews;

import android.app.Application;
import android.util.Log;

import androidx.room.Room;

import com.laioffer.tinnews.database.TinNewsDatabase;

public class TinNewsApplication extends Application {
    private static TinNewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Application", "onCreate");
        database = Room.databaseBuilder(this, TinNewsDatabase.class, "tinnews_db").build();
    }

    public static TinNewsDatabase getDatabase() {
        return database;
    }
}
