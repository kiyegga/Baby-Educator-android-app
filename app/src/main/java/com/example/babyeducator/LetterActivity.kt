package com.example.babyeducator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.babyeducator.databinding.ActivityLetterBinding
import java.util.*

class LetterActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    //view binding using activity
    private lateinit var binding: ActivityLetterBinding

    private var tts: TextToSpeech? = null // variable for text to speech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_letter)
        binding = ActivityLetterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //creating on click which will enable letters to speak
        binding.btnA.setOnClickListener(){
            speakOut("A")
        }
        binding.btnB.setOnClickListener(){
            speakOut("B")
        }
        binding.btnC.setOnClickListener(){
            speakOut("C")
        }
        binding.btnD.setOnClickListener(){
            speakOut("D")
        }
        binding.btnE.setOnClickListener(){
            speakOut("E")
        }
        binding.btnF.setOnClickListener(){
            speakOut("F")
        }
        binding.btnG.setOnClickListener(){
            speakOut("G")
        }
        binding.btnH.setOnClickListener(){
            speakOut("H")
        }
        binding.btnI.setOnClickListener(){
            speakOut("I")
        }
        binding.btnJ.setOnClickListener(){
            speakOut("J")
        }
        binding.btnK.setOnClickListener(){
            speakOut("K")
        }
        binding.btnL.setOnClickListener(){
            speakOut("L")
        }
        binding.btnM.setOnClickListener(){
            speakOut("M")
        }
        binding.btnN.setOnClickListener(){
            speakOut("N")
        }
        binding.btnO.setOnClickListener(){
            speakOut("O")
        }
        binding.btnP.setOnClickListener(){
            speakOut("P")
        }
        binding.btnQ.setOnClickListener(){
            speakOut("Q")
        }
        binding.btnR.setOnClickListener(){
            speakOut("R")
        }
        binding.btnS.setOnClickListener(){
            speakOut("S")
        }
        binding.btnT.setOnClickListener(){
            speakOut("T")
        }
        binding.btnU.setOnClickListener(){
            speakOut("U")
        }
        binding.btnV.setOnClickListener(){
            speakOut("V")
        }
        binding.btnW.setOnClickListener(){
            speakOut("W")
        }
        binding.btnX.setOnClickListener(){
            speakOut("X")
        }
        binding.btnY.setOnClickListener(){
            speakOut("Y")
        }
        binding.btnZ.setOnClickListener(){
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