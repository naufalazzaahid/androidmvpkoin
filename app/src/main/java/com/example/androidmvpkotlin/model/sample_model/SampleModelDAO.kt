package com.example.androidmvpkotlin.model.sample_model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


/**
 * Created by Muhammad Naufal Azzaahid on 17/09/2019.
 */

@Dao
interface SampleModelDAO {
    @Query("SELECT * FROM sampleName")
    fun getAll(): List<SampleModel>

    @Query("SELECT * FROM sampleName WHERE title LIKE :title")
    fun findByTitle(title: String): SampleModel

    @Insert
    fun insertAll(vararg todo: SampleModel)
}