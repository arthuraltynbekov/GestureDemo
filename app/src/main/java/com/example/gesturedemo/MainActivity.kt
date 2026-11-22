package com.example.gesturedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.gesturedemo.ui.theme.GestureDemoTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
    @Composable
    fun MainScreen(modifier: Modifier = Modifier) {
        ClickDemo(modifier)
    }
}

@Composable
fun ClickDemo(modifier: Modifier = Modifier) {

    var colorState by remember { mutableStateOf(true) }
    var bgColor by remember { mutableStateOf(Color.Blue) }

    val clickHandler = {
        colorState = !colorState

        bgColor = if (colorState) {
            Color.Blue
        } else {
            Color.DarkGray
        }
    }

    Box(
        modifier
            .clickable { clickHandler() }
            .background(bgColor)
            .size(100.dp)
    )
}