package com.osg.project02randommenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RandomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        supportActionBar!!.title=("직접 선택")
//        var actBar=supportActionBar
//        actBar?.setTitle("직접 선택")

    }
}