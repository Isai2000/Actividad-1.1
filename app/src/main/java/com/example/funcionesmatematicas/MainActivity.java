package com.example.funcionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1, n2;
    TextView respuesta;
    Button btnSumar, btnResta, btnMultiplicacion, btnDivision;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Codigo
        n1 = findViewById(R.id.edt01);
        n2 = findViewById(R.id.edt02);
        respuesta = findViewById(R.id.tvres);
        btnSumar = findViewById(R.id.btnSumar);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);

        btnSumar.setOnClickListener(this);
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resta();
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiplicacion();
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Division();
            }
        });

    }

    @Override
    public void onClick(View view) {
      float num1, num2, rest;
      num1 = Float.parseFloat(n1.getText().toString());
      num2 = Float.parseFloat(n2.getText().toString());
      rest = num1 + num2;

      respuesta.setText("El resultado es: " + rest);
      Toast.makeText(getApplicationContext(), "El resultado es: " + rest, Toast.LENGTH_LONG).show();

    }


    private void Resta(){
        double x,y;
        double r;
        x=Integer.parseInt(n1.getText().toString());
        y=Integer.parseInt(n2.getText().toString());
        r=x-y;
        respuesta.setText("El resultado es: " + String.valueOf(r));
    }

    private void Multiplicacion(){
        double x,y;
        double r;
        x=Integer.parseInt(n1.getText().toString());
        y=Integer.parseInt(n2.getText().toString());
        r=x*y;
        respuesta.setText("El resultado es: " + String.valueOf(r));
    }

    private void Division(){
        double x,y;
        double r;
        x=Integer.parseInt(n1.getText().toString());
        y=Integer.parseInt(n2.getText().toString());
        r=x/y;
        respuesta.setText("El Resultado es: " + String.valueOf(r));
    }


}