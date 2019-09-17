package com.example.androidmvpkotlin.ui.main

import android.os.Bundle
import android.widget.Toast
import com.example.androidmvpkotlin.R
import com.example.androidmvpkotlin.base.BaseActivity
import com.example.androidmvpkotlin.model.sample_model.SampleModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : BaseActivity(), MainContract.View {

    override val mPresenter: MainContract.Presenter by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter.getData()
    }

    override fun onLoading() {
        Toast.makeText(this, "The Loading Goes Here", Toast.LENGTH_SHORT).show()
    }

    override fun onSuccess(sampleModel: SampleModel?) {
        textView1.text = "success"
        textView2.text = sampleModel!!.userId
        textView3.text = sampleModel.id
        textView4.text = sampleModel.title
    }

    override fun onError(errorMessage: String) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
    }
}
