package com.example.songappwithobjects.entities

class Song (var Title: String, var Artist : String, var Year: Int) {
    var Genre = ""


    fun playSong():String
    {
        return this.Title+ " is now playing"
    }

    override fun toString(): String {
        return "Song(Title='$Title', Artist='$Artist', Year=$Year, Genre='$Genre')"
    }


}