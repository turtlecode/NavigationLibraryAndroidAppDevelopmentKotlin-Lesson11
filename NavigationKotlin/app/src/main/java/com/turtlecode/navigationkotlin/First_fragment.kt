package com.turtlecode.navigationkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.metehanfirat.navigationkotlin.First_fragmentDirections
import com.metehanfirat.navigationkotlin.R
import kotlinx.android.synthetic.main.fragment_first_fragment.*


class First_fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button1.setOnClickListener {
            val action = First_fragmentDirections.actionFirstFragmentToSecondFragment2("TurtleCode")
            Navigation.findNavController(it).navigate(action)
        }


    }


}