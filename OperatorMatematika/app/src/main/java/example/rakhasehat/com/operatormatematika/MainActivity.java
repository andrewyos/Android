package example.rakhasehat.com.operatormatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnTambah, btnMin, btnKali, btnBagi;
    TextView txtAwal, txtDua, txtHasil;
    EditText editAwal, editKedua, editHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTambah = (Button)findViewById(R.id.btnTambah);
        btnMin = (Button)findViewById(R.id.btnMin);
        btnKali = (Button)findViewById(R.id.btnKali);
        btnBagi = (Button)findViewById(R.id.btnBagi);
        txtAwal = (TextView)findViewById(R.id.txtAwal);
        txtDua = (TextView)findViewById(R.id.txtDua);
        txtHasil = (TextView)findViewById(R.id.txtHasil);
        editAwal = (EditText)findViewById(R.id.editAwal);
        editKedua = (EditText)findViewById(R.id.editKedua);
        editHasil = (EditText)findViewById(R.id.editHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPenjumlahan();
            }
        });
        
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPembagian();
            }
        });
        
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPerkalian();
            }
        });
        
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPengurangan();
            }
        });
    }

    private void operatorPengurangan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pengurangan = angkaawal-angkakedua;
        editHasil.setText(pengurangan+"");
    }

    private void operatorPerkalian() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int perkalian = angkaawal*angkakedua;
        editHasil.setText(perkalian+"");
    }

    private void operatorPembagian() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pembagian = angkaawal/angkakedua;
        editHasil.setText(pembagian+"");
    }

    private void operatorPenjumlahan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pejumlahan = angkaawal+angkakedua;
        editHasil.setText(pejumlahan+"");
    }
}
