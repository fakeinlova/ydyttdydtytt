package com.example.ydyttdydtytt

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class Adapter(val list : List<Model>) : RecyclerView.Adapter<Adapter.VH>(){
    inner class VH(iv : View) : RecyclerView.ViewHolder(iv){
        val text1 = iv.findViewById<TextView>(R.id.textView)
        val text2 = iv.findViewById<TextView>(R.id.textView2)
        fun bind(it : Model){
            text1.text = it.tv1
            text2.text = it.tv2

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH = VH(LayoutInflater.from(parent.context).inflate(R.layout.cardi, parent,false))

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    }
