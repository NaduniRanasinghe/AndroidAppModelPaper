package com.example.naduniranasinghe.androidappmodelpaoer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHandler extends SQLiteOpenHelper {

    public DBHandler(Context context){
        super(context,"user_db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String createQuery = "CREATE TABLE "+UserProfile.Users.TABLE_NAME+"("+UserProfile.Users.COL_ID+
                "INTEGER PRIMARY KEY AUTOINCREMENT ,"+UserProfile.Users.COL_USERNAME+"TEXT UNIQUE,"+
                UserProfile.Users.COL_PASSWORD+"TEXT,"+UserProfile.Users.COL_GENDER+"TEXT"+UserProfile.Users.COL_DOB+"TEXT"+")";

        Log.d("createQuery",createQuery);

        try{
            db.execSQL(createQuery);
        }
        catch (Exception e){
            e.printStackTrace();
            Log.e("Exception",e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String createQuery = "CREATE TABLE "+UserProfile.Users.TABLE_NAME+"("+UserProfile.Users.COL_ID+
                "INTEGER PRIMARY KEY AUTOINCREMENT ,"+UserProfile.Users.COL_USERNAME+"TEXT UNIQUE,"+
                UserProfile.Users.COL_PASSWORD+"TEXT,"+UserProfile.Users.COL_GENDER+"TEXT"+UserProfile.Users.COL_DOB+"TEXT"+")";

        Log.d("createQuery",createQuery);

        try{
            db.execSQL(createQuery);
        }
        catch (Exception e){
            e.printStackTrace();
            Log.e("Exception",e.getMessage());
        }

    }

    public boolean addInfo(UserProfile.Users users){

        SQLiteDatabase db = this.getWritableDatabase();

        String insertQuery = "INSERT INTO" + UserProfile.Users.TABLE_NAME;
        
return true;

    }

    }

