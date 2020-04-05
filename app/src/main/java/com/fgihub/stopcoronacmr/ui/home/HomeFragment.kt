package com.fgihub.stopcoronacmr.ui.home

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.fgihub.stopcoronacmr.CustomCartItem
import com.fgihub.stopcoronacmr.R
import com.fgihub.stopcoronacmr.ui.home.adapter.NewsHomeAdapter
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_home, container, false)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val newsList = generateDummyList(size = 500)

        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.adapter = NewsHomeAdapter(newsList)
        recycler_view.itemAnimator = DefaultItemAnimator()
        recycler_view.setHasFixedSize(true)
    }


    private fun generateDummyList(size: Int): List<CustomCartItem> {
        val list = ArrayList<CustomCartItem>()

        for (i in 0 until size) {
            val drawable = when (i%3) {
                0 -> R.drawable.ic_accessible_black_24dp
                1 -> R.drawable.ic_chrome_reader_mode_black_24dp
                else -> R.drawable.ic_media_play_light
            }

            val item = CustomCartItem(drawable, "Item $i", "Line 2")
            list += item
        }

        return list
    }


}
