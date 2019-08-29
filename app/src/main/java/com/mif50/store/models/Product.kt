package com.mif50.store.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class Product(
    val title: String,
    val image: Int,
    val type: String,
    val price: BigDecimal,
    val serialNumber: Int
):Parcelable