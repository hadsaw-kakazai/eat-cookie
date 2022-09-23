package com.example.eatcookie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun eatcookie(view : View){
        var text = findViewById<TextView>(R.id.display)
        var image = findViewById<ImageView>(R.id.imageView)
        var btn = findViewById<Button>(R.id.eat)

        image.setImageResource(R.drawable.img_1)
        text.text = "I am full"
        btn.isClickable = false
        btn.text = "Done"


    }
}