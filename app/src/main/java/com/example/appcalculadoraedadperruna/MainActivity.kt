package com.example.appcalculadoraedadperruna

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcalculadoraedadperruna.ui.theme.AppCalculadoraEdadPerrunaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppCalculadoraEdadPerrunaTheme {
Surface (
    modifier = Modifier.fillMaxSize(),
    color = MaterialTheme.colorScheme.background
    

){
    GreetingF()

}

            }
        }
    }
}

@Composable
fun GreetingF(modifier: Modifier = Modifier){
   var text by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        modifier = modifier
            .background(color = Color.Transparent)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            GreetingI()
            Greeting()
            OutLineTextFieldSample()
            ElevatedButtonExample()

    }
}

@Composable
fun GreetingI(){
    val imagen = painterResource(id = R.drawable.el_origen_de_bluey)
    Image(
        painter = imagen,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth()

    )
}

@Composable
fun ElevatedButtonExample(){
    ElevatedButton(onClick = {/*TODO*/}) {
        Text(text = "Calcular")

    }
}

@Composable
fun OutLineTextFieldSample() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        modifier = Modifier.padding(40.dp),
        label = { Text(text = "Ingresa tú edad") },
        onValueChange = {
            text = it
        }

    )

    OutlinedTextField(
        value = text,
        modifier = Modifier.padding(40.dp),
        label = { Text(text = "Ingresa tú edad") },
        onValueChange = {
            text = it
        }



    )
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Text(
        text = "Calculadora de edad perruna",
        fontSize = 25.sp,
        fontFamily = FontFamily.Cursive,
        modifier = modifier
            .padding(20.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppCalculadoraEdadPerrunaTheme {
        GreetingF()
    }
}