package com.example.practiceapplication.inheritance

open class BaseClass {
  open fun opened() {
  }

  fun notOpend() {
  }
}

class ChildClass : BaseClass() {
  override fun opened() {
  }
  // override fun notOpend() {
  // }
}

