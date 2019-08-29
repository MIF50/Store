package com.mif50.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.mif50.store.models.Product
import com.mif50.store.resources.Products
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "MainActivity"
        private const val NUM_COLUMMS = 2
    }

    private val mProducts = arrayListOf<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getProducts()
        initRecyclerView()
    }


    private fun getProducts(){
        mProducts.addAll(Products.FEATURED_PRODUCTS)
    }

    private fun initRecyclerView(){
        recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(this@MainActivity, NUM_COLUMMS)
            adapter = MainRecyclerViewAdapter(mProducts)
        }
    }
}
