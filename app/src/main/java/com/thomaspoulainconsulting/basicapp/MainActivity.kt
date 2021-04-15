package com.thomaspoulainconsulting.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.thomaspoulainconsulting.basicapp.databinding.ActivityMainBinding
import com.thomaspoulainconsulting.basicapp.note.NoteViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val noteViewModel: NoteViewModel by viewModels()
    private lateinit var activityMainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(activityMainBinding.root)

        noteViewModel.getNotes().observe(this, Observer<List<String>>{ notes ->
            // update UI
            notes.forEach {
                Timber.d(it)
            }
        })
    }
}