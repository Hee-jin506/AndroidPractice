package com.example.practiceapplication.arrayCollection

import android.os.Bundle
import android.util.Log

class ImmutableCollection {
  fun onCreate(savedInstanceState: Bundle?) {
    var list = listOf("1", "2")
    // list.add("3")
    // list.removeAt(0)

    val IMMUTABLE_LIST = listOf("JAN", "FEB", "MAR")
    // IMMUTABLE_LIST = listOf("APRIL", "MAY")
  }
}