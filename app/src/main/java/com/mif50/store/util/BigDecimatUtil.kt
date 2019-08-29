package com.mif50.store.util

import java.math.BigDecimal
import java.text.DecimalFormat

object BigDecimatUtil {

    fun getValue(value: BigDecimal): String {
        val df = DecimalFormat("###,###,###.00")
        return df.format(value)
    }
}