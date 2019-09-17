package com.example.androidmvpkotlin.model.sample_model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Muhammad Naufal Azzaahid on 10/11/2018.
 */

@Entity(tableName = "sampleName")
open class SampleModel {
    @PrimaryKey(autoGenerate = true)
    open var idNumber: Int = 0

    @SerializedName("userId")
    @ColumnInfo(name = "userId")
    @Expose
    open var userId: String? = null

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @Expose
    open var id: String? = null

    @SerializedName("title")
    @ColumnInfo(name = "title")
    @Expose
    open var title: String? = null

    @SerializedName("completed")
    @ColumnInfo(name = "completed")
    @Expose
    open var completed: String? = null
}