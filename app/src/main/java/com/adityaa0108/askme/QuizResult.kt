package com.adityaa0108.askme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class QuizResult : AppCompatActivity() {

    lateinit var startNewQuiz:AppCompatButton
    lateinit var correctanswer:TextView
    lateinit var incorrectanswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_result)
        startNewQuiz = findViewById(R.id.startNewQuiz)
        correctanswer = findViewById(R.id.correctAnswers)
        incorrectanswer = findViewById(R.id.incorrectanswers)

        var getCorrectAnswers = intent.getIntExtra("correct",0)
        var getIncorrectAnswers = intent.getIntExtra("incorrect",0)
        correctanswer.text = "Correct Answer : " +  getCorrectAnswers.toString()
        incorrectanswer.text = "Wrong Answer : " + getIncorrectAnswers.toString()

        startNewQuiz.setOnClickListener {
            val intent = Intent(this@QuizResult,MainActivity::class.java)
            startActivity(intent)
            finish()

        }




    }

    override fun onBackPressed() {
        val intent = Intent(this@QuizResult,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}