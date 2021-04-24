package com.example.practiceapplication.inheritance

import com.example.practiceapplication.`class`.Log

public open class Parent {
  var hello: String = "안녕하세요"

  fun sayHello() {
    Log.d("inheritance", "${hello}")
  }

}

class Child : Parent() {
  fun myHello() {
    hello = "Hello!"
    sayHello()
  }
}
