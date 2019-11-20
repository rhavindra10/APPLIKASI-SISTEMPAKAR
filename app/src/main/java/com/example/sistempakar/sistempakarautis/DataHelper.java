package com.example.sistempakar.sistempakarautis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static  final  String DATABASE_NAME = "data.db";
    private static  final  int DATABASE_VERTSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERTSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql ="create table datahasil(no interger primary key, nama text null,umur text null,namapenyakit text null, keterangan text null); ";
        Log.d("Data","on Create"+sql);
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }
}
