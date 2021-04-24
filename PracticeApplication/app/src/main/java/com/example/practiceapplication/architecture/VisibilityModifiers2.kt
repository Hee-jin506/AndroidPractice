package com.example.practiceapplication.architecture

import android.util.Log

class Child : Parent() {
  fun callVariables() {
    // privateVal 호출 안됨
    Log.d("Modifier", "protected 변수의 값은 ${protectedVal}")
    Log.d("Modifier", "internal 변수의 값은 ${internalVal}")
    Log.d("Modifier", "기본 제한자 변수 defailtVal의 값은 ${defaultVal}")
  }
}

class String {
  fun callVariables() {
    val parent = Parent()
    // protectedVal 호출 안됨
    Log.d("Modifier", "internal 변수의 값은 ${parent.internalVal}")
    Log.d("Modifier", "기본 제한자 변수 defailtVal의 값은 ${parent.defaultVal}")
  }
}