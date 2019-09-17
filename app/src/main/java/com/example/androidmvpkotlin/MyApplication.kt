package com.example.androidmvpkotlin

import android.app.Application
import com.example.androidmvpkotlin.module.myMainModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application()
{
    override fun onCreate()
    {
        super.onCreate()

        //Start koin injection context
        startKoin(this, listOf(myMainModule))
    }
}