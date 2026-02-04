package com.tananaev.passportreader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class RegularActivity : AppCompatActivity() {

    private lateinit var txtInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regular)

        txtInfo = findViewById(R.id.txtInfo)
        txtInfo.text = "واجهة النسخة العادية تعمل بنجاح"
    }
}
