package com.example.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Clubbola(
    val imgClubbola: Int,
    val nameClubbola: String,
    val descClubbola: String
) :Parcelable
