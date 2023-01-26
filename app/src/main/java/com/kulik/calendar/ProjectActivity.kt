package com.kulik.calendar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kulik.calendar.ui.theme.IsteTheme

class ProjectActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IsteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    UpcomingProjects()
                }
            }
        }
    }
}

@Composable
fun UpcomingProjects() {
    Column(modifier = Modifier.padding(10.dp)) {
        Text(
            text = "Upcoming projects",
            style = TextStyle(fontSize = 28.sp, textDecoration = TextDecoration.Underline)
        )

        Divider()
        Text("NJP redevelopment. The station will be upgraded with modern facilities like an airport and is expected to complete by 2026.")

        Divider()
        Text("Electrification of Barsoi-Radhikapur railway line")
        
        Divider()
        Text(text = "Radhikapur station upgrade. Parking, canteen and platform facilities will be improved.")
    }
}