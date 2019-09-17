package com.example.androidmvpkotlin.ui.main

import com.example.androidmvpkotlin.base.BasePresenter
import com.example.androidmvpkotlin.base.BaseView
import com.example.androidmvpkotlin.model.sample_model.SampleModel

/**
 * Created by Muhammad Naufal Azzaahid on 09/09/2019.
 */
interface MainContract
{
    interface View : BaseView<Presenter>
    {
        fun onLoading()
        fun onSuccess(sampleModel: SampleModel?)
        fun onError(errorMessage: String)
    }

    interface Presenter : BasePresenter<View>
    {
        fun getData()
    }
}