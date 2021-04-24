package com.example.practiceapplication.architecture

import com.example.practiceapplication.`class`.Log

abstract class Animal {
  fun walk() {
    Log.d("abstract", "걷습니다.")
  }
  abstract fun move()
}

class Bird : Animal() {
  override fun move() {
    Log.d("abstract", "날아서 이동합니다.")
  }
}