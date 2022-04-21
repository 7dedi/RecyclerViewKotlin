package com.example.recyclerviewkotlin

import  android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClubbolaAdapter(private val context: Context, private val clubbola: List<Clubbola>, val listener: (Clubbola) -> Unit)
    : RecyclerView.Adapter<ClubbolaAdapter.ClubbolaViewHolder>(){

    class ClubbolaViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgClubbola = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameClubbola = view.findViewById<TextView>(R.id.tv_item_name)
        val descClubbola = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(clubbola: Clubbola, listener: (Clubbola) -> Unit){
            imgClubbola.setImageResource(clubbola.imgClubbola)
            nameClubbola.text = clubbola.nameClubbola
            descClubbola.text = clubbola.descClubbola
            itemView.setOnClickListener{
                listener(clubbola)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubbolaViewHolder {
        return ClubbolaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_clubbola, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ClubbolaViewHolder, position: Int) {
        holder.bindView(clubbola[position], listener)
    }

    override fun getItemCount(): Int = clubbola.size
    }
