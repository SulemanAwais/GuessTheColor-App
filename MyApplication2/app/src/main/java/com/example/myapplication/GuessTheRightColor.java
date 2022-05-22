package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class GuessTheRightColor extends AppCompatActivity {
    TextView RightCounter;
    TextView wrongChoice;
    TextView WrongCounter;
    String bTNcOLOR;
    int visability;
    Button Guess;
    Button rightOption;
    Button option2;
    Button option3;
    int RightcolorNumber;
    int wrongOptionColor1;
    int wrongOptionColor2;
    int rightCount=0;
    int FailedCount=0;
    static int count=0;
    int[] RColor=new int[]{R.color.red,R.color.black,R.color.blue,R.color.yellow,R.color.green,R.color.grey,R.color.purple,R.color.pink,R.color.white,R.color.orange};
    String[] colorArray=new String[10];
    public  String randomColor()
    {
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
        int num=randomNum.nextInt(10-0)+0;
        RightcolorNumber=num;

        String value=colorArray[num];
        return value;
    }
    //extra function

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_right_color);


        Guess = findViewById(R.id.guessBtn);
        WrongCounter=findViewById(R.id.FailedCount);

        Guess.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")

            @Override
            public void onClick(View view) {
                count=count+1;
                Guess.setBackgroundColor(getResources().getColor(R.color.white));

                if (count<2)
                {
                    String value=randomColor();
                    bTNcOLOR=value;
                    Guess.setText(value);
                    Random randomNum=new Random();
                    String[] optionArray=new String[3];
                    optionArray[0]="option1";
                    optionArray[1]="option2";
                    optionArray[2]="option3";
                    int num=randomNum.nextInt(3-0);
                    String correctOption=optionArray[num];
                    //

                    if (correctOption.equals("option1"))
                    {
                        rightOption=findViewById(R.id.option1);
                        rightOption.setBackgroundColor(getResources().getColor(RColor[RightcolorNumber]));
                            option3=findViewById(R.id.option2);
                            option2=findViewById(R.id.option3);
                        wrongOptionColor1=randomNum.nextInt(10);
                        Random rnd=new Random();
                        wrongOptionColor2=rnd.nextInt(10);
                        while (true)
                        {
                            if (RightcolorNumber != wrongOptionColor1 && RightcolorNumber != wrongOptionColor2) {

                                option2.setBackgroundColor(getResources().getColor(RColor[wrongOptionColor1]));
                                option3.setBackgroundColor(getResources().getColor(RColor[wrongOptionColor2]));
                                break;
                            }
                            else {
                                wrongOptionColor1 = randomNum.nextInt(10);
                                wrongOptionColor2 = rnd.nextInt(10);
                                continue;
                            }
                        }
                    }

                    else if (correctOption.equals("option2"))
                    {
                        rightOption=findViewById(R.id.option2);
                        rightOption.setBackgroundColor(getResources().getColor(RColor[RightcolorNumber]));
                            option2 = findViewById(R.id.option1);
                            option3 = findViewById(R.id.option3);
                        wrongOptionColor1=randomNum.nextInt(10);
                        Random rnd=new Random();
                        wrongOptionColor2=rnd.nextInt(10);
                        while (true)
                        {
                            if (RightcolorNumber != wrongOptionColor1 && RightcolorNumber != wrongOptionColor2) {

                                option2.setBackgroundColor(getResources().getColor(RColor[wrongOptionColor1]));
                                option3.setBackgroundColor(getResources().getColor(RColor[wrongOptionColor2]));
                                break;
                            }
                            else {
                                wrongOptionColor1 = randomNum.nextInt(10);
                                wrongOptionColor2 = rnd.nextInt(10);
                                continue;
                            }
                        }

                    }
                    else if (correctOption.equals("option3")) {
                        rightOption = findViewById(R.id.option3);
                        rightOption.setBackgroundColor(getResources().getColor(RColor[RightcolorNumber]));
                        option2 = findViewById(R.id.option1);
                        option3 = findViewById(R.id.option2);
                        wrongOptionColor1=randomNum.nextInt(10);
                        Random rnd=new Random();
                        wrongOptionColor2=rnd.nextInt(10);
                        while (true)
                        {
                            if (RightcolorNumber != wrongOptionColor1 && RightcolorNumber != wrongOptionColor2) {

                                option2.setBackgroundColor(getResources().getColor(RColor[wrongOptionColor1]));
                                option3.setBackgroundColor(getResources().getColor(RColor[wrongOptionColor2]));
                                break;
                            }
                            else {
                                wrongOptionColor1 = randomNum.nextInt(10);
                                wrongOptionColor2 = rnd.nextInt(10);
                                continue;
                            }
                        }
                    }
                }
                rightOption.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Guess.setText("Right(click me)");
                        wrongChoice=findViewById(R.id.wrongChoice);

                        wrongChoice.setVisibility(View.INVISIBLE);

                        Guess.setBackgroundColor(getResources().getColor(R.color.green));
                        count=0;
                        RightcolorNumber=0;
                        rightCount=rightCount+1;
                        RightCounter=findViewById(R.id.rightCount2);
                        RightCounter.setText((""+rightCount));
//                        finish();
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Guess.setText(bTNcOLOR);
                        wrongChoice=findViewById(R.id.wrongChoice);
                        wrongChoice.setVisibility(visability);
                        Guess.setBackgroundColor(getResources().getColor(R.color.red));
                        FailedCount=FailedCount+1;
                        WrongCounter=findViewById(R.id.failedCount);
                        WrongCounter.setText((""+FailedCount));
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Guess.setText(bTNcOLOR);
                        wrongChoice=findViewById(R.id.wrongChoice);

                        wrongChoice.setVisibility(visability);

                        Guess.setBackgroundColor(getResources().getColor(R.color.red));
                        FailedCount=FailedCount+1;
                        WrongCounter=findViewById(R.id.failedCount
                        );

                        WrongCounter.setText((""+FailedCount));


                    }
                });
                }


        });


    }
}
