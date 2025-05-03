package com.example.twitterprueba.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitterprueba.R

@Preview(showSystemUi = true)
@Composable
fun Twitter(modifier: Modifier = Modifier) {
    Row(
        modifier
            .fillMaxSize()
            .background(Color(0xff080404))
    ) {
        Profile(Modifier.size(80.dp).background(Color.Gray))
        Spacer(Modifier.size(10.dp))
        Twit()
    }
}

@Composable
fun Profile(modifier: Modifier) {
    Publicacion(
        modifier = modifier,
        publi = R.drawable.ic_launcher_foreground,
        content = "Publicacion"
    )
}

@Composable
fun Twit() {
    Column {
        CabeceraPost()
        DesPost()
        Spacer(Modifier.size(10.dp))
        Publicacion(
            modifier = Modifier
                .size(220.dp)
                .background(Color.Gray),
            publi = R.drawable.ic_launcher_foreground,
            content = "Publicacion"
        )
        Spacer(Modifier.size(10.dp))

    }
}

@Composable
fun CabeceraPost() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Row {
            GenericContent()
        }
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "",
            tint = Color.White
        )
    }
}

@Composable
fun GenericContent() {
    GenericText("Aris", fontWeight = FontWeight.Bold)
    Spacer(Modifier.size(10.dp))
    GenericText("@AristiDevs", color = Color.Gray)
    Spacer(Modifier.size(10.dp))
    GenericText("4h", color = Color.Gray)
}

@Composable
fun Publicacion(modifier: Modifier, publi: Int, content: String) {
    Image(
        painter = painterResource(publi),
        contentDescription = content,
        modifier = modifier,
    )
}

@Composable
fun DesPost() {
    GenericText("Lorem Ipsum")
    GenericText("Lorem Ipsum")
    GenericText("Lorem Ipsum")
    GenericText("Lorem Ipsum")
    GenericText("Lorem Ipsum")
}

@Composable
fun GenericText(
    texto: String,
    color: Color = Color.White,
    fontWeight: FontWeight? = FontWeight.Normal,
    fontSize: TextUnit = 12.sp
) {
    Text(texto, color = color, fontSize = fontSize, fontWeight = fontWeight)
}
