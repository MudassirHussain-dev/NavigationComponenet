package dev.hmh.kotlinnavigation.bottom_sheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import dev.hmh.kotlinnavigation.R

class BottomSheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        val navController = findNavController(R.id.fragmentBottomSheet)
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragmentBottomSheet)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}