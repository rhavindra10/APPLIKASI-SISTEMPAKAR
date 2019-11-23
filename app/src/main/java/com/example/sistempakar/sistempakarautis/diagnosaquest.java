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
        check8 = findViewById(R.id.checkBox8);
        check9 = findViewById(R.id.checkBox9);
        check10 = findViewById(R.id.checkBox10);
        check11= findViewById(R.id.checkBox11);
        check12 = findViewById(R.id.checkBox12);

        selection = new ArrayList<>();






        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final  GlobalClass globalClass = (GlobalClass) getApplicationContext();
                if(check1.isChecked() && check2.isChecked() && check3.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked() && check7.isChecked() && check8.isChecked() && check9.isChecked() && check10.isChecked() && check11.isChecked() && check12.isChecked()) {

                    globalClass.setPenyakit1("ASD(autisme)");
                    globalClass.setKeterangan ("Autistic Spectrum Disorder (ASD) adalah gangguan perkembangan saraf otak yang mempengaruhi kemampuan berinteraksi, berkomunikasi, serta kelakuan. \n\n " + "Penanganan : \n"+"-Ajak berkomunikasi dan berinteraksi dengan baik.\n" +
                            "-Tumbuhkan minat.\n" +
                            "-Jauhkan dari lingkungan yang bising.\n" +
                            "-Pelihara hewan.");
                }
                else if(check1.isChecked() && check2.isChecked() && check3.isChecked() && check4.isChecked() && check5.isChecked() && check6.isChecked() && check7.isChecked() && check8.isChecked() && check9.isChecked() && check10.isChecked() && check11.isChecked() ) {

                    globalClass.setPenyakit1("ASD (Autisme) ");
                    globalClass.setKeterangan ("Autistic Spectrum Disorder (ASD) adalah gangguan perkembangan saraf otak yang mempengaruhi kemampuan berinteraksi, berkomunikasi, serta kelakuan. \n\n " + "Penanganan : \n"+"-Ajak berkomunikasi dan berinteraksi dengan baik.\n" +
                            "-Tumbuhkan minat.\n" +
                            "-Jauhkan dari lingkungan yang bising.\n" +
                            "-Pelihara hewan.");
                }
//
                else if (check1.isChecked() && check2.isChecked() && check3.isChecked() && check4.isChecked() && check5.isChecked()) {

                    globalClass.setPenyakit1("Skizofrenia") ;
                    globalClass.setKeterangan("Skizofrenia adalah gangguan mental yang menyebabkan penderita mengalami halusinasi, delusi, kekacauan berpikir (kebingungan), serta perubahan perilaku.");
                }
                else if (check1.isChecked() && check7.isChecked() && check8.isChecked() && check9.isChecked()){
                    globalClass.setPenyakit1("Asperger");
                    globalClass.setKeterangan("Asperger adalah gangguan saraf otak yang mempengaruhi kemampuan berinteraksi dan berkomunikasi. Hampir sama dengan ASD dengan spektrum yang rendah.");
                }
                else  if (check2.isChecked() && check10.isChecked() && check11.isChecked() ){
                    globalClass.setPenyakit1("ADHD(pemusatan perhatian)");
                    globalClass.setKeterangan("Attention Deficit Hyperactivity Disorder (ADHD) adalah kelainan yang membuat penderitanya kesulitan untuk memberikan perhatian dan fokus pada satu hal, umumnya akan diikuti aktifitas yang berlebihan.");
                }
                else if (check7.isChecked() && check11.isChecked() && check12.isChecked()){
                    globalClass.setPenyakit1("Keterbelakangan mental");
                    globalClass.setKeterangan("Retardasi mental adalah kondisi sebelum usia 18 tahun yang ditandai dengan rendahnya kecerdasan (biasanya nilai IQ-nya di bawah 70) dan sulit beradaptasi dengan kehidupan sehari-hari.");
                }
                else {
                    globalClass.setPenyakit1("ASD gejala ringan");
                    globalClass.setKeterangan("Autistic Spectrum Disorder (ASD) adalah gangguan perkembangan saraf otak yang mempengaruhi kemampuan berinteraksi, berkomunikasi, serta kelakuan.");
                }
                // mengambil variabel dari checbox yang di pilih
                String hasil = "";
                for (String selections: selection)
                {
                    hasil = hasil + selections + "\n";
                }
                globalClass.setListdiagnosa(hasil);
                // pindah halaman
                if (total > 3){

                Intent intent = new Intent( diagnosaquest.this, diagnosahasil.class);
    
                startActivity(intent);
                finish(); }
                else{
//                    Toast.makeText(getApplicationContext(), "checkbox yg dipilih  harus lebih dari 3  ", Toast.LENGTH_LONG).show();
                    globalClass.setPenyakit1("ASD gejala ringan");
                    globalClass.setKeterangan("hanya gejala biasa");
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

                        {selection.add( "\n" +" * " + check1.getText().toString());
                        total = total + 1;
                        }
                        else
                        {selection.remove( "\n" +" * " + check1.getText().toString());
                            total = total - 1;
                           }
                        break;
                    case R.id.checkBox2:
                        if (checked)
                        {selection.add( "\n" +" * " + check2.getText().toString());
                            total = total + 1;
                        }
                        else
                        {selection.remove( "\n" +" * " + check2.getText().toString());  total = total - 1;}
                        break;
                    case R.id.checkBox3:
                        if (checked)
                        {selection.add( "\n" +" * " + check3.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check3.getText().toString());
                        total = total - 1 ;}
                        break;
                    case R.id.checkBox4:
                        if (checked)
                        {selection.add( "\n" +" * " + check4.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " + check4.getText().toString());
                            total = total - 1;}
                        break;
                    case R.id.checkBox5:
                        if (checked)
                        {selection.add( "\n" +" * " + check5.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " + check5.getText().toString());
                            total = total - 1;}
                        break;
                    case R.id.checkBox6:
                        if (checked)
                        {selection.add( "\n" +" * " +check6.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check6.getText().toString());
                        total = total - 1;}
                        break;
                    case R.id.checkBox7:
                        if (checked)
                        {selection.add( "\n" +" * " +check7.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check7.getText().toString());
                            total = total - 1;}
                        break;
                    case R.id.checkBox8:
                        if (checked)
                        {selection.add( "\n" +" * " +check8.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check8.getText().toString());
                            total = total - 1;}
                        break;
                    case R.id.checkBox9:
                        if (checked)
                        {selection.add( "\n" +" * " +check9.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check9.getText().toString());
                            total = total - 1;}
                        break;
                    case R.id.checkBox10:
                        if (checked)
                        {selection.add( "\n" +" * " +check7.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check7.getText().toString());
                            total = total - 1;}
                        break;
                    case R.id.checkBox11:
                        if (checked)
                        {selection.add( "\n" +" * " +check8.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check8.getText().toString());
                            total = total - 1;}
                        break;
                    case R.id.checkBox12:
                        if (checked)
                        {selection.add( "\n" +" * " +check9.getText().toString());
                            total = total + 1;}
                        else
                        {selection.remove( "\n" +" * " +check9.getText().toString());
                            total = total - 1;}
                        break;
                }





    }


}




//        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

