package com.example.controlflow4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var currentTime = 6
        when {
            currentTime == 5 -> {
                Log.d("when", "현재 시간은 5시 입니다.")
            }
            currentTime > 5 -> {
                Log.d("when", "현재 시간은 5시가 넘었습니다.")
            }
            else -> {
                Log.d("when","현재 시간은 5시 이전입니다.")
            }
        }
    }
}