package com.example.counterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var score =0

    fun setText (){
        if(score<=0){
            score=0
        }
        editText.setText(score.toString())
    }

    fun substraction (view: View){
        score--
       setText()
    }

    fun addition (view: View){
        score++
        setText()
    }

    fun reset (view: View){
        score=0
        setText()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var subButton = findViewById<Button>(R.id.subButton)
        var addButton = findViewById<Button>(R.id.addButton)
        var resetButton = findViewById<Button>(R.id.resetButton)
        var editText = findViewById<TextView>(R.id.editText)

    }

}
