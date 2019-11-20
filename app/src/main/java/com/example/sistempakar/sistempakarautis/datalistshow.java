package com.example.sistempakar.sistempakarautis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class datalistshow extends AppCompatActivity {
    int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datalistshow);


        final CustomAdapter adapter = new CustomAdapter(this);

        final TextView shownama = findViewById(R.id.namashow);
        final  TextView showket = findViewById(R.id.keteranganshow);
        final ImageView showimg = findViewById(R.id.imageshow);
        Intent intent = getIntent();
        pos=intent.getExtras().getInt("Position");
   //set data


    shownama.setText(adapter.nm[pos]);
    showket.setText(adapter.ket[pos]);
    showimg.setImageResource(adapter.img[pos]);

    }
}