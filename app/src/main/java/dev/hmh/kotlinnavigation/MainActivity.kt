package dev.hmh.kotlinnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.hmh.kotlinnavigation.R
import dev.hmh.kotlinnavigation.bottom_nav.BottomNavigation
import dev.hmh.kotlinnavigation.bottom_sheet.BottomSheetActivity
import dev.hmh.kotlinnavigation.drawer_nav.NavigationDrawer
import dev.hmh.kotlinnavigation.safe_args.SafeArgsActivity
import dev.hmh.kotlinnavigation.transition.TransitionActivity
import dev.hmh.kotlinnavigation.view_pager.ViewPagerActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_drawer.setOnClickListener {
            startActivity(Intent(this@MainActivity, NavigationDrawer::class.java))
        }
        btn_bottom.setOnClickListener {
            startActivity(Intent(this@MainActivity, BottomNavigation::class.java))
        }
        btn_viewpager.setOnClickListener {
            startActivity(Intent(this@MainActivity, ViewPagerActivity::class.java))
        }
        btn_transition.setOnClickListener {
            startActivity(Intent(this@MainActivity, TransitionActivity::class.java))
        }
        btn_safe_args.setOnClickListener {
            startActivity(Intent(this@MainActivity, SafeArgsActivity::class.java))
        }

        btn_bottomSheet.setOnClickListener {
            startActivity(Intent(this@MainActivity, BottomSheetActivity::class.java))
        }
    }
}