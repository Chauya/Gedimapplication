package com.example.gedimatapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class MySQLiteOpenDAO {
    private SQLiteDatabase maBase;
    private MySQLiteOpenHelper monHelper;

    public MySQLiteOpenDAO(Context context){
        monHelper = new MySQLiteOpenHelper(context);
        maBase = monHelper.getWritableDatabase();
    }

    public void insertReal(Realisation uneRealisation) {
        // Creation ContentValues
        ContentValues v = new ContentValues();
        // Ajout des propriétés au ContentValues
        v.put("id", uneRealisation.getId());
        v.put("titre", uneRealisation.getTitre());
        v.put("description", uneRealisation.getDescription());
        v.put("nbGaimes", uneRealisation.getNbGaimes());
        // Ajout de la realisation à la BDD embarqué
        maBase.insert("Realisation", null, v);
    }

    public void insertVote(Votant unVotant){
        // Creation ContentValues
        ContentValues v = new ContentValues();
        // Ajout des propriétés au ContentValues
        v.put("code", unVotant.getCode());
        v.put("mail", unVotant.getMail());
        v.put("dateUtilisation", unVotant.getDateUtilisation());
        v.put("dateAccord", unVotant.getDateAccord());
        // Ajout de la realisation à la BDD embarqué
        maBase.insert("Votant", null, v);
    }
}
