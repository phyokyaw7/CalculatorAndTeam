package com.p7k.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.teamlayout.*

public class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        plus.setOnClickListener{
            var a = editText.text.toString().toDouble()
            var b = editText2.text.toString().toDouble()
            result.text= "Result: "+(a+b).toString()
        }
        minus.setOnClickListener{
            var a = editText.text.toString().toDouble()
            var b = editText2.text.toString().toDouble()
            result.text="Result: "+(a-b).toString()
        }
        multiply.setOnClickListener{
            var a = editText.text.toString().toDouble()
            var b = editText2.text.toString().toDouble()
            result.text= "Result: "+(a*b).toString()
        }
            division.setOnClickListener{
                var a = editText.text.toString().toDouble()
                var b = editText2.text.toString().toDouble()
                result.text="Result: "+ (a/b).toString()
            }
    }
}
