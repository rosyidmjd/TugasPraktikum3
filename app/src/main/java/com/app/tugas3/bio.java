package com.app.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class bio extends AppCompatActivity {

    //Deklarasi Variable
    TextView tvNamaValue, tvNimValue, tvNohpValue, tvProdiValue, tvAlamatValue, tvEmailValue, tvJenisKelaminValue, tvUkmValue, KelasValue;
    String getKelas, getNama, getNim, getNohp, getProdi, getAlamat, getEmail, getJenisKelamin, getUkm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        //Inisialisasi Variable
        tvNamaValue = findViewById(R.id.tvNamaValue);
        tvProdiValue= findViewById(R.id.tvProdiValue);
        tvJenisKelaminValue = findViewById(R.id.tvJenisKelaminValue);
        tvAlamatValue = findViewById(R.id.tvAlamatValue);
        tvNohpValue = findViewById(R.id.tvNohpValue);
        tvEmailValue = findViewById(R.id.tvEmailValue);
        tvNimValue = findViewById(R.id.tvNimValue);
        tvUkmValue = findViewById(R.id.tvUkmValue);
        KelasValue = findViewById(R.id.KelasValue);


        //Ambil dari Bundle
        Bundle bundle = getIntent().getExtras();
        getNama = bundle.getString("Nama");
        getProdi = bundle.getString("Prodi");
        getJenisKelamin = bundle.getString("Jenis Kelamin");
        getAlamat = bundle.getString("Alamat");
        getNohp = bundle.getString("Nohp");
        getEmail = bundle.getString("Email");
        getNim = bundle.getString("NIM");
        getUkm = bundle.getString("UKM");
        getKelas = bundle.getString("Kelas");



        tvNamaValue.setText(getNama);
        tvProdiValue.setText(getProdi);
        tvJenisKelaminValue.setText(getJenisKelamin);
        tvAlamatValue.setText(getAlamat);
        tvNohpValue.setText(getNohp);
        tvEmailValue.setText(getEmail);
        tvNimValue.setText(getNim);
        tvUkmValue.setText(getUkm);
        KelasValue.setText(bundle.getString("Kelas"));


    }
}