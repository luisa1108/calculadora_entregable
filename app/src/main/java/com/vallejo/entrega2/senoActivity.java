package com.vallejo.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class senoActivity extends AppCompatActivity {
    EditText angulo_seno;
    RadioButton grados, radianes;
    Button calcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seno);

        angulo_seno = findViewById(R.id.txtanguloseno);
        grados = findViewById(R.id.optiongradosseno);
        radianes = findViewById(R.id.optionradianesseno);
        calcular = findViewById(R.id.btncalcularseno);
        resultado = findViewById(R.id.lbladvertenciaseno);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double angle = Double.parseDouble(angulo_seno.getText().toString());

                if (grados.isChecked()) {
                    double radians = Math.toRadians(angle);
                    double sinValue = Math.sin(radians);
                    Intent intent = new Intent(senoActivity.this, resultadoActivity.class);
                    intent.putExtra("resultado", sinValue);
                    startActivity(intent);
                }
                else if (radianes.isChecked()) {
                    double sinValue = Math.sin(angle);
                    Intent intent = new Intent(senoActivity.this, resultadoActivity.class);
                    intent.putExtra("resultado", sinValue);
                    startActivity(intent);
                }
                else {
                    resultado.setText("Selecciona el tipo de ángulo.");
                }
            }
        });
    }
}