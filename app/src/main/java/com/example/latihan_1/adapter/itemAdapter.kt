package com.example.latihan_1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan_1.model.Item

class ItemAdapter(private val namaList: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.cardImageView)
        val nama: TextView = itemView.findViewById(R.id.cardnama)
        val deskripsi: TextView = itemView.findViewById(R.id.carddeskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemData = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return ItemViewHolder(itemData)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val context = holder.itemView.context
        val item = namaList[position]
        holder.gambar.setImageResource(item.imageSource)
        holder.nama.text = item.imageTitle
        holder.deskripsi.text = item.imageDesc

        holder.itemView.setOnClickListener {
            // Membuat Intent untuk berpindah ke ItemCardActivity
            val intent = Intent(context, ItemCardActivity::class.java)
            // Mengirimkan data item yang diklik ke ItemCardActivity
            intent.putExtra("item", item)
            // Memulai Activity baru
            context.startActivity(intent)
        }
    }
}
