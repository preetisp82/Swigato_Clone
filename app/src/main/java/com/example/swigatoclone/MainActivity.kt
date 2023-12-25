package com.example.swigatoclone

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.text.font.FontWeight.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.swigatoclone.screen.HomeScreen
import com.example.swigatoclone.ui.theme.SwigatoCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val imagesList = mutableListOf<Int>(
            R.drawable.pizza1,
            R.drawable.pizza2,
            R.drawable.pizza3,
            R.drawable.pizza4,
            R.drawable.pizza5,
            R.drawable.pizza6,
            R.drawable.breakfast1,
            R.drawable.breakfast2,
            R.drawable.idli,
            R.drawable.puri,
            R.drawable.dosa,
            R.drawable.burger,
            R.drawable.burger1,
            R.drawable.fries1,
            R.drawable.fries2,
            R.drawable.sushi,
            R.drawable.garlicbread,
            R.drawable.tacos,
            R.drawable.food1,
            R.drawable.food2,
            R.drawable.food4,
            R.drawable.food5
        )
        setContent {
            SwigatoClone {
             HomeScreen(imagesList = imagesList)
            }
            }
        }
    }

@Composable
fun SwigatoClone(content: @Composable () -> Unit   )
{
   content()
}

@SuppressLint("SuspiciousIndentation")
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    val imagesList = mutableListOf<Int>(
        R.drawable.pizza1,
        R.drawable.pizza2,
        R.drawable.pizza3,
        R.drawable.pizza4,
        R.drawable.pizza5,
        R.drawable.pizza6,
        R.drawable.breakfast1,
        R.drawable.breakfast2,
        R.drawable.idli,
        R.drawable.puri,
        R.drawable.dosa,
        R.drawable.burger,
        R.drawable.burger1,
        R.drawable.fries1,
        R.drawable.fries2,
        R.drawable.sushi,
        R.drawable.garlicbread,
        R.drawable.tacos,
        R.drawable.food1,
        R.drawable.food2,
        R.drawable.food4,
        R.drawable.food5
    )
      SwigatoClone {
         HomeScreen(imagesList = imagesList)
      }
}