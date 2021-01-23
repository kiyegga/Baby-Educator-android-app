package com.example.babyeducator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import com.example.babyeducator.databinding.ActivityShapesBinding
import java.util.*

class ShapesActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private lateinit var binding: ActivityShapesBinding

    private var tts: TextToSpeech? = null // variable for text to speech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_shapes)
        binding = ActivityShapesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardViewNumber.setOnClickListener(){
            speakOut("Circle")
            binding.tvCircle.visibility = View.VISIBLE
        }
        binding.cardViewCone.setOnClickListener(){
            speakOut("Cone")
            binding.tvCone.visibility = View.VISIBLE
        }
        binding.cardViewCylinder.setOnClickListener(){
            speakOut("Cylinder")
            binding.tvCylinder.visibility = View.VISIBLE
        }
        binding.cardViewHeart.setOnClickListener(){
            speakOut("Heart")
            binding.tvHeart.visibility = View.VISIBLE
        }
        binding.cardViewOval.setOnClickListener(){
            speakOut("Oval")
            binding.tvOval.visibility = View.VISIBLE
        }
        binding.cardViewMoon.setOnClickListener(){
            speakOut("Moon")
            binding.tvMoon.visibility = View.VISIBLE
        }
        binding.cardViewPolygon.setOnClickListener(){
            speakOut("Polygon")
            binding.tvPolygon.visibility = View.VISIBLE
        }
        binding.cardViewRectangle.setOnClickListener(){
            speakOut("Rectangle")
            binding.tvRectangle.visibility = View.VISIBLE
        }
        binding.cardViewSquare.setOnClickListener(){
            speakOut("Square")
            binding.tvSquare.visibility = View.VISIBLE
        }
        binding.cardViewPyramind.setOnClickListener(){
            speakOut("Pyramind")
            binding.tvPyramid.visibility = View.VISIBLE
        }
        binding.cardViewStar.setOnClickListener(){
            speakOut("Star")
            binding.tvStar.visibility = View.VISIBLE
        }
        binding.cardViewTriangle.setOnClickListener(){
            speakOut("Triangle")
            binding.tvTriangle.visibility = View.VISIBLE
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