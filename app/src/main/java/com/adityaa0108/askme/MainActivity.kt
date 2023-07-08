package com.adityaa0108.askme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    lateinit var java:CardView
    lateinit var php:CardView
    lateinit var html:CardView
    lateinit var android:CardView
    lateinit var startquiz:Button

       private var selectedTopicName:String = " "


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
             java = findViewById(R.id.javalayout)
        php = findViewById(R.id.phplayout)
        html = findViewById(R.id.htmllayout)
        android = findViewById(R.id.androidlayout)
        startquiz = findViewById(R.id.btnstartquiz)
        java.setOnClickListener {
            selectedTopicName = "JAVA"
            java.setBackgroundResource(R.drawable.round_back_white_strokegreen)
           php.setBackgroundResource(R.drawable.round_back_white)
            html.setBackgroundResource(R.drawable.round_back_white)
                android.setBackgroundResource(R.drawable.round_back_white)
        }
        php.setOnClickListener {
            selectedTopicName = "PHP"
            php.setBackgroundResource(R.drawable.round_back_white_strokegreen)
            java.setBackgroundResource(R.drawable.round_back_white)
            html.setBackgroundResource(R.drawable.round_back_white)
            android.setBackgroundResource(R.drawable.round_back_white)
        }
        html.setOnClickListener {
            selectedTopicName = "HTML"
            html.setBackgroundResource(R.drawable.round_back_white_strokegreen)
            php.setBackgroundResource(R.drawable.round_back_white)
            java.setBackgroundResource(R.drawable.round_back_white)
            android.setBackgroundResource(R.drawable.round_back_white)
        }
        android.setOnClickListener {
            selectedTopicName = "ANDROID"
            android.setBackgroundResource(R.drawable.round_back_white_strokegreen)
            php.setBackgroundResource(R.drawable.round_back_white)
            html.setBackgroundResource(R.drawable.round_back_white)
            java.setBackgroundResource(R.drawable.round_back_white)
        }

          startquiz.setOnClickListener {
              if(selectedTopicName.isEmpty()){
                  Toast.makeText(this,"Please select the Topic",Toast.LENGTH_SHORT).show()
              }
              else{
                    val intent = Intent(this,QuizActivity::class.java)
                  intent.putExtra("selectedTopic",selectedTopicName)
                  startActivity(intent)
              }
          }
    }
}