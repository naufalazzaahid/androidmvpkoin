package com.example.androidmvpkotlin.base

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.scope.ext.android.bindScope
import org.koin.android.scope.ext.android.getOrCreateScope

/**
 * Created by Muhammad Naufal Azzaahid on 10/09/2019.
 */
abstract class BaseActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        bindScope(getOrCreateScope(this.javaClass.simpleName))
    }

    fun fullScreenMode()
    {
        //Remove Status Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        //Remove Toolbar
        supportActionBar!!.hide()
    }
}