package com.kulik.calendar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column(
        modifier = Modifier.fillMaxWidth() ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.hq720),
            contentDescription = "train",
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        )

        Text("Radhikapur - Katihar Passenger: 4:45 am")
        Text("Radhikapur - Howrah Jn Kulik Express: 5:45 am")
        Text("Radhikapur - Siliguri DEMU: 6:15 am")
        Text("Radhikapur - Katihar Passenger: 10:30 am")
        Text("Radhikapur - Telta DEMU: 1:00 pm")
        Text("Radhikapur - Katihar Passenger: 6:30 pm")
        Text("Radhikapur - Kolkata Express: 10:30 am")

        Divider()
        Text("For outsiders new to radhikapur, there are hotels in kaliyaganj where you can stay")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    IsteTheme {
        Greeting("Android")
    }
}