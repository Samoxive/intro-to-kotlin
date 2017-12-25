package com.comp205.kotlinplayground

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Weather(
        val time: String,
        val highLow: String,
        val description: String
): Parcelable