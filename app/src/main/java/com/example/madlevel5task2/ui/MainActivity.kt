package com.example.madlevel5task2.ui

import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.madlevel5task2.R
import com.example.madlevel5task2.ui.viewmodels.GameBacklogViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private val viewModel: GameBacklogViewModel by viewModels()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        navController = findNavController(R.id.nav_host_fragment)

        onInitDestinationListener();
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun onInitDestinationListener() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.FirstFragment -> {
                    fabActionScreenButton.setOnClickListener {
                        navController.navigate(R.id.action_FirstFragment_to_SecondFragment)
                    }
                    fabActionScreenButton.setImageResource(android.R.drawable.ic_menu_edit)
                }
                R.id.SecondFragment -> {
                    val cal = Calendar.getInstance()


                    fabActionScreenButton.setOnClickListener {
                        cal.set(Calendar.YEAR, txtAddYear.text.toString().toInt())
                        cal.set(Calendar.MONTH, txtAddMonth.text.toString().toInt())
                        cal.set(Calendar.DAY_OF_MONTH, txtAddDay.text.toString().toInt())

                        viewModel.insertGameBackLog(
                            txtAddTitle.text.toString(),
                            txtAddPlatform.text.toString(),
                            Date.from(cal.toInstant()),
                        )

                        navController.navigate(R.id.action_SecondFragment_to_FirstFragment)
                    }
                    fabActionScreenButton.setImageResource(android.R.drawable.ic_menu_save)
                }
            }
        }
    }
}