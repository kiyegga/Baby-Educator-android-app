package com.example.babyeducator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_shapes.*
import java.util.*

class ShapesActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null // variable for text to speech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shapes)

        cardViewNumber.setOnClickListener(){
            speakOut("Circle")
            tvCircle.visibility = View.VISIBLE
        }
        cardViewCone.setOnClickListener(){
            speakOut("Cone")
            tvCone.visibility = View.VISIBLE
        }
        cardViewCylinder.setOnClickListener(){
            speakOut("Cylinder")
            tvCylinder.visibility = View.VISIBLE
        }
        cardViewHeart.setOnClickListener(){
            speakOut("Heart")
            tvHeart.visibility = View.VISIBLE
        }
        cardViewOval.setOnClickListener(){
            speakOut("Oval")
            tvOval.visibility = View.VISIBLE
        }
        cardViewMoon.setOnClickListener(){
            speakOut("Moon")
            tvMoon.visibility = View.VISIBLE
        }
        cardViewPolygon.setOnClickListener(){
            speakOut("Polygon")
            tvPolygon.visibility = View.VISIBLE
        }
        cardViewRectangle.setOnClickListener(){
            speakOut("Rectangle")
            tvRectangle.visibility = View.VISIBLE
        }
        cardViewSquare.setOnClickListener(){
            speakOut("Square")
            tvSquare.visibility = View.VISIBLE
        }
        cardViewPyramind.setOnClickListener(){
            speakOut("Pyramind")
            tvPyramid.visibility = View.VISIBLE
        }
        cardViewStar.setOnClickListener(){
            speakOut("Star")
            tvStar.visibility = View.VISIBLE
        }
        cardViewTriangle.setOnClickListener(){
            speakOut("Triangle")
            tvTriangle.visibility = View.VISIBLE
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