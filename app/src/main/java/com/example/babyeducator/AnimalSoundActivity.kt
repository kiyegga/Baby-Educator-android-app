package com.example.babyeducator

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.babyeducator.databinding.ActivityAnimalSoundBinding

class AnimalSoundActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimalSoundBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_animal_sound)
       // var mediaPlayer : MediaPlayer? = null

        binding = ActivityAnimalSoundBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardViewBaboon.setOnClickListener(){
//            if(mediaPlayer!!.isPlaying){
//                mediaPlayer?.stop()
//            }else {
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.baboon_sound)
                mediaPlayer?.start()
                //mediaPlayer?.release()
              //  mediaPlayer = null
           // }
        }
        binding.cardViewBear.setOnClickListener(){
//            if(mediaPlayer!!.isPlaying){
//                mediaPlayer?.stop()
//            }else {
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.bear_sound)
                mediaPlayer?.start()
                //mediaPlayer?.release()
               // mediaPlayer = null
            //}
        }
        binding.cardViewCat.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.cat_sound)
            mediaPlayer?.start()
        }

        binding.cardViewChimpanzee.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.chimpanzee_sound)
            mediaPlayer?.start()
        }
        binding.cardViewCrocodile.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.crocodile_sound)
            mediaPlayer?.start()
        }
        binding.cardViewDog.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.dog_sound)
            mediaPlayer?.start()
        }
        binding.cardViewElephant.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.elephant_sound)
            mediaPlayer?.start()
        }
        binding.cardViewGorilla.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.gorilla_sound)
            mediaPlayer?.start()
        }
        binding.cardViewMonkey.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.monkey_sound)
            mediaPlayer?.start()
        }
        binding.cardViewLion.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.lion_sound)
            mediaPlayer?.start()
        }
        binding.cardViewSnake.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.snake_sound)
            mediaPlayer?.start()
        }
        binding.cardViewTiger.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.tiger_sound)
            mediaPlayer?.start()
        }
    }
}