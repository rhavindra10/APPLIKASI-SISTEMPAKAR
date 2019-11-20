package com.example.sistempakar.sistempakarautis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class diagnosaform extends AppCompatActivity {

    Button btn;
    Intent intent;
    String var_nama,var_umur;
    String var_jk;
    EditText nama, umur;
    RadioGroup RG;
    RadioButton rb1,rb2;
    TextWatcher tampilkanbutton;
    TextView tester;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosaform);

        final  GlobalClass globalClass = (GlobalClass) getApplicationContext();
        nama = (EditText) findViewById(R.id.frmnama);
        umur = (EditText) findViewById(R.id.frmumur);
        btn = (Button) findViewById(R.id.btnnext);
        RG = (RadioGroup) findViewById(R.id.frmradiogroup);
        rb1 = (RadioButton) findViewById(R.id.radiobtn1);
        rb2 = (RadioButton) findViewById(R.id.radiobtn2);
        tester = (TextView) findViewById(R.id.tester);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View view) {

                var_nama = nama.getText().toString();
                var_umur = umur.getText().toString();
                var_jk = tester.getText().toString();
                globalClass.setVar_nama(var_nama);
                globalClass.setVar_umur(var_umur);




                if(nama.length()==0){
                    nama.setError("Isi nama");
                }
                else if (umur.length()==0)
                {
                    umur.setError("isiumur");
                }

                else{
                    if (rb1.isChecked()){
                        globalClass.setVar_jk("laki - laki");
                    }
                    else if (rb2.isChecked()){
                        globalClass.setVar_jk("perempuan");
                    }
                    else{
                        globalClass.setVar_jk("Tidak Dipilih");
                    }
                    Intent i = null;
                    i = new Intent(diagnosaform.this, diagnosaquest.class);
                    startActivity(i);
                finish();
                }


            }
        });
    }


}
