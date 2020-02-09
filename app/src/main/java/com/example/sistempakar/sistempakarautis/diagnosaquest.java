package com.example.sistempakar.sistempakarautis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class diagnosaquest extends AppCompatActivity {
    Button btn;
    CheckBox check1, check2,check3,
            check4,check5,check6,check7
            ,check8,check9,check10,check11,check12;
    ArrayList<String> selection;
    int total = 0 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosaquest);

        btn  = (Button) findViewById(R.id.proses);
        check1 = findViewById(R.id.checkBox1);
        check2 = findViewById(R.id.checkBox2);
        check3 = findViewById(R.id.checkBox3);
        check4 = findViewById(R.id.checkBox4);
        check5 = findViewById(R.id.checkBox5);
        check6 = findViewById(R.id.checkBox6);
        check7 = findViewById(R.id.checkBox7);


        selection = new ArrayList<>();






        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final  GlobalClass globalClass = (GlobalClass) getApplicationContext();
                //check1
                String BukanASD = "Bukan ASD";
                String PenjelasanBukanASD = "Bila tidak memenuhi kriteris 1(min 1) dan 2 (min2)  berarti dia bukan autis, bisa jadi cm satu gejala terjadi karena lingkungannya melakukan pembiaran (seperti ; main sendiri dengan gadget sehingga tidak memperdulikan sekitarnya atau jarang diketemukan dengan " +
                        "orang lain /teman sebaya sehingga takut menatap mata orang lain/menangis di tempat ramai)";

                String positifASD = "Autism Spectrum Disorder (Autisme)";
                String PenjelasanASD= "Autisme adalah gangguan perkembangan otak yang mempengaruhi kemampuan penderita dalam berkomunikasi dan berinteraksi dengan orang lain\n" +
                        "Gejala individu autistik yang harus muncul (salah satu atau kesemuanya) adalah gangguan interaksi kualitatif, gangguan komunikasi yang tidak diusahakan diatasi dengan kemampuan komunikasi non-verbal, dan perilaku repetitif terbatas dengan pola minat, perilaku dan aktifitas berulang.\n" +
                        "Kriteria Utama ASD (Autism Spectrum Disorder ) dalam DSM-5 (Diagnostic and Statistical Manual of Mental Disorders ) terdiri dari:\n" +
                        "1.               Kriteria Spesifik : Defisit dalam komunikasi social / interaksi social yaitu,\n" +
                        "a.       Defisit emosi social yang imbal balik, seperti rendahnya kemampuan untuk berbagi minat, rendahnya kemampuan untuk saling mempengaruhi, rendahnya / tidak ada inisiatif dalam berinteraksi.\n" +
                        "b.       Defisit dalam perilaku komunikasi nonverbal yang ditunjukan dalam interaksi social, seperti ketidakmampuan melakukan kontak mata, kurangnya ekspresi wajah dan bahasa tubuh.\n" +
                        "c.       Defisit dalam mengembangkan dan memelihara hubungan social serta berperilaku sesuai konteks social dan tingkat perkembangan, seperti rendahnya kemampuan bermain imajinatif, kurangnya minat dalam pertemanan, dan tidak menunjukan minat terhadap keberadaan orang lain.\n" +
                        "2.            Kriteria Spesifik : Minat dan perilaku yang terbatas / Berulang-ulang, setidaknya ada 2 dari 4 kriteria berikut yang harus ditemukan baik dari kondisi terkini maupun dari riwayat perkembangan yaitu,\n" +
                        "a.       Perilaku stereotip baik dengan mengulang-ulang kata, gerakan motoric atau caranya menggunakan benda.\n" +
                        "b.      Rutinitas yang berlebihan, pola-pola perilaku yang ritual.\n" +
                        "c.       Sangat terbatas, terpaku pada minat-minat tertentu.\n" +
                        "d.      Reaksi yang hiper atau hipo terhadap input sensoris (tidak ada dalam DSM-IV).\n";



                //FUNGSI UNTUK BUKAN ASD
//                if(check1.isChecked()) {
//
//                    globalClass.setPenyakit1(BukanASD);
//                    globalClass.setKeterangan (PenjelasanBukanASD);
//                }
//                else if(check2.isChecked()) {
//
//                    globalClass.setPenyakit1(BukanASD);
//                    globalClass.setKeterangan (PenjelasanBukanASD);
//                }
//                else if(check3.isChecked()) {
//
//                    globalClass.setPenyakit1(BukanASD);
//                    globalClass.setKeterangan (PenjelasanBukanASD);
//                }
//                else if(check4.isChecked()) {
//
//                    globalClass.setPenyakit1(BukanASD);
//                    globalClass.setKeterangan (PenjelasanBukanASD);
//                }
//                else if(check5.isChecked()) {
//
//                    globalClass.setPenyakit1(BukanASD);
//                    globalClass.setKeterangan (PenjelasanBukanASD);
//                }
//                else if(check6.isChecked()) {
//
//                    globalClass.setPenyakit1(BukanASD);
//                    globalClass.setKeterangan (PenjelasanBukanASD);
//                }
//                else if(check7.isChecked() ) {
//
//                    globalClass.setPenyakit1(BukanASD);
//                    globalClass.setKeterangan (PenjelasanBukanASD);
//                }
//check 1 sampai 7


