package com.example.irene

import android.annotation.SuppressLint
import android.graphics.Color.GRAY
import android.graphics.Color.RED
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
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

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting3()


            }
        }
    }

@SuppressLint("ModifierFactoryUnreferencedReceiver")

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting3 (){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(GRAY)),

        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "Andy Rubin",

        )

        var text by remember { mutableStateOf(TextFieldValue("")) }
        var email by remember {mutableStateOf(TextFieldValue(""))}
        var password by remember {mutableStateOf(TextFieldValue(""))}
        var address by remember {mutableStateOf(TextFieldValue(""))}



Text("Login",
    fontFamily = FontFamily.Cursive,
    fontSize = 40.sp)

        TextField(
            value = text,
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
        
        Spacer(modifier = Modifier .height(10.dp))


        TextField(value = address,
            onValueChange = {newText ->
                address = newText

            }
        )







        Button(onClick = {
        }) {
            Text(text = "Login")
        }




    }











}









