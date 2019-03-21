package com.example.rakhasehat.parsingvariable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit, btnHapus;
    EditText editNama, editTahun, editAlamat, editTelpon, editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama = (EditText) findViewById(R.id.editNama);
        editTahun = (EditText) findViewById(R.id.editTahun);
        editAlamat = (EditText) findViewById(R.id.editAlamat);
        editTelpon = (EditText) findViewById(R.id.editTelpon);
        editEmail = (EditText) findViewById(R.id.editEmail);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnHapus = (Button) findViewById(R.id.btnHapus);

        btnHapus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                editNama.setText("");
                editTahun.setText("");
                editAlamat.setText("");
                editTelpon.setText("");
                editEmail.setText("");
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editNama.length() == 0){
                    //jika form Nama belum di isi / masih kosong
                    editNama.setError("Nama diperlukan!");
                }
                else if(editTahun.length() == 0){
                    //jika form Tahun belum di isi / masih kosong
                    editTahun.setError("Tahun diperlukan!");
                }
                else if(editAlamat.length() == 0){
                    //jika form Tahun belum di isi / masih kosong
                    editAlamat.setError("Alamat diperlukan!");
                }
                else if(editTelpon.length() == 0){
                    //jika form Tahun belum di isi / masih kosong
                    editTelpon.setError("Telpon diperlukan!");
                }
                else if(editEmail.length() == 0){
                    //jika form Tahun belum di isi / masih kosong
                    editEmail.setError("Email diperlukan!");
                }
                else{
                    Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_SHORT).show();
                    String nama = editNama.getText().toString();
                    String tahun = editTahun.getText().toString();
                    String alamat = editAlamat.getText().toString();
                    String telepon = editTelpon.getText().toString();
                    String email = editEmail.getText().toString();

                    Intent i = null;
                    i = new Intent(MainActivity.this, Main2Activity.class);
                    Bundle b = new Bundle();
                    b.putString("parse_nama", nama);
                    b.putString("parse_tahun", tahun);
                    b.putString("parse_alamat", alamat);
                    b.putString("parse_telepon", telepon);
                    b.putString("parse_email", email);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
    }
}
