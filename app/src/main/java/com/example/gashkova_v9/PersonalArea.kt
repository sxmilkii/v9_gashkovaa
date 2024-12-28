package com.example.gashkova_v9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable

class PersonalArea : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalAreaScreen()
        }
    }
}

@Composable
fun PersonalAreaScreen() {

}
