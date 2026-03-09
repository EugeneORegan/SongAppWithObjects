package com.example.songappwithobjects

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.songappwithobjects.entities.Song
import com.example.songappwithobjects.ui.theme.SongAppWithObjectsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SongAppWithObjectsTheme {
                var playList = mutableListOf<Song>()
                var a = Song("Bad Penny", "Rory Gallagher", 1977)
                var b = Song("Exit Song", "RadioShed ", 1997)
                var c = Song("Enter Song", "XKY ", 1991)

                playList.add(a)
                playList.add(b)
                playList.add(c)


                for (p in playList) {
                    println(p.playSong())
                }
                displayPlayList(playList)

            }
        }
    }
}

@Composable
fun displayPlayList(songs: List<Song>) {
    LazyColumn() {
        item {
            Spacer(Modifier.size(75.dp))
            Text("Play List")
        }
        items(songs) { song ->
            Text(song.toString())
            HorizontalDivider()
        }

    }


}