package com.example.androidmvpkotlin.model.sample_model

import androidx.room.Database
import androidx.room.RoomDatabase


/**
 * Created by Muhammad Naufal Azzaahid on 17/09/2019.
 */


@Database(entities = arrayOf(SampleModel::class), version = 1)
abstract class AppDatabase : RoomDatabase()
{
    abstract fun sampleModelDAO() : SampleModelDAO
}