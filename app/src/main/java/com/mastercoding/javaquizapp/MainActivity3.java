package com.mastercoding.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView_result);

        Intent intent = getIntent();
        int result = intent.getIntExtra("result",0);

        textView.setText("The Quiz Result\nis out\n\nYour Score is:\n"+result+" / 10");
    }
}