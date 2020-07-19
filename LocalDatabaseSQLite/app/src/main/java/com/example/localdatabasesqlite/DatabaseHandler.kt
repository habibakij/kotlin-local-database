package com.example.localdatabasesqlite

import android.app.TaskStackBuilder
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHandler (private val context: Context):SQLiteOpenHelper(context, DATABASE_NAME,null, DATABASE_VERSION){
    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "EmployeeDatabase"
        private val TABLE_CONTACTS = "EmployeeTable"
        private val KEY_ID = "id"
        private val KEY_NAME = "name"
        private val KEY_EMAIL = "email"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE= ("CREATE TABLE "+ TABLE_CONTACTS +"("+ KEY_ID +"INTERGER PRIMARY KEY,"+ KEY_NAME
                +"TEXT,"+ KEY_EMAIL +"TEXT" + ")")
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS)
        onCreate(db)
    }

    private fun addEmployee(){

    }

}