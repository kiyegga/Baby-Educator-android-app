package com.example.babyeducator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       onclick Listener
        cardViewNumber.setOnClickListener(){
           startActivity(Intent(this, LetterActivity::class.java))
        }
        cardViewCone.setOnClickListener(){
            startActivity(Intent(this, ShapesActivity::class.java))
        }
        cardViewHeart.setOnClickListener(){
            startActivity(Intent(this, ColorsActivity::class.java))
        }
        cardViewOval.setOnClickListener(){
            startActivity(Intent(this, NumbersActivity::class.java))
        }
        cardViewPolygon.setOnClickListener(){
            startActivity(Intent(this, FruitsActivity::class.java))
        }
        cardViewRectangle.setOnClickListener(){
            startActivity(Intent(this, AnimalSoundActivity::class.java))
        }
    }

}