package com.example.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 값으로 컬렉션 생성하기
        var mutableList = mutableListOf("MON", "TUE", "WED")
        // 값을 추가
        mutableList.add("THU")
        // 값을 꺼냄
        Log.d("Collection","mutableList의 첫 번째 값은 ${mutableList.get(0)}입니다.")
        Log.d("Collection","mutableList의 두 번째 값은 ${mutableList.get(1)}입니다.")

        // 2. 빈 컬렉션 생성하기
        var stringList = mutableListOf<String>() // 문자열로 된 빈 컬렉션 생성
        // 값을 추가
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")
        // 값을 변경
        stringList.set(1,"요일 변경")
        // 사용
        Log.d("Collection","stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")
        // 삭제
        stringList.removeAt(1) // 두 번째 값이 삭제됩니다.
        Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")
        // 개수 출력
        Log.d("Collection","stringList에는 ${stringList.size}개의 값이 있습니다.")
    }
}