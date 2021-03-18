package com.example.practiceapplication.ControlStatement

import android.os.Bundle
import android.util.Log

class When {
  fun onCreate(savedInstanceState: Bundle?) {
    var now = 10
    when (now) {
      8 -> {
        Log.d("when", "현제 시간은 8시입니다.")
      }
      9 -> {
        Log.d("when", "현재 시간은 9시입니다.")
      }
      else -> {
        Log.d("when", "현재 시간은 9시가 아닙니다.")
      }
    }

    now = 9
    when (now) {
      8,9 -> {
        Log.d("when", "현재 시간은 8시 또는 9시입니다.")
      }
      else -> {
        Log.d("when", "햔제 시간은 9시가 아닙니다.")
      }
    }

    var ageOfMichael = 19
    when (ageOfMichael) {
      in 10..19 -> {
        Log.d("when", "마이클은 10대입니다.")
      }
      else -> {
        Log.d("when", "마이클의 나이를 알 수 없습니다.")
      }
    }

    var currentTime = 6
    when {
      currentTime == 5 -> {
        Log.d("when", "현재 시간은 5시입니다.")
      }
      currentTime > 5 -> {
        Log.d("when", "현재 시간은 5시가 넘었습니다.")
      }
      else -> {
        Log.d("when", "현재 시간은 5시 이전입니다.")
      }
    }

    var result = when (10) {
      9 -> {true}
      in 5..20 -> {false}
      else -> {true}
    }

    Log.d("when", "$result")
  }
}