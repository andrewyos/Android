package com.example.rakhasehat.parsingvariable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    TextView txtNama, txtTahun, txtAlamat, txtTelepon, txtEmail;
    String get_nama, get_alamat, get_email, get_telepon, get_tahun;
    Button btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNama = (TextView)findViewById(R.id.txtNama);
        txtTahun = (TextView)findViewById(R.id.txtTahun);
        txtAlamat = (TextView)findViewById(R.id.txtAlamat);
        txtTelepon = (TextView)findViewById(R.id.txtTelepon);
        txtEmail = (TextView)findViewById(R.id.txtEmail);
        btnKeluar = (Button) findViewById(R.id.btnKeluar);

        Bundle b = getIntent().getExtras();
        get_nama = b.getString("parse_nama");
        get_tahun = b.getString("parse_tahun");
        get_alamat = b.getString("parse_alamat");
        get_telepon = b.getString("parse_telepon");
        get_email = b.getString("parse_email");

        txtNama.setText("Nama anda adalah "+get_nama);
        txtTahun.setText("Tahun lahir anda "+get_tahun);
        txtAlamat.setText("Alamat anda adalah "+get_alamat);
        txtTelepon.setText("Nomor telepon anda "+get_telepon);
        txtEmail.setText("Email anda adalah "+get_email);

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == btnKeluar){
                    finish();
                }
            }
        });
    }
}
