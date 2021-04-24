package com.example.practiceapplication.architecture

interface InterfaceKotlin {
  var variable: String
  fun get()
  fun set()
}

class KotlinImpl: InterfaceKotlin {
  override var variable: String = "init value"
  override fun get() {
    // 코드 구현
  }

  override fun set() {
    // 코드 구현
  }
}