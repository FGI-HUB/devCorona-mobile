package com.fgihub.stopcoronacmr.ui.signal_alert

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer

import com.fgihub.stopcoronacmr.R



class SignalAlertFragment : Fragment() {

    private lateinit var signalAlertViewModel: SignalAlertViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        signalAlertViewModel =
            ViewModelProviders.of(this).get(SignalAlertViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_signal_alert, container, false)
        val textView: TextView = root.findViewById(R.id.text_signal_alert)
        signalAlertViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

}
