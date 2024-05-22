package com.myfirstcopy.countrycodepicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.myfirstcopy.countrycodepicker.ui.theme.CountryCodePickerTheme
import com.myfirstcopy.countrycodepicker.Components.CountryCodePick

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CountryCodePickerTheme {
                CountryCodePick()
            }
        }
    }
}