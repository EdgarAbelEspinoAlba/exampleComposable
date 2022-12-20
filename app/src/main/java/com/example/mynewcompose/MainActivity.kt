package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //MySuperText()
                    //ShowTest()
                    MyStateExample()
                }
            }
        }
    }
}

@Composable
fun MyStateExample() {

    var counter by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                counter += 1
            }
        ) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado $counter veces")
    }
}

/*@Preview(
    name = "Preview 1",
    heightDp = 100,
    widthDp = 500,
    showBackground = true,
    showSystemUi = true,
    apiLevel = 29,
    device = Devices.PIXEL
)*/

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DefaultPreview() {
    //MyBox(name = "Android")
    MyStateExample()
}

@Composable
fun MySuperText() {
    Text(
        text = "Hola este es una prueba ",
        modifier = Modifier
            /*.height(50.dp)
            .width(300.dp)*/
            .fillMaxSize()
            .padding(20.dp)
            .clickable {

            }
    )
}

@Composable
fun MyBox(name: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Cyan)
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            Text(text = "Esto es un ejemplo")
        }
    }
}

@Composable
fun MyColumn() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Ejemplo 1",
            modifier = Modifier
                .background((Color.Red))
                .fillMaxWidth()
                .height(100.dp)
            //.weight(2f)
        )
        Text(
            text = "Ejemplo 2",
            modifier = Modifier
                .background((Color.Black))
            //.weight(2f)
        )
        Text(
            text = "Ejemplo 3",
            modifier = Modifier.background((Color.Cyan))
        )
        Text(
            text = "Ejemplo 4",
            modifier = Modifier.background((Color.Blue))
        )
        Text(
            text = "Ejemplo 1",
            modifier = Modifier
                .background((Color.Red))
                .fillMaxWidth()
                .height(100.dp)
            //.weight(2f)
        )
        Text(
            text = "Ejemplo 2",
            modifier = Modifier
                .background((Color.Black))
            //.weight(2f)
        )
        Text(
            text = "Ejemplo 3",
            modifier = Modifier.background((Color.Cyan))
        )
        Text(
            text = "Ejemplo 4",
            modifier = Modifier.background((Color.Blue))
        )
    }
}

@Composable
fun MyRow() {
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Ejemplo 1",
            modifier = Modifier
                .background((Color.Red))
        )
        Text(
            text = "Ejemplo 2",
            modifier = Modifier
                .background((Color.Yellow))
        )
        Text(
            text = "Ejemplo 3",
            modifier = Modifier
                .background((Color.White))
        )
    }
}

@Composable
fun MyComplexLayout() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }
        MySpacer(size = 30)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }
        MySpacer(size = 60)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta),
            Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}

@Composable
fun MySpacer(size: Int) {
    Spacer(
        modifier = Modifier
            .height(size.dp)
    )
}