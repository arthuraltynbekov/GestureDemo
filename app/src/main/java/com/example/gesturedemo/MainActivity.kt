package com.example.gesturedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.gesturedemo.ui.theme.GestureDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GestureDemoTheme {
                MainScreen()
            }
        }
    }
}

@androidx.compose.runtime.Composable
fun MainScreen(modifier: Modifier = Modifier) {

}