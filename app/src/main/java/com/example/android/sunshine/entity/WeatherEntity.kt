package com.example.android.sunshine.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import android.graphics.Bitmap
import java.util.*

@Entity(tableName = "weather", indices =  arrayOf(Index(value = ["date"])))
data class WeatherEntity(@PrimaryKey(autoGenerate = true) val id: Integer, val weatherIconId : Integer, val date: Date, @Ignore val picture : Bitmap){

}