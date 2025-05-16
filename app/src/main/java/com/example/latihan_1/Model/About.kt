
package com.example.latihan_1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class About: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
    }

}