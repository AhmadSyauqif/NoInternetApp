package com.pesan.nointernetlayout.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pesan.nointernetlayout.R
import com.pesan.nointernetlayout.model.ModelMain
import kotlinx.android.synthetic.main.list_item_main.view.*



class MainAdapter(private val items: List<ModelMain>) : RecyclerView.Adapter<MainAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_main, parent, false)
        return MainHolder(view)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val data = items[position]
        holder.tvName.text = data.strNamae
        holder.tvVersion.text = data.strVersiom
        holder.tvApiLevel.text = data.strNamae
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView
        var tvVersion: TextView
        var tvApiLevel: TextView

        init {
            tvName = itemView.tvName
            tvVersion = itemView.tvVersion
            tvApiLevel = itemView.tvApiLevel
        }
    }
}