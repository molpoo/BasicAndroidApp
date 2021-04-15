package com.thomaspoulainconsulting.basicapp.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thomaspoulainconsulting.basicapp.note.data.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(private val noteRepository: NoteRepository) : ViewModel() {

    private val notes: MutableLiveData<List<String>> by lazy {
        MutableLiveData<List<String>>().also {
            loadNotes()
        }
    }

    fun getNotes(): LiveData<List<String>> {
        return notes
    }

    private fun loadNotes() {
        // Do an asynchronous operation to fetch users.
        notes.value = (listOf("test1", "test2"))
    }

}