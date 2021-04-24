package com.example.practiceapplication.`null`

class ReplaceNull {
  fun testElvis(str: String?): Int {
    // length 오른쪽에 ?:을 사용하면 null일 경우 ?: 오른쪽의 값이 반환된다.
    var resultNonNull: Int = str?.length?:0
    return resultNonNull;
  }
}