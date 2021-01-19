package com.example.babyeducator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_fruits.*
import java.util.*

class FruitsActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null // variable for text to speech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)

        cardViewApple.setOnClickListener(){
            tvApple.visibility = View.VISIBLE
            speakOut("Apple")
        }
        cardViewPomegranate.setOnClickListener(){
            tvPomegranate.visibility = View.VISIBLE
            speakOut("Pomegranate")
        }
        cardViewBanana.setOnClickListener(){
            tvBanana.visibility = View.VISIBLE
            speakOut("Banana")
        }
        cardViewBlueberries.setOnClickListener(){
            tvBlueberries.visibility = View.VISIBLE
            speakOut("Blue berries")
        }
        cardViewGrapes.setOnClickListener(){
            tvGrapes.visibility = View.VISIBLE
            speakOut("Grapes")
        }
        cardViewCalyxes.setOnClickListener(){
            tvCalyxes.visibility = View.VISIBLE
            speakOut("Calyxes")
        }
        cardViewJackfruit.setOnClickListener(){
            tvJackfruit.visibility = View.VISIBLE
            speakOut("Jackfruit")
        }
        cardViewLemon.setOnClickListener(){
            tvLemon.visibility = View.VISIBLE
            speakOut("Lemon")
        }
        cardViewOrange.setOnClickListener(){
            tvOrange.visibility = View.VISIBLE
            speakOut("Orange")
        }
        cardViewMango.setOnClickListener(){
            tvMango.visibility = View.VISIBLE
            speakOut("Mango")
        }
        cardViewStrawberry.setOnClickListener(){
            tvStrawberry.visibility = View.VISIBLE
            speakOut("Straw berry")
        }
        cardViewSweetcherries.setOnClickListener(){
            speakOut("Sweet cherries")
            tvSweetcherries.visibility = View.VISIBLE
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