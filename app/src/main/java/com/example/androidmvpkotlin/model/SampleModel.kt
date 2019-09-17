package com.example.androidmvpkotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Muhammad Naufal Azzaahid on 10/11/2018.
 */
open class SampleModel {
    @SerializedName("userId")
    @Expose
    open var userId: String? = null

    @SerializedName("id")
    @Expose
    open var id: String? = null

    @SerializedName("title")
    @Expose
    open var title: String? = null

    @SerializedName("completed")
    @Expose
    open var completed: String? = null
}