package com.mif50.store.util.ktx

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mif50.store.R

fun ImageView.loadImage(resId: Int){
    val requestOptions = RequestOptions().placeholder(R.drawable.ic_launcher_background)
    Glide.with(this.context)
        .setDefaultRequestOptions(requestOptions)
        .load(resId)
        .into(this)
}