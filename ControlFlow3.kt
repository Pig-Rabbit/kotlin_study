package com.example.controlflow3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var era0fRyu = 2.32
        var era0fDegrom = 2.43

        val era = if (era0fRyu < era0fDegrom) {
            Log.d("MLB_Result", "2019 류현진이 디그롬을 이겼습니다.")
            era0fRyu
        } else {
            Log.d("MLB_Result", "2019 디그롬이 류현진을 이겼습니다.")
            era0fDegrom
        }

        Log.d("MLB_Result", "2019 MLB에서 가장 높은 ERA는 ${era}입니다.")
    }
}