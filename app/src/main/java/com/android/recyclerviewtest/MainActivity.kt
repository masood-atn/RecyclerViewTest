package com.android.recyclerviewtest
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val list: ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDrawer = btnDrawer
        addList()


        recyclerViewList.layoutManager = LinearLayoutManager(this)



        recyclerViewList.adapter = ListAdapter(list, this)

        btnDrawer.setOnClickListener(View.OnClickListener {
            val drawerLayout = drawer_layout
            drawerLayout.openDrawer(GravityCompat.START)
        })

    }


    private fun addList() {
        list.add("Recycler Item 1")
        list.add("Recycler Item 2")
        list.add("Recycler Item 3")
        list.add("Recycler Item 4")
        list.add("Recycler Item 5")
        list.add("Recycler Item 6")
        list.add("Recycler Item 7")
        list.add("Recycler Item 8")
        list.add("Recycler Item 9")
        list.add("Recycler Item 10")
        list.add("Recycler Item 11")
        list.add("Recycler Item 12")
        list.add("Recycler Item 13")
        list.add("Recycler Item 14")
        list.add("Recycler Item 15")


    }
}
