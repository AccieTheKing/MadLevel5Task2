package com.example.madlevel5example2.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel5example2.R
import com.example.madlevel5example2.model.GameBacklog
import kotlinx.android.synthetic.main.item_card_backlog.view.*

class GameBacklogAdapter(private val gameBacklogs: List<GameBacklog>) :
    RecyclerView.Adapter<GameBacklogAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun databind(gameBacklog: GameBacklog) {
            itemView.txtViewGameTitleBacklog.text = gameBacklog.title
            itemView.txtViewPlatformTitleBacklog.text = gameBacklog.platform
            itemView.txtViewReleaseDateBacklog.text = String().format(
                "Release: %s %s %s", gameBacklog.day,
                gameBacklog.month,
                gameBacklog.year
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_backlog, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(gameBacklogs[position])
    }

    override fun getItemCount(): Int {
        return gameBacklogs.size
    }
}