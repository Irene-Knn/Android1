package com.example.irene

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.irene.ui.theme.IreneTheme

class LoginActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting5()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting5() {
       Column(
           modifier = Modifier
               .fillMaxSize()
               .background(Color.DarkGray),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally

       ) {
           var text by remember { mutableStateOf(TextFieldValue("")) }
           var email by remember { mutableStateOf(TextFieldValue("")) }
           var password by remember { mutableStateOf(TextFieldValue("")) }


           Text(text = "LOG IN :)",
               fontFamily = FontFamily.Serif,
               fontSize = 30.sp,
               color = Color.White

           )

           Image(
               painter = painterResource(id = R.drawable.login),
               contentDescription = "Andy Rubin",
               modifier = Modifier.fillMaxWidth()
           )


            TextField(value = text,
                onValueChange = { newText ->
                    text = newText
                }
            )

           Spacer(modifier = Modifier .height(10.dp))

           TextField(value = email,
               onValueChange = { newText ->
                   email = newText

               }
           )

           Spacer(modifier = Modifier .height(10.dp))

           TextField(value = password,
               onValueChange = { newText ->
                   password = newText
               }
           )














       }






}
