package com.example.practiceapplication.ControlStatement

import android.os.Bundle
import android.util.Log

class While {
  fun onCreate(savedInstanceState: Bundle?) {
    var a = 1
    while (a == 1) { // 무한루프
      Log.d("while", "조건을 만족하면 여기를 출력하세요!")
    }

    var current = 1
    val until = 12
    while (current < until) {
      Log.d("while", "현재 값은 ${current}입니다.")
      current = current + 1
    }
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11

    var game = 1
    val match = 6
    do {
      Log.d("while", "${game}게임 이겼습니다. 우승까지 ${match-game}게임 남았습니다.")
      game += 1
    } while (game < match)
    // 1, 2, 3, 4, 5, 6

    game = 6
    while (game < match) {
      Log.d("while", "while 테스트")
      game += 1
    }
    // 아무것도 출력되지 않는다.

    game = 6
    do {
      Log.d("while", "while 테스트")
      game += 1
    } while (game < match)
    // while 테스트 한번 출력됨
  }
}