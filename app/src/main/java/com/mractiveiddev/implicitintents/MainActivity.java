package com.mractiveiddev.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btnCall, btnCallFriend, openWeb, openMap, openImageCaptur, callContak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = findViewById(R.id.btnCall);
        btnCallFriend = findViewById(R.id.btnCallFriend);
        openWeb = findViewById(R.id.openWeb);
        openMap = findViewById(R.id.openMap);
        openImageCaptur = findViewById(R.id.openImageCaptur);
        callContak = findViewById(R.id.callContak);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        btnCallFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse ("tel:(+62)82210551992"));
                startActivity(intent);
            }
        });

        openWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=-6.2037277,106.7010889,17z State Way, Welcome, Gerbang Tol Karang Tengah Barat 2, Pondok Bahar, Kota Tangerang, Banten"));
                startActivity(intent);
            }
        });

        openMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maulana5ahmad.blogspot.com/"));
                startActivity(intent);

            }
        });

        openImageCaptur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });

        callContak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_EDIT, Uri.parse("content://contacts/people/1"));
                startActivity(intent);
            }
        });

    }

}