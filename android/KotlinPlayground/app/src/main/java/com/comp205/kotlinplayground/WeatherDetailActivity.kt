package com.comp205.kotlinplayground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_weather_detail.*

class WeatherDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_detail)
        // We can get back the parcelable object we put in main activity
        val extra = intent.getParcelableExtra<Weather>("weather")
        val weather = if (extra != null) {
            extra
        } else {
            Weather("Invalid bundle!", "", "")
        }

        // Setup elements in our activity to show the proper variables
        dateTextView.text = weather.time
        highLowTextView.text = weather.highLow
        descriptionTextView.text = weather.description
    }
}
