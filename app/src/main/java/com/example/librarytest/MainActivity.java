package com.example.librarytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastMessage.s(this, "First lib implemented");
    }
}
