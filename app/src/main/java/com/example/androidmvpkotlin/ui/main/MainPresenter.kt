package com.example.androidmvpkotlin.ui.main

import com.example.androidmvpkotlin.model.SampleModel
import com.example.androidmvpkotlin.service.MyService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * Created by Muhammad Naufal Azzaahid on 09/09/2019.
 */
class MainPresenter(override var mView: MainContract.View, override var mService: MyService) :
    MainContract.Presenter {
    override fun getData() {
        mView.onLoading()

        mService.getDataFromAPI().enqueue(object : Callback<SampleModel> {
            override fun onResponse(call: Call<SampleModel>, response: Response<SampleModel>) {
                mView.onSuccess(response.body())
            }

            override fun onFailure(call: Call<SampleModel>, t: Throwable) {
                mView.onError("failed")
            }
        })
    }
}