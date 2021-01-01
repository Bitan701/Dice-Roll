package com.example.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textResult = findViewById(R.id.textResult);
        Button buttonRoll = findViewById(R.id.buttonRoll);
        ImageView imageDice = findViewById(R.id.imageDice);


        buttonRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumber = random.nextInt(5)+1;
                textResult.setText(""+randomNumber);
                if(randomNumber == 1)
                {
                    imageDice.setImageResource(R.mipmap.rolled_one);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 2)
                {
                    imageDice.setImageResource(R.mipmap.rolled_two);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 3)
                {
                    imageDice.setImageResource(R.mipmap.rolled_three);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 4)
                {
                    imageDice.setImageResource(R.mipmap.rolled_four);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 5)
                {
                    imageDice.setImageResource(R.mipmap.rolled_five);
                    imageDice.setVisibility(View.VISIBLE);
                }
                if(randomNumber == 6)
                {
                    imageDice.setImageResource(R.mipmap.rolled_six);
                    imageDice.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
