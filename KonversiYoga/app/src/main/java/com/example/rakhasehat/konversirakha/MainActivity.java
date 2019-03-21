package com.example.rakhasehat.konversirakha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editRupiah;
    RadioButton radioDollar, radioEuro;
    Button btnSimpan;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editRupiah = (EditText) findViewById(R.id.editRupiah);
        radioDollar = (RadioButton) findViewById(R.id.radioDollar);
        radioEuro = (RadioButton) findViewById(R.id.radioEuro);
        btnSimpan = (Button) findViewById(R.id.btnSimpan);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilaiRupiah = editRupiah.getText().toString();

                if(radioDollar.isChecked()){
                    double hasil = Double.parseDouble(nilaiRupiah) / 13000;
                    String result = Double.toString(hasil);
                    txtHasil.setText(result);
                }
                if(radioEuro.isChecked()){
                    double hasil = Double.parseDouble(nilaiRupiah) / 15000;
                    String result = Double.toString(hasil);
                    txtHasil.setText(result);
                }
            }
        });
    }
}
