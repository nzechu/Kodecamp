package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.VISIBLE


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<ConstraintLayout>(R.id.layoutId)


        val picImage = findViewById<ImageView>(R.id.imageView)
        val buttonClick = findViewById<Button>(R.id.button)
        buttonClick.setOnClickListener{

           picImage.visibility = View.INVISIBLE
            //buttonClick.setBackgroundColor(R.color.teal_200)
           layout.setBackgroundResource(R.color.teal_200)
        }

    }


}