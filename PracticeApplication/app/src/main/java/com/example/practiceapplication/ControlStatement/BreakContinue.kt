package com.example.practiceapplication.ControlStatement

import android.os.Bundle
import android.util.Log

class BreakContinue {
  fun onCreate(savedInstanceState: Bundle?) {
    for (index in 1..10) {
      Log.d("break", "현재 index는 ${index}입니다.")
      if (index > 5) {
        break
      }
    } // 1, 2, 3, 4, 5, 6

    for (except in 1..10) {
      if (except > 3 && except < 8) {
        continue
      }
      Log.d("contine", "현재 index는 ${except}입니다.")
    } // 1, 2, 3, 8, 9, 10

    
  }
}