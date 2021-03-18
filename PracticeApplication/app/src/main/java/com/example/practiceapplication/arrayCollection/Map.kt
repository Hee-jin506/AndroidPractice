package com.example.practiceapplication.arrayCollection

import android.os.Bundle
import android.util.Log

class Map {
  fun onCreate(savedInstanceState: Bundle?) {
    var map = mutableMapOf<String, String>()

    map.put("키1", "값1")
    map.put("키2", "값2")
    map.put("키3", "값3")

    var value = map.get("키2")
    Log.d("CollectionMap", "map에 입력된 키1의 값은 ${map.get("키1")}입니다.")

    map.put("키2", "수정")
    map.remove("키2")
    Log.d("CollectionMap", "map에 입력된 키1의 값은 ${map.get("키2")}입니다.")
  }
}