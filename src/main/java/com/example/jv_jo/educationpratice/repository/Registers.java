package com.example.jv_jo.educationpratice.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jv_jo on 03/04/2016.
 */
public class Registers extends SQLiteOpenHelper {

    private static final String HD_HOME = "Education Practice";
    private static final int HD_VERSION = 1;

    public Registers(Context context, String name, int version) {
        super(context, HD_HOME, null, HD_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
