package com.tananaev.passportreader

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReadPassport: Button = findViewById(R.id.btnReadPassport)
        val btnShowData: Button = findViewById(R.id.btnShowData)
        val btnSettings: Button = findViewById(R.id.btnSettings)
        txtResult = findViewById(R.id.txtResult)

        btnReadPassport.setOnClickListener {
            txtResult.text = "جاري قراءة بيانات الجواز..."
            // TODO: استدعاء دالة قراءة الجواز
        }

        btnShowData.setOnClickListener {
            txtResult.text = "عرض البيانات المخزنة..."
            // TODO: استدعاء دالة عرض البيانات
        }

        btnSettings.setOnClickListener {
            txtResult.text = "فتح الإعدادات..."
            // TODO: استدعاء شاشة الإعدادات
        }
    }
}
