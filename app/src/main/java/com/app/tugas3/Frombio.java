package com.app.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Frombio extends AppCompatActivity {

    //Deklarasi Variable
    EditText etAlamat, etEmail, etNohp, etNama, etNim, etProdi;
    Button btnSimpan;
    RadioButton rbLaki, rbPerempuan;
    Spinner spinner1;
    CheckBox cbAmcc, cbHmssi, cbKoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frombio);

        //Inisialisasi Variable
        etAlamat = (EditText) findViewById(R.id.etAlamat);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etNohp = (EditText) findViewById(R.id.etNohp);
        etNama = (EditText) findViewById(R.id.etNama);
        etProdi = (EditText) findViewById(R.id.etProdi);
        etNim = (EditText) findViewById(R.id.etNim);

        btnSimpan = (Button) findViewById(R.id.btnSimpan);

        rbLaki = (RadioButton) findViewById(R.id.rbLaki);
        rbPerempuan = (RadioButton) findViewById(R.id.rbPerempuan);

        spinner1 = (Spinner) findViewById(R.id.spinner);

        cbAmcc = (CheckBox) findViewById(R.id.cbAmcc);
        cbHmssi = (CheckBox) findViewById(R.id.cbHmssi);
        cbKoma = (CheckBox) findViewById(R.id.cbKoma);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = etNama.getText().toString();
                    String nim = etNim.getText().toString();
                    String prodi = etProdi.getText().toString();
                    String alamat = etAlamat.getText().toString();
                    String email = etEmail.getText().toString();
                    String nohp = etNohp.getText().toString();

                    String inputSpin = String.valueOf(spinner1.getSelectedItem());
                    String a = "";
                    String b = "";

                    String jk;
                    if(rbLaki.isChecked()){
                        jk = "Laki-Laki";
                    }else {
                        jk = "Perempuan";
                    }



                    String UKM = "";
                    if (cbAmcc.isChecked()){
                        UKM += "AMCC \n";
                    }
                    if(cbHmssi.isChecked()){
                        UKM += "HMSSI \n";
                    }
                    if (cbKoma.isChecked()){
                        UKM += "KOMA \n";
                    }

                    //Pengecekan harus diisi
                    if(alamat.isEmpty()) {
                        Toast.makeText(getApplication(), "Alamat Harus Diisi", Toast.LENGTH_SHORT).show();
                    } else  {
                        //Opsi via budle
                        Bundle bundle = new Bundle();
                        bundle.putString("Nama", nama);
                        bundle.putString("NIM", nim);
                        bundle.putString("Prodi", prodi);
                        bundle.putString("Jenis Kelamin", jk);
                        bundle.putString("Alamat", alamat);
                        bundle.putString("Email", email);
                        bundle.putString("Nohp", nohp);
                        bundle.putString("UKM", UKM);
                        bundle.putString("Kelas", inputSpin);
                        Intent i = new Intent(Frombio.this, bio.class);
                        i.putExtras(bundle);
                        startActivity(i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Error Try Again!", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}