package com.fgihub.stopcoronacmr.ui.follow

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer

import com.fgihub.stopcoronacmr.R


class FollowFragment : Fragment() {

    private lateinit var followViewModel: FollowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        followViewModel =
            ViewModelProviders.of(this).get(FollowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_follow, container, false)
        val textView: TextView = root.findViewById(R.id.text_follow)
        followViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

}
