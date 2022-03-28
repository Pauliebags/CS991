package com.example.group_2_final

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Default View
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

//        View.OnClickListener events that change the view
        view.findViewById<Button>(R.id.button_1).setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_directionsFragment)

        }

        return view

    }
}