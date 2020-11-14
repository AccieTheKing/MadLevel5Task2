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
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        val deleteMenuItem = menu.findItem(R.id.btnRemoveAll)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.FirstFragment -> {
                    fabActionScreenButton.setOnClickListener {
                        supportActionBar?.setDisplayHomeAsUpEnabled(true)
                        supportActionBar?.setDisplayShowHomeEnabled(true)
                        supportActionBar?.setTitle(R.string.addGameTitle)
                        navController.navigate(R.id.action_FirstFragment_to_SecondFragment)
                    }

                    fabActionScreenButton.setImageResource(android.R.drawable.ic_menu_edit)
                    deleteMenuItem.isVisible = true
                    supportActionBar?.setDisplayHomeAsUpEnabled(false)
                    supportActionBar?.setDisplayShowHomeEnabled(false)
                    supportActionBar?.setTitle(R.string.app_name)
                }
                R.id.SecondFragment -> {
                    deleteMenuItem.isVisible = false
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
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.btnRemoveAll -> {
                viewModel.deleteGameBacklog()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

}