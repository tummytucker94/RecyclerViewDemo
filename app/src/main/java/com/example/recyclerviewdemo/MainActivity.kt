package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create instance of RecyclerView and
        // register with the appropriate ID
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // create list of RecyclerViewData
        var recyclerViewData = listOf<RecyclerViewData>()
        recyclerViewData = recyclerViewData + RecyclerViewData("Jermaine", "One")
        recyclerViewData = recyclerViewData + RecyclerViewData("2", "Two")
        recyclerViewData = recyclerViewData + RecyclerViewData("3", "Three")
        recyclerViewData = recyclerViewData + RecyclerViewData("4", "Four")
        recyclerViewData = recyclerViewData + RecyclerViewData("5", "Five")
        recyclerViewData = recyclerViewData + RecyclerViewData("6", "Six")
        recyclerViewData = recyclerViewData + RecyclerViewData("7", "Seven")
        recyclerViewData = recyclerViewData + RecyclerViewData("8", "Eight")
        recyclerViewData = recyclerViewData + RecyclerViewData("9", "Nine")
        recyclerViewData = recyclerViewData + RecyclerViewData("10", "Ten")
        recyclerViewData = recyclerViewData + RecyclerViewData("11", "Eleven")
        recyclerViewData = recyclerViewData + RecyclerViewData("12", "Twelve")
        recyclerViewData = recyclerViewData + RecyclerViewData("13", "Thirteen")
        recyclerViewData = recyclerViewData + RecyclerViewData("14", "Fourteen")
        recyclerViewData = recyclerViewData + RecyclerViewData("15", "Fifteen")

        // create a vertical layout manager
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // create instance of MyRecyclerViewAdapter
        val myRecyclerViewAdapter = MyRecyclerViewAdapter(recyclerViewData)

        // attach the adapter to the recycler view
        recyclerView.adapter = myRecyclerViewAdapter

        // also attach the layout manager
        recyclerView.layoutManager = layoutManager

        // make the adapter the data set changed for the recycler view
        myRecyclerViewAdapter.notifyDataSetChanged()
    }
}