package com.example.practiceapplication.`null`

class SafeCall {
  fun testSafeCall(str: String?): Int? {
    // str이 null이면 length를 체크하지 않고 null을 반환합니다.
    var resultNull: Int? = str?.length
    return resultNull;
  }
}