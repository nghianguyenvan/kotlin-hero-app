package com.example.myheroapp

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.myheroapp.model.Hero

@Composable
fun HeroItem( modifier: Modifier = Modifier, hero: Hero){
    Card(modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row (modifier = Modifier.padding(16.dp)){
            Column {
                Text(stringResource(hero.nameRes), style = MaterialTheme.typography.displaySmall)
                Text(stringResource(hero.descriptionRes), style = MaterialTheme.typography.bodyLarge)

            }
            Spacer(modifier = Modifier.width(16.dp))
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(hero.imageRes),
                contentDescription = "",
                modifier = Modifier
                    .height(72.dp)
                    .clip(RoundedCornerShape(8.dp)))

        }

    }

}