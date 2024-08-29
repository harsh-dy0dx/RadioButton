package com.example.radiobutton

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    lateinit var green : RadioButton
    lateinit var blue : RadioButton
    lateinit var yellow : RadioButton
    lateinit var layout : LinearLayout
    lateinit var click : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        green = findViewById(R.id.changegreen)
        blue = findViewById(R.id.changeblue)
        yellow = findViewById(R.id.changeyellow)
        layout = findViewById(R.id.linearLayout)
        click = findViewById(R.id.clickchange)

        click.setOnClickListener{
            if (green.isChecked)
            {layout.setBackgroundColor(Color.GREEN)}
                else if (blue.isChecked)
                {
                layout.setBackgroundColor(Color.BLUE)
            }
                else if (yellow.isChecked){
                    layout.setBackgroundColor(Color.YELLOW)

                }
            }
        }
    }
