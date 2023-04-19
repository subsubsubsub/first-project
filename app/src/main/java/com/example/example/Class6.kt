package com.example.example

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Class6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tx1 : TextView = findViewById(R.id.textView1)

        tx1.text = getText(R.string.Naver)
        tx1.textSize = 50F
        tx1.setTextColor(getColor(R.color.purple_700))
        tx1.setTypeface(null, Typeface.BOLD)
        tx1.setTypeface(null, Typeface.ITALIC)
    }
}
