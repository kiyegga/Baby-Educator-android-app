package com.example.babyeducator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_letter.*
import java.util.*

class LetterActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null // variable for text to speech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)
        //creating on click which will enable letters to speak
        btnA.setOnClickListener(){
            speakOut("A")
        }
        btnB.setOnClickListener(){
            speakOut("B")
        }
        btnC.setOnClickListener(){
            speakOut("C")
        }
        btnD.setOnClickListener(){
            speakOut("D")
        }
        btnE.setOnClickListener(){
            speakOut("E")
        }
        btnF.setOnClickListener(){
            speakOut("F")
        }
        btnG.setOnClickListener(){
            speakOut("G")
        }
        btnH.setOnClickListener(){
            speakOut("H")
        }
        btnI.setOnClickListener(){
            speakOut("I")
        }
        btnJ.setOnClickListener(){
            speakOut("J")
        }
        btnK.setOnClickListener(){
            speakOut("K")
        }
        btnL.setOnClickListener(){
            speakOut("L")
        }
        btnM.setOnClickListener(){
            speakOut("M")
        }
        btnN.setOnClickListener(){
            speakOut("N")
        }
        btnO.setOnClickListener(){
            speakOut("O")
        }
        btnP.setOnClickListener(){
            speakOut("P")
        }
        btnQ.setOnClickListener(){
            speakOut("Q")
        }
        btnR.setOnClickListener(){
            speakOut("R")
        }
        btnS.setOnClickListener(){
            speakOut("S")
        }
        btnT.setOnClickListener(){
            speakOut("T")
        }
        btnU.setOnClickListener(){
            speakOut("U")
        }
        btnV.setOnClickListener(){
            speakOut("V")
        }
        btnW.setOnClickListener(){
            speakOut("W")
        }
        btnX.setOnClickListener(){
            speakOut("X")
        }
        btnY.setOnClickListener(){
            speakOut("Y")
        }
        btnZ.setOnClickListener(){
            speakOut("Z")
        }
       // initialize the Text To Speech
        tts = TextToSpeech(this,this)

        //if it was picking text from edit text
//        if (EditText.text.isEmpty){
//            Toast.makeText(this, "Enter a text to use TTS", Toast.LENGTH_LONG).show()
//        }else{
//            speakOut(EditText.text.toString())
//        }
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
//******************************************************************************
   // trying to use/access the custome class for text to speech
//             var speecHOut1 = myTTSCustomClass(R.layout.activity_letter,this, this, "A")

           // speecOut1.onInit(status: Int)
//******************************************************************************
}