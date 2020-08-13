package com.osg.project02randommenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var bar=supportActionBar
        if (bar != null) {
            bar.setTitle("골라골라 메뉴판")
        }

    }

    fun clickBtn(view: View) {
        var intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }

//    fun clickBtn2(view: View) {
//        var intent=Intent(this, ActivityRandom::class.java)
//        startActivity(intent)
//    }
}

