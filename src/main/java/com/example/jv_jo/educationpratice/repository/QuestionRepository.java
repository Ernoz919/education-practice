package com.example.jv_jo.educationpratice.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.jv_jo.educationpratice.services.Constants;

/**
 * Created by jv_jo on 01/05/2016.
 */
public class QuestionRepository extends SQLiteOpenHelper {

    public QuestionRepository(Context context) {
        super(context, Constants.BD_QUESTION, null, Constants.VERSION_QUESTION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder query = new StringBuilder();
        query.append("CREATE TABLE QUESTIONS( ");
        query.append(" ID_QUESTION INT PRIMARY KEY AUTOINCREMENT,");
        query.append(" QUESTION TEXT NOT NULL)");

        db.execSQL(query.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}

    public void defined(){
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO QUESTIONS(QUESTION) VALUES(?)");

        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(query.toString(), new String[] {"1°) Who was Hitler?", "1°) In what year happened the World War Two?"});

    }

}
