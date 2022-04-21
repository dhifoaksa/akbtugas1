package com.atlantic.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {
    //21 April 2022 | 10119289 | Dhifo Aksa Hermawan |IF7

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void login(View view){
        startActivity(new Intent(register.this,login.class));
    }
}