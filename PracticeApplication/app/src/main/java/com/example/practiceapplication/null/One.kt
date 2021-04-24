package com.example.practiceapplication.`null`

import android.util.Log

class One {
  fun print() {
    Log.d("null_safety", "can you call me?")
  }
}

class CallingOne {
  fun main() {
    var one: One
    // one.print()
  }
}