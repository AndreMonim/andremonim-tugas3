package com.example.latihan_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihan_1.databinding.ActivityRecyclerviewBinding

class recyclerview : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerviewBinding
    private lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gambar.layoutManager = LinearLayoutManager(this)

        // Data dummy (ganti dengan data Anda)
        val dataList = listOf(
            ItemData(R.drawable.ronaldo, "Nama:Ronaldo", "Asal:Portugal"),
            ItemData(R.drawable.pirlo, "Nama:Pirlo", "Asal:Italy"),
            ItemData(R.drawable.buffon, "Nama:Buffon", "Asal:Italy"),
            ItemData(R.drawable.delpiero, "Nama:Del Piero", "Asal:Italy"),
            ItemData(R.drawable.neymar, "Nama:Neymar", "Asal:Brazil"),
            ItemData(R.drawable.dybala, "Nama:Dybala", "Asal:Argentina"),
            ItemData(R.drawable.bellingham, "Nama:Bellingham", "Asal:Inggris"),
            ItemData(R.drawable.boaz, "Nama:Boaz Solossa", "Asal:Sorong"),
            ItemData(R.drawable.andri, "Nama:Andri Ibo", "Asal:Sentani"),
        )

        adapter = MyAdapter(dataList)
        binding.gambar.adapter = adapter
    }
}