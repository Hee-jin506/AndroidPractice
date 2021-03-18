package com.example.practiceapplication.variable

import android.os.Bundle
import android.util.Log

class Val {
  fun onCreate(savedInstanceState: Bundle?) {
    val PI = 3.141592F

    val myRoomArea = 10 * 10 * PI

    val constValue = 197
    // constValue = 457

    val HELLO: String = "안녕"
    val HOW_ARE_YOU: String = "어떻게 지내?"
  }
}