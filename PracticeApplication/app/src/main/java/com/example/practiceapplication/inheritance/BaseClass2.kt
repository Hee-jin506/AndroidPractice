package com.example.practiceapplication.inheritance

open class BaseClass2 {
  open var opened: String = "I am"
}

class ChildClass2 : BaseClass2() {
  override var opened: String = "You are"
}