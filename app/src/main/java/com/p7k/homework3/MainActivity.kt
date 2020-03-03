package com.p7k.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

public class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       button.setOnClickListener {
           textView.text= "Add: "+(editText.text.toString().toInt()+editText2.text.toString().toInt()).toString()
           textView2.text= "Sub: "+(editText.text.toString().toInt()-editText2.text.toString().toInt()).toString()
           textView3.text= "Mul: "+(editText.text.toString().toInt()*editText2.text.toString().toInt()).toString()
           textView4.text= "Div: "+(editText.text.toString().toInt()/editText2.text.toString().toInt()).toString()
       }
    }
}
