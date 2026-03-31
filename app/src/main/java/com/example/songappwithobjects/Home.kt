package com.example.songappwithobjects

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.songappwithobjects.entities.Song

@Composable
fun Home(navController: NavController) {

    var playList = remember { mutableListOf<Song>() } //1. List created and set up for refreshes

    //2. Five Song objects created for the list
    var a = Song("Bad Penny", "Rory Gallagher", 1977)
    var b = Song("Exit Song", "RadioShed ", 1997)
    var c = Song("Enter Song", "XKY ", 1991)
    var d = Song("Silver in Blood", "Neurosis ", 1997)
    var e = Song("Simai Dei", "OMG ", 1991)

    //3. Songs added to the list to be displayed
    playList.add(a)
    playList.add(b)
    playList.add(c)
    playList.add(d)
    playList.add(e)

    //4. Jumps to the composable to display the playlist
    DisplayPlayList(playList, navController)

}

@Composable
fun DisplayPlayList(songs: List<Song>, navController: NavController) {

    LazyColumn() {

        item {
            Spacer(Modifier.size(75.dp))
            NeursosisPic()
        }
        item {

            Text("Play List")

        }
        items(songs) { song ->
            Row {

                Text(song.Title + " by " + song.Artist)
                Button(onClick = {


                }) { Text("Link ...") }
            }
            HorizontalDivider()

        }




        item {
            Button(onClick = {

                navController.navigate("Rory")
            }) {
                Text(text = "Click here for Rory Screen ")

            }
        }
        item {
            Button(onClick = {
                val roooot = "Neurosis"
                navController.navigate(roooot)
            }) {
                Text(text = "Click here for Neurosis Screen ")

            }
        }
    }
}


@Composable
private fun Albumcover() {

    Image(
        painter = painterResource(id = R.drawable.albumcover),
        contentDescription = "Album Cover",
        modifier = Modifier.fillMaxWidth()

    )
}

/**
 * https://www.jetpackcompose.net/image-in-jetpack-compose
 */
@Composable
private fun NeursosisPic() {
    Image(
        painter = painterResource(id = R.drawable.neurosis),
        contentDescription = "Neurosis Band",
        modifier = Modifier.fillMaxWidth()

    )
}