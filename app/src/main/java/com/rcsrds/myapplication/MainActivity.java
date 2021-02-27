package com.rcsrds.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcsrds.mylibrary.TestLibs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new TestLibs(this);
    }
}