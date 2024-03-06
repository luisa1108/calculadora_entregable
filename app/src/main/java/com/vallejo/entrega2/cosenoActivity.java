package com.vallejo.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class cosenoActivity extends AppCompatActivity {
    EditText angulo_coseno;
    Button calcular_coseno;
    TextView resultado;
    RadioButton radio_grados;
    RadioButton radio_radianes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coseno);

        angulo_coseno = findViewById(R.id.txtangulocoseno);
        calcular_coseno = findViewById(R.id.btncalcularcoseno);
        resultado = findViewById(R.id.lbladvertenciacoseno);
        radio_grados = findViewById(R.id.optiongradoscoseno);
        radio_radianes = findViewById(R.id.optionradianescoseno);

        calcular_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String anguloString = angulo_coseno.getText().toString();
                if (!anguloString.isEmpty()) {
                    double angulo = Double.parseDouble(anguloString);
                    double radianes = radio_grados.isChecked() ? Math.toRadians(angulo) : angulo;
                    double coseno = Math.cos(radianes);
                    Intent intent = new Intent(cosenoActivity.this, resultadoActivity.class);
                    intent.putExtra("resultado", coseno);
                    startActivity(intent);
                }
                else {
                    resultado.setText("Ingresa un ángulo para poder continuar.");
                }
            }
        });
    }
}
