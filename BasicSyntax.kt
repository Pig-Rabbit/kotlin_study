package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName = "이용규"
        var myAge: Int
        myAge = 31
        myAge = myAge + 1
        Log.d("BasicSyntax", "myName = $myName, myAge $myAge")
    }
}