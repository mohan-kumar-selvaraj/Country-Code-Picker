package com.myfirstcopy.countrycodepicker.Data

import java.util.Locale
import com.myfirstcopy.countrycodepicker.R

data class CountryData(
    private var cCodes: String,
    val countryPhoneCode: String = "+90",
    val cNames:String = "tr",
    val flagResID: Int = R.drawable.tr
) {
    val countryCode = cCodes.lowercase(Locale.getDefault())
}