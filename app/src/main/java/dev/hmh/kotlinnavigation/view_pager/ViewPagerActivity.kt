package dev.hmh.kotlinnavigation.view_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.hmh.kotlinnavigation.R

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        supportActionBar?.hide()

    }
}