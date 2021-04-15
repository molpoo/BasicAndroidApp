package com.thomaspoulainconsulting.basicapp.note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.thomaspoulainconsulting.basicapp.databinding.FragmentNoteBinding

class NoteFragment : Fragment() {

    private lateinit var fragmentNoteBinding: FragmentNoteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentNoteBinding = FragmentNoteBinding.inflate(inflater, container, false)
        return fragmentNoteBinding.root
    }
}