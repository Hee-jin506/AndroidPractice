package com.example.practiceapplication.arrayCollection

import android.os.Bundle
import android.util.Log

class Array {
  fun onCreate(savedInstanceState: Bundle?) {
    var students = IntArray(10)
    var longArray = LongArray(10)
    var charArray = CharArray(10)
    var floatArray = FloatArray(10)
    var doubleArray = DoubleArray(10)

    var stringArray = Array(10, {item->""})

    var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

    students[0] = 90
    students.set(1, 91)

    var intArray = IntArray(10)
    // intArray[10] = 100 // ArrayIndexOutOfBoundsException

    var value0 = students[0]
    var value1 = students.get(1)
  }
}