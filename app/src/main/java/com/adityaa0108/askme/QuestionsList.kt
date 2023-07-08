package com.adityaa0108.askme

class QuestionsList {
    private var  question:String
      private  var  option1:String
      private var  option2:String
     private var  option3:String
     private var  option4:String
     private var  answer:String
     private var userSelectedAnswer:String

    constructor(
        question: String,
        option1: String,
        option2: String,
        option3: String,
        option4: String,
        answer: String,
        userSelectedAnswer: String ){
        this.question = question
        this.option1 = option1
        this.option2 = option2
        this.option3 = option3
        this.option4 = option4
        this.answer = answer
        this.userSelectedAnswer = userSelectedAnswer
    }
    fun getQuestion() : String {
        return question
    }
    fun getoption1() : String {
        return option1
    }
    fun getoption2() : String {
        return option2
    }
    fun getoption3() : String {
        return option3
    }
    fun getoption4() : String {
        return option4
    }
    fun getanswer() : String {
        return answer
    }
    fun getUserSelected() : String {
        return userSelectedAnswer
    }

    fun setUserSelectedAnswer( userSelectedAnswer: String){
        this.userSelectedAnswer = userSelectedAnswer
    }



}