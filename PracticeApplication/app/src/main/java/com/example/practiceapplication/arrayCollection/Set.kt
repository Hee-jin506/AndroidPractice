package com.example.practiceapplication.arrayCollection

import android.os.Bundle
import android.util.Log

class Set {
  fun onCreate(savedInstanceState: Bundle?) {
    var set = mutableSetOf<String>()
    set.add("JAN")
    set.add("FEB")
    set.add("MAR")
    set.add("JAN") // 동일한 값은 입력되지 않는다.

    Log.d("Collection", "Set 전체 출력 = ${set}")
    set.remove("FEB")
    Log.d("Collection", "Set 전체 출력 = ${set}")
  }
}