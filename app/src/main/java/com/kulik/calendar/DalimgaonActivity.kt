package com.kulik.calendar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kulik.calendar.ui.theme.IsteTheme

class DalimgaonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IsteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {
    Column(
        modifier = Modifier.fillMaxWidth() ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
//        Image(
//            painter = painterResource(id = R.drawable.hq720),
//            contentDescription = "train",
//            modifier = Modifier.fillMaxWidth()
//                .padding(10.dp)
//        )

        Text("Radhikapur - Katihar Passenger: 4:53 am")
        Text("Radhikapur - Siliguri DEMU: 6:23 am")
        Text("Katihar - Radhikapur Passenger: 8:53 am")
        Text("Radhikapur - Katihar Passenger: 10:38 am")
        Text("Telta - Radhikapur DEMU: 11:50 am")
        Text("Radhikapur - Telta DEMU: 1:08 pm")
        Text("Katihar - Radhikapur Passenger: 4:48 pm")
        Text("Radhikapur - Katihar Passenger: 6:38 pm")
        Text("Katihar - Radhikapur Passenger: 9:45 pm")
        Text("Siliguri - Radhikapur DEMU: 10:26 pm")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    IsteTheme {
        Greeting3("Android")
    }
}