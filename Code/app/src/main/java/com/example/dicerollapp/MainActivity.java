package com.example.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    int randomNumber;
    int i = 5;
    int[] array = new int[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textResult = findViewById(R.id.textResult);
        Button buttonRoll = findViewById(R.id.buttonRoll);
        ImageView imageDice = findViewById(R.id.imageDice);
        TextView textHistory = findViewById(R.id.historyTextView);
        TextView textHistory1 = findViewById(R.id.historyTextView1);
        TextView textHistory2 = findViewById(R.id.historyTextView2);
        TextView textHistory3 = findViewById(R.id.historyTextView3);
        TextView textHistory4 = findViewById(R.id.historyTextView4);

        buttonRoll.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                randomNumber = random.nextInt(5)+1;
                textResult.setText(""+randomNumber);
                array[i] = randomNumber;
                i++;
                textHistory.setText("History");
                textHistory1.setText(""+array[i-2]);
                textHistory2.setText(""+array[i-3]);
                textHistory3.setText(""+array[i-4]);
                textHistory4.setText(""+array[i-5]);

                if(randomNumber == 1) {
                    imageDice.setImageResource(R.mipmap.rolled_one);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 2) {
                    imageDice.setImageResource(R.mipmap.rolled_two);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 3) {
                    imageDice.setImageResource(R.mipmap.rolled_three);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 4) {
                    imageDice.setImageResource(R.mipmap.rolled_four);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 5) {
                    imageDice.setImageResource(R.mipmap.rolled_five);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 6) {
                    imageDice.setImageResource(R.mipmap.rolled_six);
                    imageDice.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
