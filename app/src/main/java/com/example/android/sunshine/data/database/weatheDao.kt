package com.example.android.sunshine.data.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.android.sunshine.entity.WeatherEntity
import java.util.*

@Dao
interface WeatherDao{
    @Query("SELECT * FROM weather WHERE date = :date")
    fun getWeatherByDate(date: Date) : WeatherEntity
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun bulkInsert(vararg weather: WeatherEntity)
}