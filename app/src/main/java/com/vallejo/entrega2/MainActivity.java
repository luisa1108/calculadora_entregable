package com.vallejo.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton_seno;
    Button boton_coseno;
    Button boton_raiz;
    Button boton_perimetro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_seno = findViewById(R.id.btnseno);
        boton_coseno = findViewById(R.id.btncoseno);
        boton_raiz = findViewById(R.id.btnraiz);
        boton_perimetro = findViewById(R.id.btnperimetro);

        boton_seno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, senoActivity.class);
                startActivity(intent);
            }
        });
        boton_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cosenoActivity.class);
                startActivity(intent);
            }
        });
        boton_raiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, raizActivity.class);
                startActivity(intent);
            }
        });
        boton_perimetro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, perimetroActivity.class);
                startActivity(intent);
            }
        });
    }
}