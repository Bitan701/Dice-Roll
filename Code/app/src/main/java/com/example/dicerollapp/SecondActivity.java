package com.example.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button buttonToss = findViewById(R.id.buttonToss);
        ImageView coinImage = findViewById(R.id.imageCoin);

        buttonToss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int coin = random.nextInt(2);
                if(coin == 0){
                    coinImage.setImageResource(R.mipmap.head);
                    coinImage.setVisibility(View.VISIBLE);
                }
                else{
                    coinImage.setImageResource(R.mipmap.tail);
                    coinImage.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
