package com.example.naduniranasinghe.androidappmodelpaoer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    public DBHandler(Context context){
        super(context,"user_db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String createQuery = "CREATE TABLE "+UserProfile.Users.TABLE_NAME+"";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
