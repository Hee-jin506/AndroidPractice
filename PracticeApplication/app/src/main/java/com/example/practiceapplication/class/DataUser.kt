package com.example.practiceapplication.`class`

class DataUser {
  data class DataGroup(var name: String, var age: Int)

  fun usingDataClass() {
    var dataGroup = DataGroup("Michael", 21)
    Log.d("DataClass", "dataGroup은 ${dataGroup.toString()}입니다.")
    // DataGroup(name=Michael, age=21)

    var newData = dataGroup.copy()
    Log.d("DataClass", "newData ${newData.toString()}입니다.")
  }
}