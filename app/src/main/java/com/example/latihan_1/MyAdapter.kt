package com.example.latihan_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val namaList: List<ItemData>) : // Menggunakan List
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.cardImageView)
        val nama: TextView = itemView.findViewById(R.id.cardnama)
        val deskripsi: TextView = itemView.findViewById(R.id.carddeskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemData = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return MyViewHolder(itemData)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text = currentItem.nama
        holder.deskripsi.text = currentItem.deskripsi
    }
}