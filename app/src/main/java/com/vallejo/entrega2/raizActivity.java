package com.vallejo.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class raizActivity extends AppCompatActivity {
    EditText numero;
    Button calcularraiz;
    TextView resultadoraiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz);

        EditText numero = findViewById(R.id.txtnumero);
        Button calcularraiz = findViewById(R.id.btncalcularraiz);
        TextView resultadoraiz = findViewById(R.id.lbladvertenciaraiz);

        calcularraiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String numberString = numero.getText().toString();
                    if (!numberString.isEmpty()) {
                        double number = Double.parseDouble(numberString);
                        double sqrt = Math.sqrt(number);
                        Intent intent = new Intent(raizActivity.this, resultadoActivity.class);
                        intent.putExtra("resultado", sqrt);
                        startActivity(intent);
                    }
                    else {
                        resultadoraiz.setText("Por favor, ingrese un número para sacar su raíz.");
                    }
            }
        });
    }
}
