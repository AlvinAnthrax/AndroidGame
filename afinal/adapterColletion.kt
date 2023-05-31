package com.example.afinal

import android.media.Image
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project.BST
import com.example.project.Node

class adapterColletion(
    private val gambarCollection: String
): RecyclerView.Adapter<adapterColletion.ListViewHolder>() {
    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var _gambarCollection : ImageView = itemView.findViewById(R.id.gambar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recyclerview, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        val context = holder.itemView.context
//        val imageRes = context.resources.getIdentifier(GameView.rot!!.utility[0], "drawable", context.packageName)
        holder._gambarCollection.setImageResource(R.drawable.question)
    }

    override fun getItemCount(): Int {
        return 19
    }

}