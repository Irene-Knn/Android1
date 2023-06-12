package com.example.irene

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.irene.ui.theme.IreneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                 Greeting()

        }
    }
}

@Composable
fun Greeting(){
Column(
modifier = Modifier
//    .fillMaxSize()
    .background(Color.DarkGray)
    .fillMaxHeight()
    .fillMaxWidth(),

    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally


) {
    Text("Hello World",
        fontSize = 40.sp,
        color = Color.Cyan,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.Cursive

    )
    Spacer(modifier = Modifier
        .height(40.dp)
    )

    Text("This is my new text",
        Modifier .background(Color.Green),
        letterSpacing = 0.5.em

        )

    Text(text = "How are you today?",
        textDecoration = TextDecoration.Underline


        )
}


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        Greeting()

}