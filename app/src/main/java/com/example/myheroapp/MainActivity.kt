package com.example.myheroapp

import SuperheroesTheme
import android.R.attr.padding
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myheroapp.model.Hero
import com.example.myheroapp.model.HeroesRepository

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperheroesTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {
                        Text(
                            stringResource(R.string.app_name),
                            style = MaterialTheme.typography.displayLarge,
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )
                    }
                    ) { innerPadding ->
                    print(innerPadding.calculateTopPadding())
                    HeroesScreen(
                        modifier = Modifier.padding(innerPadding).padding(16.dp),
                        heroes = HeroesRepository.heroes
                    )
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
fun GreetingPreview() {
    SuperheroesTheme {
        HeroesScreen(heroes = HeroesRepository.heroes, modifier = Modifier.padding(16.dp))
    }
}