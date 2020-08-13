package com.osg.project02randommenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_country.*
import kotlin.random.Random

class CountryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)

        var actbar=supportActionBar
        if (actbar != null) {
            actbar.setTitle("국가별 메뉴 선택")
        }


    }

    fun koreanFood(view: View) {
    }
    fun chineseFood(view: View) {}
    fun japaneseFood(view: View) {}
    fun westernFood(view: View) {}
    fun asiaFood(view: View) {}
    fun clickSelect(view: View) {
        //랜덤으로 한/중/일/양/아시아 중 하나 선택

    }
}