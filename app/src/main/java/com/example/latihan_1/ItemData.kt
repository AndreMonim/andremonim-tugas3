package com.example.latihan_1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan_1.model.Item

class ItemCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_card)

        val item = intent.getParcelableExtra<Item>("item")

        val img: ImageView = findViewById(R.id.imageSource)
        val title: TextView = findViewById(R.id.cardnama)
        val desc: TextView = findViewById(R.id.carddesc)

        item?.let {
            img.setImageResource(it.imageSource)
            title.text = it.imageTitle
            desc.text = it.imageDesc
        }
    }
}
