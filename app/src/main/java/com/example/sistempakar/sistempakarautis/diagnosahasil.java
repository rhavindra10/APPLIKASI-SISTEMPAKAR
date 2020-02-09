package com.example.sistempakar.sistempakarautis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class diagnosahasil extends AppCompatActivity {
TextView nama,umur,jk,nmpenyakit,btnselesai,btndiagnosa;
Button btnmap;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosahasil);
        final  GlobalClass globalClass = (GlobalClass) getApplicationContext();
        nama = (TextView) findViewById(R.id.hasilnama);
        umur = (TextView) findViewById(R.id.hasilumur);
        jk = (TextView) findViewById(R.id.jeniskel);
        nmpenyakit = (TextView) findViewById(R.id.text123);
        btnselesai =  findViewById(R.id.selesai);
        btndiagnosa = findViewById(R.id.btndiagnosa);
        btnmap = findViewById(R.id.mapbtn);
        TextView txthsil = findViewById(R.id.txt_hasildgnosa);

//        keterangan = (TextView) findViewById(R.id.keterangan);
//        chckbox = (TextView) findViewById(R.id.checkboxactive);

        nama.setText("Nama :" + globalClass.getVar_nama());
        umur.setText("Umur :" + globalClass.getVar_umur());
        jk.setText("Jenis Kelamin :" + globalClass.getVar_jk());
        txthsil.setText("DIAGNOSA : \n" + globalClass.getListdiagnosa()+"\n" );
        nmpenyakit.setText("Hasil Diagnosa menderita penyakit : \n"+ globalClass.getPenyakit1()+
                "\n\n"+"Keterangan : \n" + globalClass.getKeterangan());
        nmpenyakit.setMovementMethod(new ScrollingMovementMethod());
//        keterangan.setText("Keterangan \n\n" + globalClass.getKeterangan());
//
//        chckbox.setText("DIAGNOSA \n\n" + globalClass.getListdiagnosa());



        //btn diagnosa lagi
        btndiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nmpenyakit.setText("");
                Intent intent = new Intent(diagnosahasil.this, diagnosaquest.class);
                startActivity(intent);
                finish();


            }
        });
        //btn keluar dari diagnosa
        btnselesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(diagnosahasil.this, MainActivity.class);
                startActivity(intent);
                nama.setText("");
                umur.setText("");
                jk.setText("");
                nmpenyakit.setText("");
                finish();

            }

        });
//munculuin link map
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/poli+tumbuh+kembang/@-6.3797808,106.6958682,12z"));
                startActivity(browserIntent);
            }
        });



    }
}
