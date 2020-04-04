package com.fgihub.stopcoronacmr.ui.symptome

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer

import com.fgihub.stopcoronacmr.R

class SymptomeFragment : Fragment() {

    private lateinit var symptomeViewModel: SymptomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        symptomeViewModel =
            ViewModelProviders.of(this).get(SymptomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_symptome, container, false)
        val textView: TextView = root.findViewById(R.id.text_symptome)
        symptomeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
