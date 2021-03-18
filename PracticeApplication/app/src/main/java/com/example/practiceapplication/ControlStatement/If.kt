package com.example.practiceapplication.ControlStatement

import android.os.Bundle
import android.util.Log

class If {
  fun onCreate(savedInstanceState: Bundle?) {
    var myNumbers = "1, 2, 3, 4, 5, 6"
    var thisWeekNumbers = "5, 6, 7, 8, 9, 10"

    if (myNumbers == thisWeekNumbers) {
      Log.d("Lotto", "당첨되었습니다")
    }

    var out = 0
    var strike = 3
    if (strike > 2) {
      out = out + 1
    }

    var ball = 4
    if (ball > 3) {
      Log.d("ControlFlow", "4볼로 출루합니다.")
    } else {
      Log.d("ControlFlow", "타석에서 다음 타구를 기다립니다.")
    }

    var a = 1
    var b = 2
    var c = 3

    if (a < b) {
      Log.d("ControlFlow", "1: a는 b보다 작다.")
    }
    if (a < c) {
      Log.d("ControlFlow", "1: a는 c보다 작다.")
    }

    if (a < b) {
      Log.d("ControlFlow", "2: a는 b보다 작다.")
    } else if (a < c) {
      Log.d("ControlFlow", "2: a는 c보다 작다.")
    }

    a = 5
    b = 3
    var bigger = if (a > b) a else b

    bigger = if (a > b) {
      a = a - b
      a
    } else {
      b
    }

    var eraOfRyu = 2.32
    var eraOfDegrom = 2.43

    val era = if (eraOfRyu < eraOfDegrom) {
      Log.d("MLB_Result", "2019 류현진이 디그롬을 이겼습니다.")
      eraOfRyu
    } else {
      Log.d("MLB_Result", "2019 디그롬이 류현진을 이겼습니다.")
      eraOfDegrom
    }

    Log.d("MLB_Result", "2019 MLB에서 가장 높은 ERA는 ${era}입니다.")
  }
}