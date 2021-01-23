package com.example.babyeducator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import com.example.babyeducator.databinding.ActivityColorsBinding
import java.util.*

class ColorsActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private var tts: TextToSpeech? = null // variable for text to speech

    private lateinit var binding: ActivityColorsBinding

   lateinit var view : View
    var sum : Int = 0

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_colors)
        binding = ActivityColorsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardViewNumber.setOnClickListener(){
            sum += 1
            if(sum == 1) {
                binding.cardViewNumber.setBackgroundResource(android.R.color.holo_green_light)
                binding.tvColorChanger.setText("Holo green")
                speakOut("Holo green")
            }else if(sum == 2){
                binding.cardViewNumber.setBackgroundResource(android.R.color.black)
                binding.tvColorChanger.setText("Black")
                binding.tvColorChanger.setTextColor(R.color.white)
                speakOut("Black")
            }else if(sum == 3){
                binding.cardViewNumber.setBackgroundResource(android.R.color.darker_gray)
                binding.tvColorChanger.setText("Darker Gray")
                speakOut("Darker Gray")
            }else if(sum == 4){
                binding.cardViewNumber.setBackgroundResource(R.color.red)
                binding.tvColorChanger.setText("Red")
                speakOut("Red")
             }else if(sum == 5){
                binding.cardViewNumber.setBackgroundResource(R.color.Cyan)
                binding.tvColorChanger.setText("Cyan")
                speakOut("Cyan")
            }else if(sum == 6){
                binding.cardViewNumber.setBackgroundResource(R.color.Blue)
                binding.tvColorChanger.setText("Blue")
                speakOut("Blue")
                binding.tvColorChanger.setTextColor(R.color.white)
            }else if( sum == 7){
                binding.cardViewNumber.setBackgroundResource(R.color.DarkBlue)
                binding.tvColorChanger.setText("Dark Blue")
                speakOut("Dark Blue")
                binding.tvColorChanger.setTextColor(R.color.white)
            }else if(sum == 8){
                binding.cardViewNumber.setBackgroundResource(R.color.LightBlue)
                binding.tvColorChanger.setText("Light Blue")
                speakOut("Light Blue")
            }else if(sum == 9){
                binding.cardViewNumber.setBackgroundResource(R.color.Purple)
                binding.tvColorChanger.setText("Purple")
                speakOut("Purple")
            }else if(sum == 10){
                binding.cardViewNumber.setBackgroundResource(R.color.Yellow)
                binding.tvColorChanger.setText("Yellow")
                speakOut("Yellow")
            }else if(sum == 11){
                binding.cardViewNumber.setBackgroundResource(R.color.Lime)
                binding.tvColorChanger.setText("Lime")
                speakOut("Lime")
            }else if(sum == 12){
                binding.cardViewNumber.setBackgroundResource(R.color.Magenta)
                binding.tvColorChanger.setText("Magenta")
                speakOut("Magenta")
            }else if(sum == 13){
                binding.cardViewNumber.setBackgroundResource(R.color.white)
                binding.tvColorChanger.setText("White")
                speakOut("White")
            }else if(sum == 14){
                binding.cardViewNumber.setBackgroundResource(R.color.Silvver)
                binding.tvColorChanger.setText("Silver")
                speakOut("Silver")
            }else if(sum == 15){
                binding.cardViewNumber.setBackgroundResource(android.R.color.holo_purple)
                binding.tvColorChanger.setText("Holo Purple")
                speakOut("Holo Purple")
            }else if(sum == 16){
                binding.cardViewNumber.setBackgroundResource(R.color.Gray)
                binding.tvColorChanger.setText("Gray")
                speakOut("Gray")
            }else if(sum == 17){
                binding.cardViewNumber.setBackgroundResource(R.color.Orange)
                binding.tvColorChanger.setText("Orange")
                speakOut("Orange")
            }else if(sum == 18){
                binding.cardViewNumber.setBackgroundResource(R.color.Maroon)
                binding.tvColorChanger.setText("Maroon")
                speakOut("Maroon")
            }else if(sum == 19){
                binding.cardViewNumber.setBackgroundResource(R.color.Green)
                binding.tvColorChanger.setText("Green")
                speakOut("Green")
            }else if( sum == 20){
                binding.cardViewNumber.setBackgroundResource(R.color.Olive)
                binding.tvColorChanger.setText("Olive")
                speakOut("Olive")
            }else {
                binding.cardViewNumber.setBackgroundResource(android.R.color.holo_blue_light)
                binding.tvColorChanger.setText("Holo Blue")
                speakOut("Holo Blue")

                sum = 0
            }
        }

        // initialize the Text To Speech
        tts = TextToSpeech(this,this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS){
            //set US English as Language for tts
            val result = tts!!.setLanguage(Locale.US)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED ) {
                Log.e("TTS", "The Language specified is not Supported")
            }
        }else{
            Log.e("TTS", "Initialization Failed!")
        }
    }
    // in this function we shall use it to stop and shutdown tts which was initialised
    override fun onDestroy() {
        if (tts != null){
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }
    //function is used to speak the text passed to it
    private fun speakOut(text : String){
        tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    }


//    fun makeColored(view: View){
//        when(view){
//            //Boxes using Color class colors for backgroung
//            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
//            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
//
//            //Boxes using Android color resources backgroung
//            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
//            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
//            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
//
//            //boxes using custom colors for background
//            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
//            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
//            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
//
//            else -> view.setBackgroundColor(Color.LTGRAY)
//        }
//    }
//}