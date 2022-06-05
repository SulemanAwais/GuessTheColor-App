package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListView extends AppCompatActivity {
String colorList[]={"Red","Orange","Pink","Black","Green","Grey","White","Yellow","Purple"};
int colorImages[]={R.drawable.red,R.drawable.orange,R.drawable.pink,R.drawable.black,R.drawable.green,R.drawable.grey,R.drawable.white,R.drawable.yellow,R.drawable.purple};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
    }
}