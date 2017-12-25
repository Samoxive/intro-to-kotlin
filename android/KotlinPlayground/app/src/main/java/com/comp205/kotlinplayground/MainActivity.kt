package com.comp205.kotlinplayground

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // When working with Java APIs, Kotlin can automatically call getters and setters for you,
        // below code's Java equilavent is `textView.setText("Hello COMP205")`, however we can just
        // set the text as if we were using Kotlin properties
        textView.text = "Hello COMP205!"

        // We can also stop using `findViewById` method thanks to Kotlin's Android extension, by importing
        // the relevant package (android studio will do it automatically for you), you can access the elements
        // by just typing their id in the code, our button's id is `fab` so we can do actions on them like the code below
        fab.setOnClickListener { view ->
            val intent = Intent(MainActivity@this, WeatherDetailActivity::class.java)
            val weather = Weather("26 December 2017", "8C/17C", "Sunny")
            intent.putExtra("weather", weather)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
