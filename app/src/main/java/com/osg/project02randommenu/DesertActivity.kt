package com.osg.project02randommenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DesertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desert)

        var actbar=supportActionBar
        if (actbar != null) {
            actbar.setTitle("후식 선택")
        }
    }
}