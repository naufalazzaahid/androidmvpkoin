package com.example.androidmvpkotlin.module

import com.example.androidmvpkotlin.service.MyService
import com.example.androidmvpkotlin.ui.main.MainActivity
import com.example.androidmvpkotlin.ui.main.MainContract
import com.example.androidmvpkotlin.ui.main.MainPresenter
import com.google.gson.GsonBuilder
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Muhammad Naufal Azzaahid on 09/09/2019.
 */

val myMainModule = module {
    single { GsonBuilder().create() }
    single { Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(get()))
        .baseUrl("https://jsonplaceholder.typicode.com/") //Base URL Goes Here
        .build().create(MyService::class.java) }

    scope(MainActivity::class.simpleName!!) { (view : MainContract.View) -> MainPresenter(view, get()) as MainContract.Presenter }
}