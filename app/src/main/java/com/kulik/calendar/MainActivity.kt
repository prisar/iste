package com.kulik.calendar

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kulik.calendar.ui.theme.Black
import com.kulik.calendar.ui.theme.IsteTheme
import com.kulik.calendar.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IsteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun BanglaMonths() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp) ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "April to May: বৈশাখ")
        Text(text = "May to June: জ্যৈষ্ঠ")
        Text(text = "June to July: আষাঢ়")
        Text(text = "July to August: শ্রাবণ")
        Text(text = "August to September: ভাদ্র")
        Text(text = "September to October: আশ্বিন")
        Text(text = "October to November: কার্তিক")
        Text(text = "November to December: অগ্রহায়ণ")
        Text(text = "December to January: পৌষ")
        Text(text = "January to February: মাঘ")
        Text(text = "February to March: ফাল্গুন")
        Text(text = "March to April: চৈত্র")
    }
}

@Composable
fun Home() {
    val shape = CircleShape
    var enabled = true
    val context = LocalContext.current

    Column (verticalArrangement= Arrangement.Center) {
        Text(
            text = "Calendar",
            style = TextStyle(
                color = Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .border(2.dp, Black, shape)
                .background(Teal200, shape)
                .padding(16.dp)
                .clickable(enabled = enabled) {
                    enabled = false
                    // onCLick()
                    context.startActivity(
                        Intent(context, CalendarActivity::class.java)
                    )
                },
        )

        Text(
            text = "Upcoming Projects",
            style = TextStyle(
                color = Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .border(2.dp, Black, shape)
                .background(Teal200, shape)
                .padding(16.dp)
                .clickable(enabled = enabled) {
                    enabled = false
                    // onCLick()
                    context.startActivity(
                        Intent(context, ProjectActivity::class.java)
                    )
                },
        )

        Text(
            text = "Radhikapur",
            style = TextStyle(
                color = Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .border(2.dp, Black, shape)
                .background(Teal200, shape)
                .padding(16.dp)
                .clickable(enabled = enabled) {
                    enabled = false
                    // onCLick()
                    context.startActivity(
                        Intent(context, RadhikapurActivity::class.java)
                    )
                },
        )

        Text(
            text = "Dalimgaon",
            style = TextStyle(
                color = Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .border(2.dp, Black, shape)
                .background(Teal200, shape)
                .padding(16.dp)
                .clickable(enabled = enabled) {
                    enabled = false
                    // onCLick()
                    context.startActivity(
                        Intent(context, DalimgaonActivity::class.java)
                    )
                },
        )

        BanglaMonths()
        
        Text(text = "Nearest major stations are Barsoi and Katihar Jn where all kinds of trains are available. Even Vande Bharat Express!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IsteTheme {
        Home()
    }
}