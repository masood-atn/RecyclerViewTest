package com.android.recyclerviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_items.view.*

class ListAdapter(private val items : ArrayList<String>, private val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_items, parent, false))
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvnameType.text = items[position]
    }


    override fun getItemCount() = items.size
    }



class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val tvnameType = view.txtName
}