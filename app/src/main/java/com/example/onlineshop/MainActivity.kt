package com.example.onlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlineshop.ProductAdapter.ProductAdapter
import com.example.onlineshop.brand.Brand
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_raw.*
import kotlinx.android.synthetic.main.item_raw.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  1 -> load data into the arraylist

        var brandArray = ArrayList<Brand>()

        brandArray.add(Brand(R.drawable.p1,"Erke","$100","$50"))
        brandArray.add(Brand(R.drawable.p2,"Erke","$90","$0"))
        brandArray.add(Brand(R.drawable.p7,"Nike","$390","$80"))
        brandArray.add(Brand(R.drawable.p4,"Erke","$400","$50"))
        brandArray.add(Brand(R.drawable.p5,"Erke","$350","$80"))
        brandArray.add(Brand(R.drawable.p8,"Nike","$500","$80"))
        brandArray.add(Brand(R.drawable.p9,"Nike","$1000","$50"))
        brandArray.add(Brand(R.drawable.p11,"Timberlaid","$1570","$0"))
        brandArray.add(Brand(R.drawable.p7,"Nike","$780","$80"))
        brandArray.add(Brand(R.drawable.p10,"Erke","$400","$50"))
        brandArray.add(Brand(R.drawable.p3,"Erke","$350","$80"))
        brandArray.add(Brand(R.drawable.p6,"Nike","$500","$80"))
        

        //  2 -> assign(equals) with adapter's arraylist

        var productadapter = ProductAdapter(brandArray)


        // 3 -> create a layoutmanager

        recyclerview.layoutManager = LinearLayoutManager(this)

        //  4 -> access the recyclerview adapter and load the data into it

        recyclerview.adapter = productadapter









    }
}
