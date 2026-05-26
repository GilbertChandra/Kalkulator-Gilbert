package edu.uph.m24si2.kalkulatorgilbert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Kalkulator extends AppCompatActivity {

    private EditText edtAngka1, edtAngka2;
    private Button btnTambah, btnKali, btnBagi;
    private TextView txvJudul, txvDesc, txvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtAngka1 = findViewById(R.id.edtAngka1);
        edtAngka2 = findViewById(R.id.edtAngka2);
        btnTambah = findViewById(R.id.btnTambah);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        txvHasil = findViewById(R.id.txvHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil1, bil2;
                int hasil;
                bil1 = Integer.parseInt(edtAngka1.getText().toString());
                bil2 = Integer.parseInt(edtAngka2.getText().toString());

                hasil =bil1 + bil2;
                txvHasil.setText("" + hasil);
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil1, bil2;
                int hasil;
                bil1 = Integer.parseInt(edtAngka1.getText().toString());
                bil2 = Integer.parseInt(edtAngka2.getText().toString());

                hasil =bil1 * bil2;
                txvHasil.setText("" + hasil);
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil1, bil2;
                int hasil;
                bil1 = Integer.parseInt(edtAngka1.getText().toString());
                bil2 = Integer.parseInt(edtAngka2.getText().toString());

                hasil =bil1 / bil2;
                txvHasil.setText("" + hasil);
            }
        });
    }
}