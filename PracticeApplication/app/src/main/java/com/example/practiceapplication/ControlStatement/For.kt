package com.example.practiceapplication.ControlStatement

import android.os.Bundle
import android.util.Log

class For {
  fun onCreate(savedInstanceState: Bundle?) {
    for (index in 1..10) {
      Log.d("For", "현재 숫자는 ${index}")
    }
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

    for (index in 1 until 10) {
      Log.d("For", "현재 숫자는 ${index}")
    }
    // 1, 2, 3, 4, 5, 6, 7, 8, 9

    var array = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
    for (index in 0 until array.size) {
      Log.d("For", "현재 월은 ${array.get(index)}입니다.")
    }
    // JAN, FEB, MAR, APR, MAY, JUN

    for (index in 0..100 step 3) {
      Log.d("For", "현재 숫자는 ${index}")
    }
    // 3, 6, 9, 12, 15, ..., 99

    for (index in 10 downTo 0) {
      Log.d("For", "현재 숫자는 ${index}")
    }
    // 10, 9. 8, 7, 6, 5, 4, 3, 2, 1, 0

    var arrayMonth = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
    for (month in arrayMonth) {
      Log.d("For", "현재 월은 ${month}입니다.")
    }
  }
}