package com.example.practiceapplication.architecture

import android.util.Log
import kotlin.String

class Test {
  fun testGenerics() {
    // String을 제네릭으로 사용했기 때문에 list 변수에는 문자열만 담을 수 있다.
    var list: MutableList<String> = mutableListOf()
    list.add("월")
    list.add("화")
    list.add("수")
    // list add(35) // 입력 오류
    // String 타입의 item 변수로 꺼내서 사용할 수 있습니다.
    for (item in list) {
      Log.d("Generic", "list에 입력된 값은 ${item}입니다.")
    }
  }
}