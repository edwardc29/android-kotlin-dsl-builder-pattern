package com.carrion.edward.androidkotlindslbuilderpattern

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.carrion.edward.androidkotlindslbuilderpattern.Student.Companion.student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = student {
            name = "Edward"
            standard = 10
            rollNumber = 710
        }

        Log.i("-zzzzz", "student: ${student.name}, ${student.standard}")
    }
}