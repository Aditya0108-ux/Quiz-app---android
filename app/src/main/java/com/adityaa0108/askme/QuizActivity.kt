package com.adityaa0108.askme

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import java.util.Timer
import java.util.TimerTask
import kotlin.concurrent.scheduleAtFixedRate

class QuizActivity : AppCompatActivity() {

    lateinit var backbutton:ImageView
    lateinit var selectedTopicName:TextView
    lateinit var timer:TextView
    lateinit var questionno:TextView
    lateinit var questions:TextView
    lateinit var option1:AppCompatButton
    lateinit var option2:AppCompatButton
    lateinit var option3:AppCompatButton
    lateinit var option4:AppCompatButton
    lateinit var next:Button
   lateinit var quizTime:Timer
   var currentQuestionPosition = 0
    var selectedOptionByUser = ""


         private   var totalTimeInMins:Int = 1
       private     var seconds:Int = 0
    lateinit  var questionList:List<QuestionsList>
   lateinit  var questionbank:QuestionBank

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        backbutton = findViewById(R.id.backbutton)
        selectedTopicName = findViewById(R.id.selectedTopicName)
        timer = findViewById(R.id.timer)
        questionno = findViewById(R.id.questionNumber)
        questions = findViewById(R.id.questions)
        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)
        next = findViewById(R.id.nextButton)



        var getselectedTopicName:String = intent.getStringExtra("selectedTopic").toString()
                selectedTopicName.text = getselectedTopicName

        questionbank = QuestionBank()
              questionList = questionbank.getQuestions(getselectedTopicName)
        startTimer(timer)
        questionno.text = (currentQuestionPosition+1).toString() + "/" + questionList.count().toString()
        questions.text = questionList.get(0).getQuestion()
            option1.text = questionList.get(0).getoption1()
        option2.text = questionList.get(0).getoption2()
        option3.text = questionList.get(0).getoption3()
        option4.text = questionList.get(0).getoption4()



        backbutton.setOnClickListener{

                quizTime.purge()
                quizTime.cancel()
                startActivity(Intent(this@QuizActivity,MainActivity::class.java))
                finish()
        }

        option1.setOnClickListener {
                         if(selectedOptionByUser.isEmpty()){
                             selectedOptionByUser = option1.text.toString()
                             option1.setBackgroundResource(R.drawable.round_back_red)
                             option1.setTextColor(Color.WHITE)
                             revealAnswer()
                             questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser)
                         }
        }
        option2.setOnClickListener {
            if(selectedOptionByUser.isEmpty()){
                selectedOptionByUser = option2.text.toString()
                option2.setBackgroundResource(R.drawable.round_back_red)
                option2.setTextColor(Color.WHITE)
                revealAnswer()
                questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser)
            }
        }
        option3.setOnClickListener {
            if(selectedOptionByUser.isEmpty()){
                selectedOptionByUser = option3.text.toString()
                option3.setBackgroundResource(R.drawable.round_back_red)
                option3.setTextColor(Color.WHITE)
                revealAnswer()
                questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser)
            }
        }
        option4.setOnClickListener {
            if(selectedOptionByUser.isEmpty()){
                selectedOptionByUser = option4.text.toString()
                option4.setBackgroundResource(R.drawable.round_back_red)
                option4.setTextColor(Color.WHITE)
                revealAnswer()
                questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser)
            }

        }
       next.setOnClickListener{
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(this@QuizActivity,"Please Select an option",Toast.LENGTH_SHORT).show()
                }
            else{
                      changeNextQuestion()
                }
        }




    }


          @SuppressLint("SuspiciousIndentation")
          fun changeNextQuestion(){
              currentQuestionPosition++
              if((currentQuestionPosition+1) == questionList.count()){
                  next.text = "Submit Quiz"
              }
              if(currentQuestionPosition < questionList.count()){
                  selectedOptionByUser = ""
                  option1.setBackgroundResource(R.drawable.round_back_white)
                  option1.setTextColor(Color.parseColor("#1F6BB8"))
                  option2.setBackgroundResource(R.drawable.round_back_white)
                  option2.setTextColor(Color.parseColor("#1F6BB8"))
                  option3.setBackgroundResource(R.drawable.round_back_white)
                  option3.setTextColor(Color.parseColor("#1F6BB8"))
                  option4.setBackgroundResource(R.drawable.round_back_white)
                  option4.setTextColor(Color.parseColor("#1F6BB8"))

                  questionno.text = (currentQuestionPosition+1).toString() + "/" + questionList.count().toString()
                  questions.text = questionList.get(currentQuestionPosition).getQuestion()
                  option1.text = questionList.get(currentQuestionPosition).getoption1()
                  option2.text = questionList.get(currentQuestionPosition).getoption2()
                  option3.text = questionList.get(currentQuestionPosition).getoption3()
                  option4.text = questionList.get(currentQuestionPosition).getoption4()


              }
              else{
                  val intent = Intent(this@QuizActivity,QuizResult::class.java)
                          intent.putExtra("correct",getCorrectAnswers())
                             intent.putExtra("incorrect",getInCorrectAnswers())
                  startActivity(intent)
                  finish()
              }
          }
        fun startTimer(timerTextView:TextView){

            quizTime = Timer()
            quizTime.scheduleAtFixedRate(object : TimerTask() {
                override fun run() {
                    if (seconds == 0) {
                        totalTimeInMins--
                        seconds = 59
                    } else if (seconds == 59 && totalTimeInMins == -1) {
                        quizTime.purge()
                        quizTime.cancel()
                        Toast.makeText(this@QuizActivity, "Time Over", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@QuizActivity, QuizResult::class.java)
                        intent.putExtra("Correct", getCorrectAnswers())
                        intent.putExtra("InCorrect", getInCorrectAnswers())
                        startActivity(intent)
                        finish()
                    } else {
                        seconds--
                    }
                    runOnUiThread( Runnable {
                       var finalMinutes = totalTimeInMins.toString()
                        var finalSeconds = seconds.toString()

                        if(finalMinutes.length == 1){
                            finalMinutes = "0" + finalMinutes
                        }
                             if(finalSeconds.length== 1){
                                 finalSeconds = "0" + finalSeconds
                             }
                        timerTextView.text = finalMinutes + ":" + finalSeconds




                    });


                }
            },1000,1000)

        }

      private  fun getCorrectAnswers():Int{
                var correctAnswers = 0
          for(i in 0..questionList.count()-1){
              var getUserSelectedAnswer:String = questionList.get(i).getUserSelected()
              var getAnswer:String = questionList.get(i).getanswer()
              if(getUserSelectedAnswer.equals(getAnswer)){
                  correctAnswers++
              }
          }
          return correctAnswers
      }
    private  fun getInCorrectAnswers():Int{
                var correctAnswers = 0
          for(i in 0..questionList.count()-1){
              var getUserSelectedAnswer:String = questionList.get(i).getUserSelected()
              var getAnswer:String = questionList.get(i).getanswer()
              if(!getUserSelectedAnswer.equals(getAnswer)){
                  correctAnswers++
              }
          }
          return correctAnswers
      }

    override fun onBackPressed() {
        quizTime.purge()
        quizTime.cancel()
        startActivity(Intent(this@QuizActivity,MainActivity::class.java))
        finish()

    }

    fun revealAnswer(){
        var getAnswer = questionList.get(currentQuestionPosition).getanswer()
        if(option1.text.toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_back_green)
            option1.setTextColor(Color.WHITE)
        }
        else if(option2.text.toString().equals(getAnswer)){
            option2.setBackgroundResource(R.drawable.round_back_green)
            option2.setTextColor(Color.WHITE)
        }
        else if(option3.text.toString().equals(getAnswer)){
            option3.setBackgroundResource(R.drawable.round_back_green)
            option3.setTextColor(Color.WHITE)
        }
        else if(option4.text.toString().equals(getAnswer)){
            option4.setBackgroundResource(R.drawable.round_back_green)
            option4.setTextColor(Color.WHITE)
        }
    }




}