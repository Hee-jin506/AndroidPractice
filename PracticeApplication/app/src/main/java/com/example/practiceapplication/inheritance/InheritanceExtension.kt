package com.example.practiceapplication.inheritance

import com.example.practiceapplication.`class`.Log

class InheritanceExtension {
  // String 익스텐션 테스트하기
  fun testStringExtension() {
    var original = "Hello"
    var added = "Guys~"
    // plus 함수를 사용해서 문자열을 더할 수 있습니다.
    Log.d("Extension", "added를 더한 값은 ${original.plus(added)}입니다.")
  }
}

fun String.plus(word: String): String {
  return this + word
}