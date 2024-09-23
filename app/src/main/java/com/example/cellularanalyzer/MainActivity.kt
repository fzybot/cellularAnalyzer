package com.example.cellularanalyzer

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val value: Int = 0
    val LOG_TAG: String = "myLogs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "onCreate");
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        val helloWorldView: TextView  = findViewById(R.id.helloWorldTextView) as TextView
        helloWorldView.text = "onCreate hello"
        Log.d(LOG_TAG, helloWorldView.text.toString());
    }


    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume");
        val helloWorldView: TextView  = findViewById(R.id.helloWorldTextView) as TextView
        helloWorldView.setText("on Resume Hello")
        Log.d(LOG_TAG, helloWorldView.text.toString());
    }
}