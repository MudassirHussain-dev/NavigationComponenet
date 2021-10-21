package dev.hmh.kotlinnavigation.transition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import dev.hmh.kotlinnavigation.R

class TransitionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)

        setupActionBarWithNavController(findNavController(R.id.fragment_transition))
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragment_transition)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}