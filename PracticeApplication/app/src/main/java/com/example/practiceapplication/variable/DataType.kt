package com.example.practiceapplication.variable

import android.os.Bundle
import android.util.Log

class DataType {
    fun onCreate(savedInstanceState: Bundle?) {

        var doubleValue: Double
        doubleValue = 3.141592

        var floatValue: Float
        floatValue = 3.141592F

        var intValue: Int
        intValue = 2147483647

        intValue = 2_147_483_647

        var longValue: Long
        longValue = 2147483647L

        var shortValue: Short = 32_767
        var byteValue: Byte = 127

        var carValue = 'A'

        var stringValue: String = "ABCDEF"

        var boolValue = true;


    }
}