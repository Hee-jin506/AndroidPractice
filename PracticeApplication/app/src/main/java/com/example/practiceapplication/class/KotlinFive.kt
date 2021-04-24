package com.example.practiceapplication.`class`

class KotlinFive {
  companion object {
    var one: String = "None"
    fun printOne() {
      Log.d("class", "one에 입력된 값은 ${one}입니다.")
    }
  }
}

class UsingKotlinFive {
  fun usingMember() {
    KotlinFive.one = "새로운 값"
    KotlinFive.printOne();
  }
}