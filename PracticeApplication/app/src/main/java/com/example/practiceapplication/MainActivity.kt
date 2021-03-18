package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.practiceapplication.ControlStatement.If

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName = "홍길동"
        var myAge =  27
        myAge = myAge + 1
        Log.d("BasicSyntax", "myName = $myName, myAge = $myAge")

    }
}