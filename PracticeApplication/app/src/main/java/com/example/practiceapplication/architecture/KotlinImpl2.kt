package com.example.practiceapplication.architecture

class KotlinImpl2 {
  fun main() {
     var kotlinImpl = object : InterfaceKotlin {
       override var variable: String = "init"
       override fun get() {
         // 코드
       }
       override fun set() {
         // 코드
       }
     }
  }
}