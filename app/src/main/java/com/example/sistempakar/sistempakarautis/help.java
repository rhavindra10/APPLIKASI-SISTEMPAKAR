package com.example.sistempakar.sistempakarautis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        TextView text = (TextView) findViewById(R.id.texthelp2) ;
        text.setMovementMethod(new ScrollingMovementMethod());
    }
}
