package com.example.swigatoclone.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.swigatoclone.widgets.FoodTile
import com.example.swigatoclone.widgets.SearchBar

@Composable
fun HomeScreen(imagesList: List<Int> = mutableListOf()){
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
         SearchBar()
            TodaySpecial(imagesList.subList(6,10))
           Text(text = "Categories", style = MaterialTheme.typography.h5, modifier = Modifier.padding(start = 10.dp) )

            FoodCategory(imagesList = imagesList.subList(11,17))
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Text(text = "Food of the day" , style = MaterialTheme.typography.h4 , modifier = Modifier.padding(start = 10.dp) , fontWeight = FontWeight.Bold)
            Spacer(
                modifier = Modifier.height(10.dp)
            )
              FoodOfTheDay(imagesList = imagesList.subList(18,22))
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Text(text = "pizzas", style = MaterialTheme.typography.h5, modifier = Modifier.padding(start = 10.dp))
            pizzaRow(imagesList.subList(0,5))

        }
        
    }
}

@Composable
fun FoodOfTheDay(imagesList: List<Int> = mutableListOf<Int>()) {
    LazyRow {
        items(imagesList) { image ->
            Card(
                modifier = Modifier
                    .height(250.dp)
                    .padding(5.dp),
                elevation = 5.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    FoodTile(modifier = Modifier
                        .padding(10.dp)
                        .width(180.dp)
                        .padding(10.dp),
                        imageId = image)
                    Text(text = "", style = MaterialTheme.typography.h6)



                }
            }
        }
    }
}




            @Composable
            fun FoodCategory(imagesList: List<Int> = mutableListOf<Int>()) {
                LazyRow() {
                    items(imagesList) { image ->
                        FoodTile(modifier = Modifier
                            .size(100.dp)
                            .padding(start = 10.dp),
                            imageId = image)
                    }
                }

            }

            @Composable
            fun pizzaRow(imagesList: List<Int> = mutableListOf<Int>()) {
                LazyRow {
                    items(imagesList) { image ->
                        FoodTile(modifier = Modifier
                            .size(130.dp)
                            .padding(10.dp)
                            .clip(CircleShape), imageId = image)
                    }
                }

            }

            @Composable
            fun TodaySpecial(imagesList: List<Int> = mutableListOf<Int>()) {
                LazyRow {
                    items(imagesList) { image ->
                        Box() {
                            FoodTile(modifier = Modifier
                                .width(330.dp)
                                .height(220.dp)
                                .padding(start = 8.dp, end = 6.dp)
                                .shadow(10.dp), imageId = image)

                            Card(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .align(Alignment.BottomCenter)
                                    .width(312.dp),
                                shape = RoundedCornerShape(10.dp),
                                backgroundColor = Color.Red.copy(alpha = 0.7f)
                            )
                            {
                                Text(text = "DEALS UPTO 60% OFF",
                                    style = MaterialTheme.typography.h6,
                                    color = Color.White)
                            }
                        }
                    }
                }
            }
