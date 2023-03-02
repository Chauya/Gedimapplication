package com.example.gedimatapplication;

import static java.lang.Integer.parseInt;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.SparseIntArray;

import androidx.annotation.Nullable;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    /**
     * constructeur
     * @param context
     */
    public MySQLiteOpenHelper(@Nullable Context context) {
        super(context, "dbGedimatApp.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String req = "CREATE TABLE Realisation("
                +"id INT PRIMARY KEY,"
                +"titre TEXT, "
                +"description TEXT,"
                +"nbGaimes INT)";

        String req2 = "CREATE TABLE Votant("
                +"code TEXT PRIMARY KEY, "
                +"mail TEXT, "
                +"dateUtil TEXT)";

        db.execSQL( req );

        db.execSQL( req2 );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS Realisation");
        db.execSQL("DROP TABLE IF EXISTS Votant");
        onCreate(db);
    }
}
