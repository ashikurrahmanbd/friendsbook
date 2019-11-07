package com.example.friendsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class KamrulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamrul);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
