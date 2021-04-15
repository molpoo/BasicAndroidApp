package com.thomaspoulainconsulting.basicapp.note.data

class NoteRepository {

    suspend fun getNotes(): List<String> {
        return listOf("test1", "test2")
    }
}