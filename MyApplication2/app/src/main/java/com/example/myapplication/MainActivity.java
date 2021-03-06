package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button learnColorsBtn;
    Button quizBtn;
    Button ContactBtn;
    Button beta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        learnColorsBtn=findViewById(R.id.learnBtn);

        learnColorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,learnColors.class);
                startActivity(intent);

            }
        });
        beta=findViewById(R.id.listViiewButton);
        quizBtn=findViewById(R.id.quizButtonId);
        ContactBtn=findViewById(R.id.contactUs);
        beta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ListView.class);
                startActivity(intent);
            }
        });
        ContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,GitLink.class);
                startActivity(intent);
            }
        });
        quizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,GuessTheRightColor.class);
                startActivity(intent);
            }
        });
    }


}