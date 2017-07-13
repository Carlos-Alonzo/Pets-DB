package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Carlos on 7/13/2017.
 */

public final class PetsDBHelper extends SQLiteOpenHelper {

    //DB constants for db name and version
    public static final String DB_NAME="pets.db";
    public static final int DB_VERSION=1;

    public PetsDBHelper() {

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
