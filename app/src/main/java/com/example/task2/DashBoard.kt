package com.example.task2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task2.adapter.RecyclerAdapter

class DashBoard : AppCompatActivity() {
    lateinit var recyclerview : RecyclerView
    var titleList =ArrayList<String>()
    var imageList =ArrayList<Int>()
    var descriptionList =ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dash_board)

        recyclerview = findViewById(R.id.recycleview)

        titleList.add("beckham")
        titleList.add("garnacho")
        titleList.add("zlatan")

        imageList.add(R.drawable.beckham)
        imageList.add(R.drawable.garnacho)
        imageList.add(R.drawable.zlatan)

        descriptionList.add("Legend")
        descriptionList.add("Warrior")
        descriptionList.add("Machine")

        var adapter = RecyclerAdapter(titleList, imageList, descriptionList)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter
    }
}