// File: Profile.kt
package com.example.latihan_1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
    }

}
