package com.example.madlevel5task2.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.madlevel5task2.R
import com.example.madlevel5task2.model.GameBacklog
import com.example.madlevel5task2.ui.adapters.GameBacklogAdapter
import com.example.madlevel5task2.ui.viewmodels.GameBacklogViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class GameBacklogFragment : Fragment() {
    private var gameBackLogs: ArrayList<GameBacklog> = arrayListOf()

    private lateinit var gameBacklogAdapter: GameBacklogAdapter

    private val viewModel: GameBacklogViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRv()
        observeAddGameBacklog()
        observeDeleteGameBacklog()
    }

    private fun initRv() {
        gameBacklogAdapter = GameBacklogAdapter(gameBackLogs)
        rvBacklogScreen.adapter = gameBacklogAdapter
        rvBacklogScreen.layoutManager = LinearLayoutManager(activity)
    }

    private fun observeAddGameBacklog() {
        viewModel.gameBacklogs.observe(viewLifecycleOwner, { logs ->
            this@GameBacklogFragment.gameBackLogs.clear()
            this@GameBacklogFragment.gameBackLogs.addAll(logs)
            gameBacklogAdapter.notifyDataSetChanged()
        })
    }

    private fun observeDeleteGameBacklog() {
        viewModel.success.observe(viewLifecycleOwner, { logs ->
            Snackbar.make(View(context), "Success", Snackbar.LENGTH_LONG)
        })
    }
}