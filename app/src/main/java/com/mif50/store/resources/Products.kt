package com.mif50.store.resources

import com.mif50.store.R
import java.math.BigDecimal
import java.util.HashMap
import com.mif50.store.models.Product



class Products {

    var PRODUCT_MAP = HashMap<String, Array<Product>>()

    init {
        PRODUCT_MAP["Phone Case"] = PHONE_CASES
        PRODUCT_MAP["Hoody"] = HOODIES
        PRODUCT_MAP["Mug"] = MUGS
        PRODUCT_MAP["T-Shirt"] = T_SHIRTS
        PRODUCT_MAP["Half-Sleeve Shirt"] = HALF_SLEEVES
        PRODUCT_MAP["Snapback"] = SNAPBACKS
        PRODUCT_MAP["Tank"] = TANKS
        PRODUCT_MAP["Trucker Hat"] = TRUCKER_HATS
    }

    companion object {

        val CELL_PHONE_CASE_1 = Product(
            "Cell Phone Case 1", R.drawable.cell_phone_case_1, "Phone Case",
            BigDecimal(10.99), 1515611
        )
        val CELL_PHONE_CASE_2 = Product(
            "Cell Phone Case 2", R.drawable.cell_phone_case_2, "Phone Case",
            BigDecimal(11.99), 1515612
        )

        val HOODY_NAVY =
            Product("Navy Hoody", R.drawable.hoody_navy, "Hoody", BigDecimal(34.99), 7725277)
        val HOODY_ASPHALT = Product(
            "Asphalt Hoody", R.drawable.hoody_asphalt, "Hoody",
            BigDecimal(34.99), 7725278
        )
        val HOODY_BLACK = Product(
            "Black Hoody", R.drawable.hoody_black, "Hoody",
            BigDecimal(34.99), 7725279
        )
        val HOODY_GREY = Product(
            "Grey Hoody", R.drawable.hoody_grey, "Hoody",
            BigDecimal(34.99), 7725280
        )
        val HOODY_PURPLE = Product(
            "Purple Hoody", R.drawable.hoody_purple, "Hoody",
            BigDecimal(34.99), 7725281
        )

        val MUG_11OZ = Product(
            "Mug (11 oz)", R.drawable.mug_11oz, "Mug",
            BigDecimal(13.99), 7725282
        )
        val MUG_15OZ = Product(
            "Mug (15 oz)", R.drawable.mug_15oz, "Mug",
            BigDecimal(14.99), 7725283
        )

        val T_SHIRT_WHITE = Product(
            "White T-Shirt", R.drawable.t_shirt_white, "T-Shirt",
            BigDecimal(23.99), 2141515
        )
        val T_SHIRT_BLACK = Product(
            "Black T-Shirt", R.drawable.t_shirt_black, "T-Shirt",
            BigDecimal(23.99), 2141516
        )
        val T_SHIRT_GREY = Product(
            "Grey T-Shirt", R.drawable.t_shirt_grey, "T-Shirt",
            BigDecimal(23.99), 2141517
        )
        val T_SHIRT_NAVY = Product(
            "Navy T-Shirt", R.drawable.t_shirt_navy, "T-Shirt",
            BigDecimal(23.99), 2141518
        )
        val T_SHIRT_RED = Product(
            "Red T-Shirt", R.drawable.t_shirt_red, "T-Shirt",
            BigDecimal(23.99), 2141519
        )

        val HALF_SLEEVE_GREY = Product(
            "Grey Half-Sleeve Shirt", R.drawable.half_sleeve_shirt_grey,
            "Half-Sleeve Shirt", BigDecimal(28.99), 9704833
        )
        val HALF_SLEEVE_BLUE = Product(
            "Blue Half-Sleeve Shirt", R.drawable.half_sleeve_shirt_blue,
            "Half-Sleeve Shirt", BigDecimal(28.99), 9704834
        )
        val HALF_SLEEVE_WHITE = Product(
            "White Half-Sleeve Shirt", R.drawable.half_sleeve_shirt_white,
            "Half-Sleeve Shirt", BigDecimal(28.99), 9704835
        )
        val HALF_SLEEVE_RED = Product(
            "Red Half-Sleeve Shirt", R.drawable.half_sleeve_shirt_red,
            "Half-Sleeve Shirt", BigDecimal(28.99), 9704836
        )

        val SNAPBACK_BLACK = Product(
            "Black Snapback", R.drawable.snapback_black,
            "Snapback", BigDecimal(20.99), 9377376
        )
        val SNAPBACK_CAMO = Product(
            "Camo Snapback", R.drawable.snapback_camo,
            "Snapback", BigDecimal(20.99), 9377377
        )
        val SNAPBACK_GREY = Product(
            "Grey Snapback", R.drawable.snapback_grey,
            "Snapback", BigDecimal(20.99), 9377378
        )
        val SNAPBACK_NAVY = Product(
            "Navy Snapback", R.drawable.snapback_navy,
            "Snapback", BigDecimal(20.99), 9377379
        )
        val SNAPBACK_RED = Product(
            "Red Snapback", R.drawable.snapback_red,
            "Snapback", BigDecimal(20.99), 9377380
        )
        val SNAPBACK_TEAL = Product(
            "Teal Snapback", R.drawable.snapback_teal,
            "Snapback", BigDecimal(20.99), 9377381
        )

        val TANK_WHITE =
            Product("White Tank", R.drawable.tank_white, "Tank", BigDecimal(19.99), 6626622)
        val TANK_BLACK =
            Product("Black Tank", R.drawable.tank_black, "Tank", BigDecimal(19.99), 6626623)
        val TANK_GREY =
            Product("Grey Tank", R.drawable.tank_grey, "Tank", BigDecimal(19.99), 6626624)
        val TANK_LIGHT_BLUE = Product(
            "Light Blue Tank",
            R.drawable.tank_light_blue,
            "Tank",
            BigDecimal(19.99),
            6626625
        )
        val TANK_NAVY =
            Product("Navy Tank", R.drawable.tank_navy, "Tank", BigDecimal(19.99), 6626626)

        val TRUCKER_HAT_NAVY = Product(
            "Navy Trucker Hat", R.drawable.trucker_hat_navy,
            "Trucker Hat", BigDecimal(25.99), 783736
        )
        val TRUCKER_HAT_WHITE = Product(
            "White Trucker Hat", R.drawable.trucker_hat_white,
            "Trucker Hat", BigDecimal(25.99), 783737
        )
        val TRUCKER_HAT_BLACK = Product(
            "Black Trucker Hat", R.drawable.trucker_hat_black,
            "Trucker Hat", BigDecimal(25.99), 783738
        )
        val TRUCKER_HAT_BAIGE = Product(
            "Baige Trucker Hat", R.drawable.trucker_hat_baige,
            "Trucker Hat", BigDecimal(25.99), 783739
        )

        val T_SHIRTS =
            arrayOf(T_SHIRT_WHITE, T_SHIRT_BLACK, T_SHIRT_GREY, T_SHIRT_NAVY, T_SHIRT_RED)

        val HALF_SLEEVES =
            arrayOf(HALF_SLEEVE_GREY, HALF_SLEEVE_BLUE, HALF_SLEEVE_RED, HALF_SLEEVE_WHITE)

        val TRUCKER_HATS =
            arrayOf(TRUCKER_HAT_NAVY, TRUCKER_HAT_BLACK, TRUCKER_HAT_WHITE, TRUCKER_HAT_BAIGE)

        val SNAPBACKS = arrayOf(
            SNAPBACK_NAVY,
            SNAPBACK_BLACK,
            SNAPBACK_CAMO,
            SNAPBACK_GREY,
            SNAPBACK_RED,
            SNAPBACK_TEAL
        )

        val PHONE_CASES = arrayOf(CELL_PHONE_CASE_1, CELL_PHONE_CASE_2)

        val TANKS = arrayOf(TANK_BLACK, TANK_GREY, TANK_LIGHT_BLUE, TANK_NAVY, TANK_WHITE)

        val HOODIES = arrayOf(HOODY_ASPHALT, HOODY_BLACK, HOODY_GREY, HOODY_NAVY, HOODY_PURPLE)

        val MUGS = arrayOf(MUG_11OZ, MUG_15OZ)

        val FEATURED_PRODUCTS = arrayOf(
            CELL_PHONE_CASE_1,
            HOODY_NAVY,
            MUG_15OZ,
            T_SHIRT_WHITE,
            HALF_SLEEVE_GREY,
            SNAPBACK_GREY,
            TANK_NAVY,
            TRUCKER_HAT_NAVY,
            SNAPBACK_CAMO,
            T_SHIRT_BLACK,
            HOODY_ASPHALT,
            HALF_SLEEVE_BLUE
        )


        val products: HashMap<String, Product> = HashMap()

        init {
            val products = Products()
            val it = products.PRODUCT_MAP.entries.iterator()
            while (it.hasNext()) {
                val pair = it.next() as Map.Entry<*, *>
                println("${pair.key} = " + pair.value)
                for (product in pair.value as Array<Product>) {
                    this.products[product.serialNumber.toString()] = product
                }
                it.remove() // avoids a ConcurrentModificationException
            }
        }
    }


}
