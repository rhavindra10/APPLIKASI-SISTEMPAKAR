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
        txthsil.setText("DIAGNOSA : \n" + globalClass.getListdiagnosa() + "\n" );
        nmpenyakit.setText("Hasil Diagnosa menderita penyakit : \n"+ globalClass.getPenyakit1()+
                "\n\n"+"Keterangan : \n" + globalClass.getKeterangan());
        nmpenyakit.setMovementMethod(new ScrollingMovementMethod());
//        keterangan.setText("Keterangan \n\n" + globalClass.getKeterangan());
//
//        chckbox.setText("DIAGNOSA \n\n" + globalClass.getListdiagnosa());
        btndiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nmpenyakit.setText("");
                Intent intent = new Intent(diagnosahasil.this, diagnosaquest.class);
                startActivity(intent);
                finish();


            }
        });
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

        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?safe=strict&ei=vB45XayqFfjfz7sPx72IkAg&q=rumah+sakit+spesialis+anak+terdekat&oq=rumah+sakit+spesialis+anak+terdekat&gs_l=mobile-gws-serp.12...0.0.2.14.0.0.0.0.0.0.0.0..0.0....0...1c..64.mobile-gws-serp..0.0.0....0.fEvN6pU0gLs#istate=lrl:mlt"));
                startActivity(browserIntent);
            }
        });



    }
}
