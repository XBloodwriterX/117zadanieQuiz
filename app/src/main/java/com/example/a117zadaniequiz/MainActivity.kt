package com.example.a117zadaniequiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var currentQuestion = 0;
    private val quizQuestions = listOf(
        QuizQuestion("Które to schronisko?", "Na Rysiance.", "Na Wielkiej Raczy.", "Na Wielkiej Rycerzowej.", 2)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}