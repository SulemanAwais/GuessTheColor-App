package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.Array;
import java.util.Random;
public class GuessTheColor extends AppCompatActivity {
TextView colorName;

    public  String randomColor()
        {
            String[] colorArray=new String[10];
            colorArray[0]="red";
            colorArray[1]="black";
            colorArray[2]="blue";
            colorArray[3]="yellow";
            colorArray[4]="green";
            colorArray[5]="grey";
            colorArray[6]="purple";
            colorArray[7]="pink";
            colorArray[8]="white";
            colorArray[9]="orange";
            Random randomNum=new Random();
            int num=randomNum.nextInt(10);
            return colorArray[num];
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_color);
        colorName.findViewById(R.id.colorName);
        String color=randomColor();
    }
}