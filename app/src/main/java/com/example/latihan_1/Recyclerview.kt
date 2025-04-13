package com.example.latihan_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan_1.model.Item

class RecyclerActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        recyclerView = findViewById(R.id.gambar)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Daftar data pemain
        val dataList = listOf(
            Item(
                R.drawable.ronaldo,
                "Nama: Ronaldo",
                "Cristiano Ronaldo adalah salah satu pesepak bola terbaik sepanjang masa. Ia dikenal karena kecepatan, kekuatan fisik, kemampuan mencetak gol luar biasa, dan etos kerja tinggi. Ia telah bermain untuk klub-klub besar seperti Manchester United, Real Madrid, Juventus, dan Al-Nassr. Ronaldo juga menjadi top skor sepanjang masa Liga Champions dan tim nasional Portugal."
            ),
            Item(
                R.drawable.pirlo,
                "Nama: Pirlo",
                "Andrea Pirlo adalah legenda sepak bola Italia yang dikenal karena visi, akurasi umpan, dan kemampuan mengatur tempo permainan. Ia pernah bermain untuk AC Milan dan Juventus serta membawa Italia juara Piala Dunia 2006."
            ),
            Item(
                R.drawable.buffon,
                "Nama: Buffon",
                "Gianluigi Buffon adalah kiper legendaris asal Italia. Ia terkenal karena refleks cepat dan kepemimpinannya di lapangan. Buffon merupakan bagian penting dari skuad Italia yang menjuarai Piala Dunia 2006."
            ),
            Item(
                R.drawable.delpiero,
                "Nama: Del Piero",
                "Alessandro Del Piero adalah penyerang elegan asal Italia yang terkenal karena kemampuan tendangan bebas dan gol-gol spektakulernya. Ia menghabiskan sebagian besar kariernya di Juventus."
            ),
            Item(
                R.drawable.neymar,
                "Nama: Neymar",
                "Neymar Jr. adalah bintang sepak bola asal Brasil yang dikenal karena dribel, kreativitas, dan flair-nya di lapangan. Ia bermain untuk klub-klub besar seperti Barcelona dan Paris Saint-Germain."
            ),
            Item(
                R.drawable.dybala,
                "Nama: Dybala",
                "Paulo Dybala adalah penyerang Argentina yang dijuluki 'La Joya'. Ia dikenal karena kontrol bola yang luar biasa, tendangan kaki kiri mematikan, dan kontribusinya bersama Juventus dan AS Roma."
            ),
            Item(
                R.drawable.bellingham,
                "Nama: Bellingham",
                "Jude Bellingham adalah gelandang muda berbakat asal Inggris. Ia dikenal karena kematangan dalam bermain, visi, dan kemampuannya mencetak gol. Kini menjadi pemain andalan Real Madrid."
            ),
            Item(
                R.drawable.boaz,
                "Nama: Boaz Solossa",
                "Boaz Solossa adalah salah satu penyerang terbaik Indonesia yang berasal dari Papua. Ia dikenal karena kecepatan, ketajaman, dan loyalitasnya kepada Persipura Jayapura."
            ),
            Item(
                R.drawable.andri,
                "Nama: Andri Ibo",
                "Andri Ibo adalah bek tangguh asal Sentani, Papua. Ia dikenal karena permainan bertahan yang disiplin dan menjadi andalan di berbagai klub Liga Indonesia."
            )
        )


        adapter = ItemAdapter(dataList)
        recyclerView.adapter = adapter
    }
}
