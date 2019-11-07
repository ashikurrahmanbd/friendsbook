package com.example.friendsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.Inet4Address;

public class MasudActivity extends AppCompatActivity {


    ImageView facebookButton, twitterButton, instaGramButton, youtubeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masud);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        facebookButton = (ImageView) findViewById(R.id.faceBookId);
        twitterButton = (ImageView) findViewById(R.id.twitterId);
        instaGramButton = (ImageView) findViewById(R.id.instagramId);
        youtubeButton = (ImageView) findViewById(R.id.youtubeId);

        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                Uri uri = Uri.parse("https://www.facebook.com/masudrana.adib");

                intent.setData(uri);

                Toast.makeText(MasudActivity.this, "Clicked On Facebook Icon", Toast.LENGTH_SHORT).show();

                startActivity(intent);



            }
        });

        twitterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                Uri uri = Uri.parse("https://twitter.com");

                intent.setData(uri);

                Toast.makeText(MasudActivity.this, "Clicked On Twitter Icon", Toast.LENGTH_SHORT).show();

                startActivity(intent);



            }
        });

        instaGramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                Uri uri = Uri.parse("https://instagram.com");

                intent.setData(uri);

                Toast.makeText(MasudActivity.this, "Clicked On Instagram Icon", Toast.LENGTH_SHORT).show();

                startActivity(intent);



            }
        });

        youtubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                Uri uri = Uri.parse("https://youtube.com");

                intent.setData(uri);

                Toast.makeText(MasudActivity.this, "Clicked On Youtube Icon", Toast.LENGTH_SHORT).show();

                startActivity(intent);



            }
        });



    }
}
