package com.example.practiceapplication.`class`

class KotlinFour {
  var one:String = "None"
  fun printOne() {
    Log.d("class", "one에 입력한 값은 ${one}입니다.")
  }
}

class UsingKotlinFour {
  fun usingMember() {
    var kotlinFour = KotlinFour()
    kotlinFour.one = "new value"
    kotlinFour.printOne()
  }
}