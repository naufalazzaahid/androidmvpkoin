package com.example.androidmvpkotlin.base

import com.example.androidmvpkotlin.service.MyService

/**
 * Created by Muhammad Naufal Azzaahid on 09/09/2019.
 */
interface BasePresenter<T>{
    var mView : T
    var mService : MyService
}