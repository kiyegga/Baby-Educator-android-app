package com.example.babyeducator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import com.example.babyeducator.databinding.ActivityNumbersBinding
import java.util.*

class NumbersActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private lateinit var binding: ActivityNumbersBinding
    private var tts: TextToSpeech? = null // variable for text to speech
    lateinit var view : View
    var sum : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_numbers)
        binding = ActivityNumbersBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.cardViewNumber.setOnClickListener(){
          sum += 1
           binding.tvNumber.setText(sum.toString())
          speakOut(sum.toString())
          //tvNumberInWords.visibility = View.VISIBLE
         // var convertToWord = EnglishNumbersToWord()
          //tvNumberInWords.setText()

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

//private fun TextView.setText(englishNumbersToWord: EnglishNumbersToWord) {
//
//}
