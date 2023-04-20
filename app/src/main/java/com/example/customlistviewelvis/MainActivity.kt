package com.example.customlistviewelvis

import android.graphics.ColorSpace.Model
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.lifecycle.ViewModelStore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<models>()

        list.add(models("bt2","ffgffffff",R.drawable.bt2))
        list.add(models("but","this car",R.drawable.but))
        list.add(models("cr","ferrari",R.drawable.cr))
        list.add(models("fr","fer",R.drawable.fr))

        listView.adapter=myadapter(this,R.layout.row,list)
    }
}