package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    Button button1;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        button1 = findViewById(R.id.btn1);
        textView = findViewById(R.id.tw);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textView.setText(String.valueOf(count));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                textView.setText(String.valueOf(count));
            }
        });
    }

    @Override
    protected void onStart(){
        Log.d("MainAZct", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.d("MainAZct", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.d("MainAZct", "onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        Log.d("MainAZct", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onStop(){
        Log.d("MainAZct", "onStop");
        super.onStop();
    }

}