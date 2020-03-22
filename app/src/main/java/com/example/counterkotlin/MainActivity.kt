package com.example.counterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var subButton = findViewById<Button>(R.id.subButton);
        var addButton = findViewById<Button>(R.id.addButton);
        var resetButton = findViewById<Button>(R.id.resetButton);
        var editText = findViewById<EditText>(R.id.editText);






    }
}
