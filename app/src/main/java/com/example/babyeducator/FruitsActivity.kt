package com.example.babyeducator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import com.example.babyeducator.databinding.ActivityFruitsBinding
import java.util.*

class FruitsActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityFruitsBinding
    private var tts: TextToSpeech? = null // variable for text to speech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_fruits)
        binding = ActivityFruitsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardViewApple.setOnClickListener(){
            binding.tvApple.visibility = View.VISIBLE
            speakOut("Apple")
        }
        binding.cardViewPomegranate.setOnClickListener(){
            binding.tvPomegranate.visibility = View.VISIBLE
            speakOut("Pomegranate")
        }
        binding.cardViewBanana.setOnClickListener(){
            binding.tvBanana.visibility = View.VISIBLE
            speakOut("Banana")
        }
        binding.cardViewBlueberries.setOnClickListener(){
            binding.tvBlueberries.visibility = View.VISIBLE
            speakOut("Blue berries")
        }
        binding.cardViewGrapes.setOnClickListener(){
            binding.tvGrapes.visibility = View.VISIBLE
            speakOut("Grapes")
        }
        binding.cardViewCalyxes.setOnClickListener(){
            binding.tvCalyxes.visibility = View.VISIBLE
            speakOut("Calyxes")
        }
        binding.cardViewJackfruit.setOnClickListener(){
            binding.tvJackfruit.visibility = View.VISIBLE
            speakOut("Jackfruit")
        }
        binding.cardViewLemon.setOnClickListener(){
            binding.tvLemon.visibility = View.VISIBLE
            speakOut("Lemon")
        }
        binding.cardViewOrange.setOnClickListener(){
            binding.tvOrange.visibility = View.VISIBLE
            speakOut("Orange")
        }
        binding.cardViewMango.setOnClickListener(){
            binding.tvMango.visibility = View.VISIBLE
            speakOut("Mango")
        }
        binding.cardViewStrawberry.setOnClickListener(){
            binding.tvStrawberry.visibility = View.VISIBLE
            speakOut("Straw berry")
        }
        binding.cardViewSweetcherries.setOnClickListener(){
            speakOut("Sweet cherries")
            binding.tvSweetcherries.visibility = View.VISIBLE
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