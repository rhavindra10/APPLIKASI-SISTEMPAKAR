package com.example.sistempakar.sistempakarautis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    AppCompatImageButton imageButton;
    Button btn;
    Intent lokasituju;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//membuat fungsi tombol untuk gambar
// diagnosa
        imageButton = (AppCompatImageButton) findViewById(R.id.diagnosabtn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lokasituju = new Intent(MainActivity.this, diagnosaquest.class);
                startActivity(lokasituju);
            }
        });
//help
        imageButton = (AppCompatImageButton) findViewById(R.id.help);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lokasituju = new Intent(MainActivity.this, help.class);
                startActivity(lokasituju);
            }
        });


//search data
//        imageButton = (AppCompatImageButton) findViewById(R.id.search);
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                lokasituju = new Intent(MainActivity.this, datalist.class);
//                startActivity(lokasituju);
//            }
//        });
//about
        imageButton = (AppCompatImageButton) findViewById(R.id.about);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lokasituju = new Intent(MainActivity.this, about.class);
                startActivity(lokasituju);
            }
        });










    }
    public void onBackPressed(){
        moveTaskToBack(true);
        System.exit(0);
            super.onBackPressed();
        }


}