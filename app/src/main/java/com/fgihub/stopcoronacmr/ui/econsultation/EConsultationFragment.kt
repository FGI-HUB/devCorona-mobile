package com.fgihub.stopcoronacmr.ui.econsultation

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer

import com.fgihub.stopcoronacmr.R
import com.fgihub.stopcoronacmr.ui.home.HomeViewModel

class EConsultationFragment : Fragment() {

    companion object {
        fun newInstance() = EConsultationFragment()
    }

    private lateinit var eConsultingViewModel: EConsultationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        eConsultingViewModel =
            ViewModelProviders.of(this).get(EConsultationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_e_consultation, container, false)
        val textView: TextView = root.findViewById(R.id.text_e_consultation)
        eConsultingViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

}
