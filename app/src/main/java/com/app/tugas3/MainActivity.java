package com.app.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variable
    Button btnIsidata;
    EditText etProdi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisialisasi Variable
        etProdi1 = (EditText) findViewById(R.id.etProdi1);
        btnIsidata = (Button) findViewById(R.id.btnIsidata);

        btnIsidata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String prodi = etProdi1.getText().toString();

                    //Pengecekan prodi harus diisi
                    if (prodi.isEmpty()) {
                        Toast.makeText(getApplication(), "Program Studi Harus Diisi!", Toast.LENGTH_SHORT).show();
                    }else {
                        //Ops1 : passing data via bundle
                        Bundle bundle = new Bundle();
                        bundle.putString("Prodi", prodi);
                        Intent i = new Intent(MainActivity.this, Frombio.class);
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