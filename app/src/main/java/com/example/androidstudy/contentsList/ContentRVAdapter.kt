package com.example.androidstudy.contentsList

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidstudy.R

class ContentRVAdapter(val context : Context, val items: ArrayList<ContentModel>) : RecyclerView.Adapter<ContentRVAdapter.Viewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentRVAdapter.Viewholder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_rv_item, parent, false)
        return Viewholder(v)
    }

    override fun onBindViewHolder(holder: ContentRVAdapter.Viewholder, position: Int) {


        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class Viewholder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(item : ContentModel) {

            itemView.setOnClickListener{
                val intent = Intent(context, ContentShowActivity::class.java)
                intent.putExtra("url", item.webUrl)
                itemView.context.startActivity(intent)
            }

            val contentTitle = itemView.findViewById<TextView>(R.id.textArea)
            contentTitle.text = item.title

            val imageViewArea = itemView.findViewById<ImageView>(R.id.imageArea)
            Glide.with(context)
                .load(item.imageUrl)
                .into(imageViewArea)

        }
    }

}