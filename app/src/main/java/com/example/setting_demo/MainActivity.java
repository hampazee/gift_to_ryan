package com.example.setting_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //MPD的確認按鈕先不做
    Button setting2MPD,setting2NS,setting2SD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setting2MPD = findViewById(R.id.setting_to_MPD);
        setting2NS = findViewById(R.id.setting_to_NS);
        setting2SD = findViewById(R.id.setting_to_SD);


        Intent intent_set2MPD = new Intent();
        Intent intent_set2NS = new Intent();
        Intent intent_set2SD = new Intent();


        setting2MPD.setOnClickListener((v -> {
            intent_set2MPD.setClass(this,modify_personalData.class);
            startActivity(intent_set2MPD);
        }));
        setting2NS.setOnClickListener((v -> {
            intent_set2NS.setClass(this, notification_switch.class);
            startActivity(intent_set2NS);
        }));
        setting2SD.setOnClickListener((v -> {
            intent_set2SD.setClass(this,single_delete.class);
            startActivity(intent_set2SD);
        }));

    }
}