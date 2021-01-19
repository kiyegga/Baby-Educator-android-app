package com.example.babyeducator

import android.content.Context
import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class myTTSCustomClass(contentLayoutId: Int,
                       context: Context?,
                       listener: TextToSpeech.OnInitListener?,
                       text: String?
) : AppCompatActivity(contentLayoutId) {
   // engine: String
    private var contentLayoutId : Int = 0
    var context : Context? = null
    var listener: TextToSpeech.OnInitListener? = null
//    var engine : String? = null
      var text : String? = null

    //private var tts: TextToSpeech? = null // variable for text to speech

    init {
        this.contentLayoutId = contentLayoutId
        this.context = context
        this.listener = listener
//        this.engine = engine
        this.text = text

    }



    //initialize the Text To Speech
    //tts = TextToSpeech(this,this)
  var tts: TextToSpeech = TextToSpeech(this.context, this.listener)

   // override fun onInit(status: Int) {
   fun onInit(status: Int) {
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