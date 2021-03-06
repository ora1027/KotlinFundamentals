package com.example.kotlinfundamentals.guesswordgame.screens.score


import android.util.Log
import androidx.lifecycle.ViewModel


class ScoreViewModel(finalScore: Int) : ViewModel() {

    var score = finalScore

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }

}