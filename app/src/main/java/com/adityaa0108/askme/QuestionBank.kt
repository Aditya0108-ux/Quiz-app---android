package com.adityaa0108.askme

class QuestionBank {
    fun javaQuestions(): List<QuestionsList> {
        var questionsLists: List<QuestionsList>
        questionsLists = ArrayList()
        //Java Questions
        var question1: QuestionsList = QuestionsList(
            "What is the size of int variable?",
            "16 bit",
            "8 bit",
            "32 bit",
            "64 bit",
            "32 bit",
            ""
        )
        var question2: QuestionsList = QuestionsList(
            "What is the default value  of Boolean variable?",
            "true",
            "false",
            "null",
            "not defined",
            "false",
            ""
        )
        var question3: QuestionsList = QuestionsList(
            "Which of the following is the default value of an instance variable?",
            "Depends upon the type of variable",
            "null",
            "0",
            "not assigned",
            "Depends upon the type of variable",
            ""
        )
        var question4: QuestionsList = QuestionsList(
            "Which is the reserved word in the Java programming language?",
            "method",
            "native",
            "reference",
            "array",
            "native",
            ""
        )
        var question5: QuestionsList = QuestionsList(
            "Which  of the following is not keywords or reserved words in java?",
            "if",
            "then",
            "goto",
            "while",
            "then",
            ""
        )
        var question6: QuestionsList = QuestionsList(
            "Which is the valid declarations within an interface definition?",
            "public double method();",
            "public final double method();",
            "static void method(double d1);",
            "protected void method(double d1);",
            "public double method();",
            ""
        )
        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)

        return questionsLists


    }

    fun phpQuestions(): List<QuestionsList> {
        var questionsLists: List<QuestionsList>
        questionsLists = ArrayList()
        //PHP Questions
        var question1: QuestionsList = QuestionsList(
            "What does PHP stand for?",
            "Professional Home page ",
            "Hypertext PreProcessor",
            "Pretext Hypertext Processor",
            "Preprocessor Home Page",
            "Hypertext PreProcessor",
            ""
        )
        var question2: QuestionsList = QuestionsList(
            "Who is father of php?",
            "Rasmus Lerdorf",
            "William Makepiece",
            "Drek Kolkevi",
            "List Barely",
            "Rasmus Lerdorf",
            ""
        )
        var question3: QuestionsList = QuestionsList(
            "PHP files have a default file extension of.",
            ".html",
            ".php",
            ".xml",
            ".json",
            ".php",
            ""
        )
        var question4: QuestionsList = QuestionsList(
            "A PHP script should start with __ and end with __:",
            "< php >",
            "< /php>",
            "< ? ? >",
            "<? php ?>",
            "<? php ?>",
            ""
        )
        var question5: QuestionsList = QuestionsList(
            "Which version of PHP introduced Try/catch Exception?",
            "PHP 4",
            "PHP 5",
            "PHP 6",
            "PHP 5.3",
            "PHP 5",
            ""
        )
        var question6: QuestionsList = QuestionsList(
            "If a = 12 what will be returned when (a == 12)? 5 : 1 is executed?",
            "12",
            "1",
            "5",
            "error",
            "5",
            ""
        )
        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)

        return questionsLists

    }

    fun htmlQuestions(): List<QuestionsList> {
        var questionsLists: List<QuestionsList>
        questionsLists = ArrayList()
        //HTML Questions
        var question1: QuestionsList = QuestionsList(
            "HTML stands for?",
            "Hyper Text MarkUp Language",
            "High Text Markup Language",
            "Hyper Tabular Markup Language",
            "None of these",
            "Hyper Text MarkUp Language",
            ""
        )
        var question2: QuestionsList = QuestionsList(
            "Which of the following tag is used to mark the begining of paragraph?",
            "<TD>",
            "<br>",
            "<P>",
            "<TR>",
            "<P>",
            ""
        )
        var question3: QuestionsList = QuestionsList(
            "From which tag descriptive list starts ?",
            "<LL>",
            "<DD>",
            "<DL>",
            "<D5>",
            "<DL>",
            ""
        )
        var question4: QuestionsList = QuestionsList(
            "Correct HTML tag for the largest heading is",
            "<head>",
            "<large>",
            "<h1>",
            "<heading>",
            "<h1>",
            ""
        )
        var question5: QuestionsList = QuestionsList(
            "The attribute of <form> tag",
            "Method",
            "Action",
            "Both (a)&(b)",
            "None of these",
            "Both (a)&(b)",
            ""
        )
        var question6: QuestionsList = QuestionsList(
            "Markup tags tell the web browser",
            "How to organise the page",
            "How to display the page",
            "How to display message box on page",
            "None of these",
            "How to display the page",
            ""
        )
        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)

        return questionsLists


    }

    fun androidQuestions(): List<QuestionsList> {
        var questionsLists: List<QuestionsList>
        questionsLists = ArrayList()
        //Android Questions
        var question1: QuestionsList = QuestionsList(
            "Select a component which is NOT part of Android Architecture",
            "Android Framework ",
            "Libraries ",
            "Linux kernel",
            "Android Document",
            "Linux kernel",
            ""
        )
        var question2: QuestionsList = QuestionsList(
            "A __ makes a specific set of application data available to other applications.",
            "Content Provider",
            "BroadCast Receiver",
            "Intent",
            "None of these",
            "Content Provider",
            ""
        )
        var question3: QuestionsList = QuestionsList(
            "Which among these are NOT part of Android's native libraries?",
            "Webkit",
            "Dalvik",
            "OpenGl",
            "SQLite",
            "Dalvik",
            ""
        )
        var question4: QuestionsList = QuestionsList(
            "During an Activity life-cycle,what is the first callback method invoked by the system?",
            "onStop()",
            "onStart()",
            "onCreate()",
            "onRestore()",
            "onCreate()",
            ""
        )
        var question5: QuestionsList = QuestionsList(
            "What Activity method you use to retrieve a reference to an Android view by using the id attribute of a resource Xml",
            "findViewByReference(int id);",
            "findViewById(int id);",
            "findViewById(String id);",
            "retreiveResourceById(int id);",
            "findViewById(int id);",
            ""
        )
        var question6: QuestionsList = QuestionsList(
            "The requests from Content Provider class is handled by the method  ",
            "onCreate",
            "onSelect",
            "ContentResolver",
            "onClick",
            "ContentResolver",
            ""
        )
        //add all questions to List<QuestionsList>
        questionsLists.add(question1)
        questionsLists.add(question2)
        questionsLists.add(question3)
        questionsLists.add(question4)
        questionsLists.add(question5)
        questionsLists.add(question6)

        return questionsLists


    }

    fun getQuestions(selectedTopicName:String):List<QuestionsList>{
        when(selectedTopicName){
            "JAVA" -> return javaQuestions()
            "PHP" -> return phpQuestions()
            "HTML" -> return htmlQuestions()
            else -> return androidQuestions()
        }

    }

}