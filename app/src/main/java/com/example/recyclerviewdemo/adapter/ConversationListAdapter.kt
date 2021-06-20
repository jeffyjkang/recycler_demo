package com.example.recyclerviewdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.model.Conversation
import kotlinx.android.synthetic.main.conversation_item_layout.view.*

class ConversationListAdapter(val data: MutableList<Conversation>): RecyclerView
.Adapter<ConversationListAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image: ImageView = view.convo_image
        val name: TextView = view.convo_name
        val message: TextView = view.convo_text
        val time: TextView = view.convo_time
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context)
            .inflate(R.layout.conversation_item_layout, parent, false)
        return ViewHolder(viewGroup)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.message.text = data[position].message
        holder.name.text = data[position].name
        holder.time.text = data[position].time.toString()
        holder.image.setImageDrawable(data[position].image)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}