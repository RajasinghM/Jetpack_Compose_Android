package com.learn.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.compose.ui.theme.LearnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Row(modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically) {
                        CustomSurface(1f)
                        CustomSurface(2f, MaterialTheme.colorScheme.primary)

                    }

                }
            }
        }
    }
}

@Composable
fun ColumnPreview() {
    LearnComposeTheme {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally) {
            CustomSurface(1f)
            CustomSurface(2f, MaterialTheme.colorScheme.primary)

        }
    }
}

@Composable
fun ColumnScope.CustomSurface(weight: Float, color: Color = MaterialTheme.colorScheme.tertiary){
    Surface(modifier = Modifier
        .width(200.dp)
        .weight(weight),
        color = color) {

    }
}

@Composable
fun RowScope.CustomSurface(weight: Float, color: Color = MaterialTheme.colorScheme.tertiary){
    Surface(modifier = Modifier
        .height(200.dp)
        .weight(weight),
        color = color) {

    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview(){
    LearnComposeTheme {
        Row(modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically) {
            CustomSurface(1f)
            CustomSurface(2f, MaterialTheme.colorScheme.primary)

        }
    }
}

