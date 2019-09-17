package com.example.androidmvpkotlin.service

import com.example.androidmvpkotlin.model.SampleModel
import retrofit2.Call
import retrofit2.http.GET
import rx.Observable

/**
 * Created by Muhammad Naufal Azzaahid on 11/11/2018.
 */

interface MyService {
    @GET("todos/1")
    fun getDataFromAPI(): Call<SampleModel>
}