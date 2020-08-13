package com.osg.project02randommenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IngreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingre)

        var actbar=supportActionBar
        if (actbar != null) {
            actbar.setTitle("종류별 메뉴 선택")
        }
    }
}