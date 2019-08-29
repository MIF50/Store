package com.mif50.store

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mif50.store.models.Product
import com.mif50.store.util.ktx.loadImage
import kotlinx.android.synthetic.main.main_feed_list_item.view.*

class MainRecyclerViewAdapter(private val products: ArrayList<Product>): RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_feed_list_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.apply {
            image.loadImage(products[position].image)
            card_view.setOnClickListener {
                val intent = Intent(context,ViewProductActivity::class.java)
                intent.putExtra(context.getString(R.string.intent_product),products[position])
                context.startActivity(intent)
            }
        }
    }


    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v)
}