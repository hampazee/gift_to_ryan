package com.example.setting_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class notification_switch extends AppCompatActivity {

    ImageButton back2setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_switch);

        back2setting = findViewById(R.id.back_to_setting_btn);

        Intent intent_page2set = new Intent();

        back2setting.setOnClickListener((v -> {
            intent_page2set.setClass(this,MainActivity.class);
            startActivity(intent_page2set);
        }));
    }
}