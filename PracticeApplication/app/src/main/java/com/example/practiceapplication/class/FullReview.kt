package com.example.practiceapplication.`class`

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practiceapplication.R

class FullReview {
 fun fullRieview() {
    // 1. 생성자가 없는 클래스 호출
    KotlinFour()

    // 2. 클래스의 생성자 사용
    KotlinTwo("안녕")

    // 3. 클래스의 프로퍼티와 메서드 사용하기
    var kotlin = KotlinFour()
    // 메서드를 먼저 출력합니다.
    kotlin.printOne()
    kotlin.one = "Hello"
    kotlin.printOne()

    // 4. 컴패티언 오브젝트 사용하기
    KotlinFive.printOne()
    KotlinFive.one = "Hello"
    KotlinFive.printOne()

    // 5. 데이터 클래스 사용하기
    var dataUser = DataUser.DataGroup("Michael", 21)
    var newUser = dataUser.copy()
    newUser.name = "Jane"
    Log.d("class", "원본 dataUser는 ${dataUser.toString()}")
    Log.d("class", "복사된 newUser는 ${newUser.toString()}")
  }
}
