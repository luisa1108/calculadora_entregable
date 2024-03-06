package com.vallejo.entrega2;

import static androidx.core.content.ContextCompat.startActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class animationActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(animationActivity.this,MainActivity.class));
                finish();
            }
        }, 7000);
    }
}