package com.example.androidmvpkotlin.base

/**
 * Created by Muhammad Naufal Azzaahid on 09/09/2019.
 */
interface BaseView<T : BasePresenter<*>> {
    val mPresenter : T
}