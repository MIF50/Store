package com.mif50.store.util

import android.content.Context
import android.util.Log
import java.util.ArrayList
import java.util.HashSet
import com.mif50.store.models.Product
import com.mif50.store.resources.Products
import android.content.SharedPreferences


class CartManger( mContext: Context) {
     var mSharedPreferences: SharedPreferences
     var mEditor: SharedPreferences.Editor

    val cartItems: ArrayList<Product>
        get() {
            val cartItems = mSharedPreferences.getStringSet(CART_ITEMS, HashSet())

            val productsList = arrayListOf<Product>()
            val productMap = Products.products
            for (serialNumber in cartItems!!) {
                productsList.add(productMap[serialNumber]!!)
                Log.d(TAG, "getCartItem: serial number: $serialNumber")
                Log.d(TAG, "getCartItem: item title: " + productMap[serialNumber]!!.title)
            }

            return productsList
        }

    init {
        mSharedPreferences = mContext.getSharedPreferences(SHOPPING_CART, 0)
        mEditor = mSharedPreferences.edit()
    }

    fun addItemToCart(product: Product) {
        val cartItems = mSharedPreferences.getStringSet(CART_ITEMS, HashSet())
        cartItems!!.add(product.serialNumber.toString())

        mEditor.putStringSet(CART_ITEMS, cartItems)
        mEditor.commit()
    }

    fun removeItemFromCart(product: Product) {
        val cartItems = mSharedPreferences.getStringSet(CART_ITEMS, HashSet())

        cartItems!!.remove(product.serialNumber.toString())
        mEditor.putStringSet(CART_ITEMS, cartItems)
        mEditor.commit()
    }

    companion object {

        private val TAG = "CartManger"

        internal val SHOPPING_CART = "shopping_cart"
        internal val CART_ITEMS = "cart_items"
    }
}