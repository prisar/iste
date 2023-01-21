package com.kulik.calendar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kulik.calendar.ui.theme.IsteTheme

class RadhikapurActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IsteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    
    Image(
        painter = painterResource(id = R.drawable.hq720),
        contentDescription = "train",
//        modifier = Modifier.fillMaxWidth()
//            .align(Alignment.Center) // keep the image centralized into the Box
//            .graphicsLayer(
//                // adding some zoom limits (min 50%, max 200%)
//                scaleX = maxOf(.5f, minOf(3f, scale.value)),
//                scaleY = maxOf(.5f, minOf(3f, scale.value)),
//                rotationZ = rotationState.value
//            )

    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    IsteTheme {
        Greeting("Android")
    }
}