package com.vallejo.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultadoActivity extends AppCompatActivity{

    TextView txtresultado;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtresultado = findViewById(R.id.txtresultado);

        double resultado =getIntent().getDoubleExtra("resultado", 0.0);

        txtresultado.setText("Resultado: " + resultado);
    }
}