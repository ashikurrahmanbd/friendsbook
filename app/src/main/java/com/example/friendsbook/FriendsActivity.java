package com.example.friendsbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class FriendsActivity extends AppCompatActivity {


    CardView masudActivity, kamrulActivity, shafiqActivity, michilActivty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_friends);


        masudActivity = (CardView) findViewById(R.id.masudId);
        kamrulActivity = (CardView) findViewById(R.id.kamrulId);
        shafiqActivity = (CardView) findViewById(R.id.shafiqId);
        michilActivty = (CardView) findViewById(R.id.michilId);


        masudActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, MasudActivity.class);

                startActivity(intent);
            }
        });

        kamrulActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, KamrulActivity.class);

                startActivity(intent);
            }
        });

        shafiqActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriendsActivity.this, ShafiqActivity.class);

                startActivity(intent);
            }
        });



    }
}
