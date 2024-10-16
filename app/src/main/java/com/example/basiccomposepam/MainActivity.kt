package com.example.basiccomposepam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.basiccomposepam.ui.theme.BasicComposePAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposePAMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Login", style = TextStyle(fontSize = 50.sp,
            fontWeight = FontWeight.Bold ))
        Text(text = "Ini adalah halaman login",
            style = TextStyle(fontSize = 20.sp) )
        Image(painter = painterResource(id = R.drawable.umy), contentDescription = null,
        modifier = Modifier.padding(top = 20.dp).size(200.dp)
        )

        Text(text = "nama",
            modifier = Modifier.padding(top=30.dp))
        Text(text = "Raudatul Jannah", color = Color.Blue,
            style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold) )
        Text(text = "20220140113", color = Color.Magenta,
            style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top=20.dp))
        Image(painter = painterResource(id = R.drawable.fotokecil), contentDescription = null,
            modifier = Modifier.padding(top = 40.dp).size(300.dp))
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicComposePAMTheme {
        BasicLayout()
    }
}