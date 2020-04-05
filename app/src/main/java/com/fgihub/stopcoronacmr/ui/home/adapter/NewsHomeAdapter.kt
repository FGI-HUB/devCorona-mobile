package com.fgihub.stopcoronacmr.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fgihub.stopcoronacmr.CustomCartItem
import com.fgihub.stopcoronacmr.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cart_item.view.*

/**
 *  Create by stephcyrille (Stephcyril.sc@gmail.com) -- 4/5/20
 */
class NewsHomeAdapter(private val newsList: List<CustomCartItem>): RecyclerView.Adapter<NewsHomeAdapter.NewsHomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHomeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.cart_item,
            parent, false)

        return NewsHomeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewsHomeViewHolder, position: Int) {
        val currentItem = newsList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.setText(currentItem.text1)
        holder.textView2.setText(currentItem.text2)

        //Picasso.with(context).load(currentItem.getImageResourceId(context)).into(holder.itemView.placeImage)
    }

    override fun getItemCount() = newsList.size

    inner class NewsHomeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val imageView: ImageView = itemView.image_view
        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
    }
}