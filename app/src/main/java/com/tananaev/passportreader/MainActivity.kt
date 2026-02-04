package com.tananaev.passportreader;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnReadPassport = findViewById(R.id.btnReadPassport);
        Button btnShowData = findViewById(R.id.btnShowData);
        Button btnSettings = findViewById(R.id.btnSettings);
        txtResult = findViewById(R.id.txtResult);

        btnReadPassport.setOnClickListener(v -> {
            txtResult.setText("جاري قراءة بيانات الجواز...");
            // TODO: استدعاء دالة قراءة الجواز
        });

        btnShowData.setOnClickListener(v -> {
            txtResult.setText("عرض البيانات المخزنة...");
            // TODO: استدعاء دالة عرض البيانات
        });

        btnSettings.setOnClickListener(v -> {
            txtResult.setText("فتح الإعدادات...");
            // TODO: استدعاء شاشة الإعدادات
        });
    }
}
