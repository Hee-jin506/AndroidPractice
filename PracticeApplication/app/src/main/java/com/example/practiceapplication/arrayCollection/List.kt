package com.example.practiceapplication.arrayCollection

import android.os.Bundle
import android.util.Log

class List {
  fun onCreate(savedInstanceState: Bundle?) {
    var list = mutableListOf("MON", "TUE", "WED")
    list.add("THU")

    var variable = list.get(1)
    list.set(1, "수정할 값")

    list.removeAt(1)

    var stringList = mutableListOf<String>()

    stringList.add("월")
    stringList.add("화")

    Log.d("Collection", "stringList에 입력된 두번째 값은 ${stringList.get(1)}입니다.")

    stringList.set(1, "수정된 값")
    stringList.removeAt(1)

    list.size
  }
}