package com.example.androidmvpkotlin

import android.app.Application
import androidx.room.Room
import com.example.androidmvpkotlin.model.sample_model.AppDatabase
import com.example.androidmvpkotlin.module.myMainModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application()
{
    override fun onCreate()
    {
        super.onCreate()

        //Start koin injection context
        startKoin(this, listOf(myMainModule))

        //Create Database
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "my-database.db").build()
    }
}