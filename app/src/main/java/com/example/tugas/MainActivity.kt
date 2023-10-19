package com.example.tugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas.ui.theme.TugasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Rumah()
                }
            }
        }
    }
}

@Composable
fun Rumah() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Abriansyah Adam",
            fontSize = 40.sp)
        Spacer(modifier = Modifier.padding(10.dp))
        Header()
        Spacer(modifier = Modifier.padding(20.dp))
        Location()
        Spacer(modifier = Modifier.padding(20.dp))
        Footer()
    }
}

@Composable
fun Header() {
    val image = painterResource(id = R.drawable.background)
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Gray)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
         Image(painter = image,
             contentDescription = "",
             modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun Location() {
    var img = painterResource(id = R.drawable.point)
    Text(text = "25 C",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold)
    Row {
        Image(painter = img,
            contentDescription = "",
            modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Bengawan, Solo, Jawa Timur",
            textAlign = TextAlign.Center,
            color = Color.DarkGray)
    }
}

@Composable
fun Footer() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Magenta))
    {
        Row(horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(25.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Humidity",
                    textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "78%",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.padding(20.dp))
                Text(text = "Sunset",
                    textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "17.45 PM",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
        Row(horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "UV Index",
                    textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "67%",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.padding(20.dp))
                Text(text = "Sunset",
                    textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "18.03 PM",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TugasTheme {
        Rumah()
    }
}