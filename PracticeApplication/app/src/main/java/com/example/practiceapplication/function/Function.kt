package com.example.practiceapplication.function

import android.os.Bundle
import android.util.Log

class Function {
  fun square(x: Int):Int {
    return x * x
  }

  fun printSum(x: Int, y: Int) {
    Log.d("fun", "x + y = ${x + y}")
  }

  fun getPi(): Double {
    return 3.14
  }

  fun newFunction(name: String, age: Int = 29, weight: Double = 65.5) {
    Log.d("fun", "name의 값은 ${name}입니다.")
    Log.d("fun", "age의 값은 ${age}입니다.")
    Log.d("fun", "weight의 값은 ${weight}입니다.")
  }

  fun usingFun() {
    var squareResult = square(30)
    Log.d("fun", "30의 제곱은 ${squareResult}")

    printSum(3, 5)

    val PI = getPi()
    Log.d("fun", "지름이 10인 원의 둘레는 ${10 * PI}")

    newFunction("Hello")
    newFunction("Michael", weight = 67.5)
  }



}