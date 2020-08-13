package com.osg.project02randommenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__menu)
    }

    fun clickCoun(view: View) {
        var intent= Intent(this, CountryActivity::class.java)
        startActivity(intent)
    }
    fun clickIng(view: View) {
        var intent= Intent(this, IngreActivity::class.java)
        startActivity(intent)
    }
    fun clickAfter(view: View) {
        var intent= Intent(this, DesertActivity::class.java)
        startActivity(intent)
    }
    fun clickEct(view: View) {
        var intent= Intent(this, RandomActivity::class.java)
        startActivity(intent)
    }
}