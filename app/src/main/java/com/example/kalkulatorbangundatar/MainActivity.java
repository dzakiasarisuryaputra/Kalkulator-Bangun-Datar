package com.example.kalkulatorbangundatar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnPersegi, btnSegitiga, btnLingkaran;
    EditText angka01, angka02;
    TextView hasilhitungkel, hasilhitungluas;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka01=findViewById(R.id.angka1);
        angka02=findViewById(R.id.angka2);
        hasilhitungluas=findViewById(R.id.hasilluas);
        hasilhitungkel=findViewById(R.id.hasilkeliling);

        btnPersegi=findViewById(R.id.persegi);
        btnSegitiga=findViewById(R.id.segitiga);
        btnLingkaran=findViewById(R.id.lingkaran);

        btnPersegi.setOnClickListener(this);
        btnSegitiga.setOnClickListener(this);
        btnLingkaran.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.persegi:
                htpersegi();
                break;
            case R.id.segitiga:
                htsegitiga();
                break;
            case R.id.lingkaran:
                htlingkaran();
                break;

        }
    }

    private void htpersegi(){
        if (angka01.getText().toString().trim().isEmpty()||angka02.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Mohon lengkapi data!!", Toast.LENGTH_SHORT).show();
        } else {
            float ang1 = Float.parseFloat(String.valueOf(angka01.getText()));
            float ang2 = Float.parseFloat(String.valueOf(angka02.getText()));
            int i = 2;

            float luas = (ang1 * ang2);
            float keliling = (i * (ang1 + ang2));
            hasilhitungluas.setText("Luas Persegi : " + luas);
            hasilhitungkel.setText("Keliling Persegi : " + keliling);
        }
    }

    private void htsegitiga(){
        if (angka01.getText().toString().trim().isEmpty()||angka02.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Mohon lengkapi data!!", Toast.LENGTH_SHORT).show();
        } else {
            float ang1 = Float.parseFloat(String.valueOf(angka01.getText()));
            float ang2 = Float.parseFloat(String.valueOf(angka02.getText()));
            double sisi = Math.sqrt(Math.pow(ang1/2,2) + Math.pow(ang2,2));

            float luas = (ang1*ang2/2);
            double keliling = ((sisi*2)+ang1);
            hasilhitungluas.setText("Luas Segitiga : " + luas);
            hasilhitungkel.setText("Keliling Segitiga : " + keliling);
        }
    }
    private void htlingkaran(){
        if (angka01.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Mohon lengkapi data!!", Toast.LENGTH_SHORT).show();
        } else {
            float ang1 = Float.parseFloat(String.valueOf(angka01.getText()));

            double luas = (Math.pow(ang1,2)*3.14);
            double keliling = (3.14 * ang1 );
            hasilhitungluas.setText("Luas Lingkaran : " + luas);
            hasilhitungkel.setText("Keliling Lingkaran : " + keliling);
        }

    }
}
