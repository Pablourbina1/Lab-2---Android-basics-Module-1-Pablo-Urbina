package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.saveable.rememberSaveable


import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.runtime.LaunchedEffect


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Box

import kotlinx.coroutines.delay
//ENUM
enum class Light { Red, Yellow, Green }
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                // Surface proporciona un fondo con el color del tema
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Semaforo()
                }
            }
        }
    }
}

@Composable
fun Semaforo() {
    var state by rememberSaveable{mutableStateOf(Light.Red)}
    LaunchedEffect(Unit) { // Runs ONCE when app starts
        while(true) { // Infinite Loop
            state = Light.Red
            delay(2000)
            state = Light.Green
            delay(2000)
            state = Light.Yellow
            delay(1000)
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Semaforo Preview"
)

@Composable
fun SemaforoPreview() {
    MaterialTheme {

    }
}