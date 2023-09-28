package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(private val items: List<RecyclerViewData>) :
    RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewDataHolder>() {

    inner class MyRecyclerViewDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewDataHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_dashboard, parent, false)
        return MyRecyclerViewDataHolder(view)
    }

    override fun onBindViewHolder(holder: MyRecyclerViewDataHolder, position: Int) {
        val currentItem: RecyclerViewData = items[position]

        val tvNumber: TextView = holder.itemView.findViewById(R.id.tvNumber)
        tvNumber.text = currentItem.text1

        val tvNumbersInText: TextView = holder.itemView.findViewById(R.id.tvNumbersInText)
        tvNumbersInText.text = currentItem.text2
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
