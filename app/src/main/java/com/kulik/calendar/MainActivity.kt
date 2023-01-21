package com.kulik.calendar

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
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
fun CalenderDisplay() {
    var backEnabled by remember { mutableStateOf(false) }
    var webView: WebView? = null
    val url = "https://agrohikulik.web.app/calender.html"

    Text("hi", modifier = Modifier.padding(10.dp))
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient = object : WebViewClient() {
                    override fun onPageStarted(view: WebView, url: String?, favicon: Bitmap?) {
                        backEnabled = view.canGoBack()
                    }
                }
                settings.javaScriptEnabled = true

                loadUrl(url)
                webView = this
            }
        }, update = {
            webView = it
        })

    BackHandler(enabled = backEnabled) {
        webView?.goBack()
    }
}

@Composable
fun Home() {
    val shape = CircleShape
    var enabled = true
    val context = LocalContext.current

    Column (verticalArrangement= Arrangement.SpaceBetween) {
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
                        Intent(context, CalendarActivity::class.java).putExtra(
                            "url",
                            "https://agrohikulik.web.app/raiganj_06/basudebpur_115/MouzaMap.html"
                        )
                    )
                },
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IsteTheme {
        Home()
    }
}