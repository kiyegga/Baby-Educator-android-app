package com.example.babyeducator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.babyeducator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//       onclick Listener
        binding.cardViewNumber.setOnClickListener(){
           startActivity(Intent(this, LetterActivity::class.java))
        }
        binding.cardViewCone.setOnClickListener(){
            startActivity(Intent(this, ShapesActivity::class.java))
        }
        binding.cardViewHeart.setOnClickListener(){
            startActivity(Intent(this, ColorsActivity::class.java))
        }
        binding.cardViewOval.setOnClickListener(){
            startActivity(Intent(this, NumbersActivity::class.java))
        }
        binding.cardViewPolygon.setOnClickListener(){
            startActivity(Intent(this, FruitsActivity::class.java))
        }
        binding.cardViewRectangle.setOnClickListener(){
            startActivity(Intent(this, AnimalSoundActivity::class.java))
        }
    }

}