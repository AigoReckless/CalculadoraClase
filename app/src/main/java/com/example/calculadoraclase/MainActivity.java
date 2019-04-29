package com.example.calculadoraclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int sumando1, sumando2, resultado;
    String tipoOperacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaBotones();
    }

    private void inicializaBotones() {

        final Button valor1Boton = findViewById(R.id.valor1);
        valor1Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumando1 = Integer.parseInt(valor1Boton.getText().toString());
            }
        });
        final Button valor2Boton = findViewById(R.id.valor2);
        valor2Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumando2 = Integer.parseInt(valor2Boton.getText().toString());
            }
        });
        Button operando = findViewById(R.id.operando);
        operando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipoOperacion = "multiplicacion";
            }

        });

        final Button igual;
        final TextView display;
        display = findViewById(R.id.display);
        igual = findViewById(R.id.resultado);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (tipoOperacion) {
                    case "multiplicacion":
                       resultado = sumando1 * sumando2;
                       break;
                }
                display.setText(String.valueOf(resultado));
            }
        });
    }

    private void chequeaBoton(View boton){
    }
}