//FUNGSI POSITIF diagnosa autisme
                   if(check1.isChecked() && check4.isChecked() && check5.isChecked()) {

                    globalClass.setPenyakit1(positifASD);
                    globalClass.setKeterangan(PenjelasanASD);
                }
                else if(check1.isChecked() && check4.isChecked() && check6.isChecked()) {

                    globalClass.setPenyakit1(positifASD);
                    globalClass.setKeterangan(PenjelasanASD);
                }
                else if(check1.isChecked() && check4.isChecked() && check7.isChecked()) {

                    globalClass.setPenyakit1(positifASD);
                    globalClass.setKeterangan(PenjelasanASD);
                }
                else if(check1.isChecked() && check5.isChecked() && check6.isChecked()) {

                    globalClass.setPenyakit1(positifASD);
                    globalClass.setKeterangan(PenjelasanASD);
                }
                else if(check1.isChecked() && check5.isChecked() && check7.isChecked()) {

                    globalClass.setPenyakit1(positifASD);
                    globalClass.setKeterangan(PenjelasanASD);
                }
                else if(check1.isChecked() && check6.isChecked() && check7.isChecked()) {

                    globalClass.setPenyakit1(positifASD);
                    globalClass.setKeterangan(PenjelasanASD);
                }


                   else if(check2.isChecked() && check4.isChecked() && check5.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check4.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check4.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check5.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check5.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check6.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }


                   else if(check3.isChecked() && check4.isChecked() && check5.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check3.isChecked() && check4.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check3.isChecked() && check4.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check3.isChecked() && check5.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check3.isChecked() && check5.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check3.isChecked() && check6.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }

                   else if(check1.isChecked() && check2.isChecked() && check4.isChecked() && check5.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check2.isChecked() && check4.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check2.isChecked() && check4.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check2.isChecked() && check5.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check2.isChecked() && check5.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check3.isChecked() && check4.isChecked() && check5.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check3.isChecked() && check4.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check3.isChecked() && check4.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check4.isChecked() && check5.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check5.isChecked() && check6.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check3.isChecked() && check4.isChecked() && check5.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check3.isChecked() && check4.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check3.isChecked() && check4.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check4.isChecked() && check5.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check5.isChecked() && check6.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check3.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check3.isChecked() && check4.isChecked() && check5.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check2.isChecked() && check3.isChecked() && check4.isChecked() && check5.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check2.isChecked() && check3.isChecked() && check4.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check2.isChecked() && check3.isChecked() && check4.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check3.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check3.isChecked() && check5.isChecked() && check5.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check1.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check3.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check2.isChecked() && check3.isChecked() && check5.isChecked() && check5.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }
                   else if(check3.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked() && check7.isChecked()) {

                       globalClass.setPenyakit1(positifASD);
                       globalClass.setKeterangan(PenjelasanASD);
                   }



                else {
                     globalClass.setPenyakit1(BukanASD);
                     globalClass.setKeterangan (PenjelasanBukanASD);
                }




                // mengambil variabel dari checbox yang di pilih
                String hasil = "";
                for (String selections: selection)
                {
                    hasil = hasil + selections + "\n";
                }
                globalClass.setListdiagnosa(hasil);
                // pindah halaman
                if (total == 0){
                    Toast.makeText(getApplicationContext(), "tidak ada checkbox yg dipilih  ", Toast.LENGTH_LONG).show();
//                    globalClass.setPenyakit1("ASD gejala ringan");
//                    globalClass.setKeterangan("hanya gejala biasa");
//                    Intent intent = new Intent( diagnosaquest.this, diagnosahasil.class);

//                    startActivity(intent);
//                    finish();

                 }
                else{
                    Intent intent = new Intent( diagnosaquest.this, diagnosahasil.class);

               startActivity(intent);
              finish();
                }




            }


        });

    }


    public void selectitem(View view)
    {


        boolean checked  = ((CheckBox)view).isChecked();
                switch ((view.getId()))
                {
                    case R.id.checkBox1:
                        if (checked)

                        {selection.add( "\n" +" * " + check1.getText().toString() + " ya");
                        total = total + 1;
                        }
                        else
                        {selection.remove( "\n" +" * " + check1.getText().toString()+ " ya");
                            total = total - 1;
                           }
                        break;
                    case R.id.checkBox2:
                        if (checked)
                        {selection.add( "\n" +" * " + check2.getText().toString()+ " ya");
                            total = total + 1;
                        }
                        else
                        {selection.remove( "\n" +" * " + check2.getText().toString()+ " ya");  total = total - 1;}
                        break;
                    case R.id.checkBox3:
                        if (checked)
                        {selection.add( "\n" +" * " + check3.getText().toString()+ " ya");
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check3.getText().toString()+ " ya");
                        total = total - 1 ;}
                        break;
                    case R.id.checkBox4:
                        if (checked)
                        {selection.add( "\n" +" * " + check4.getText().toString()+ " iya");
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " + check4.getText().toString()+ " iya");
                            total = total - 1;}
                        break;
                    case R.id.checkBox5:
                        if (checked)
                        {selection.add( "\n" +" * " + check5.getText().toString()+ " iya");
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " + check5.getText().toString()+ " iya");
                            total = total - 1;}
                        break;
                    case R.id.checkBox6:
                        if (checked)
                        {selection.add( "\n" +" * " +check6.getText().toString()+ " iya");
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check6.getText().toString()+ " iya");
                        total = total - 1;}
                        break;
                    case R.id.checkBox7:
                        if (checked)
                        {selection.add( "\n" +" * " +check7.getText().toString()+ " iya");
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check7.getText().toString()+ " iya");
                            total = total - 1;}
                        break;

                }





    }


}




//        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

