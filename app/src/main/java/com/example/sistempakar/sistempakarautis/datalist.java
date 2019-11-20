package com.example.sistempakar.sistempakarautis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class datalist extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datalist);

        listView = (ListView) findViewById(R.id.listview);

      final  CustomAdapter adapter = new CustomAdapter(this);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                Intent intent= new Intent(getApplicationContext(),datalistshow.class);
                intent.putExtra("Position",pos);
               startActivity(intent);
            }
        });






    }
}
