package com.example.babyeducator

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_animal_sound.*

class AnimalSoundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_sound)
       // var mediaPlayer : MediaPlayer? = null

        cardViewBaboon.setOnClickListener(){
//            if(mediaPlayer!!.isPlaying){
//                mediaPlayer?.stop()
//            }else {
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.baboon_sound)
                mediaPlayer?.start()
                //mediaPlayer?.release()
              //  mediaPlayer = null
           // }
        }
        cardViewBear.setOnClickListener(){
//            if(mediaPlayer!!.isPlaying){
//                mediaPlayer?.stop()
//            }else {
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.bear_sound)
                mediaPlayer?.start()
                //mediaPlayer?.release()
               // mediaPlayer = null
            //}
        }
        cardViewCat.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.cat_sound)
            mediaPlayer?.start()
        }

        cardViewChimpanzee.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.chimpanzee_sound)
            mediaPlayer?.start()
        }
        cardViewCrocodile.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.crocodile_sound)
            mediaPlayer?.start()
        }
        cardViewDog.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.dog_sound)
            mediaPlayer?.start()
        }
        cardViewElephant.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.elephant_sound)
            mediaPlayer?.start()
        }
        cardViewGorilla.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.gorilla_sound)
            mediaPlayer?.start()
        }
        cardViewMonkey.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.monkey_sound)
            mediaPlayer?.start()
        }
        cardViewLion.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.lion_sound)
            mediaPlayer?.start()
        }
        cardViewSnake.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.snake_sound)
            mediaPlayer?.start()
        }
        cardViewTiger.setOnClickListener(){
            var mediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.tiger_sound)
            mediaPlayer?.start()
        }
    }
}