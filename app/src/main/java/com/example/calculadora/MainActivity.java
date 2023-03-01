package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       private Button suma;
       private Button resta;
       private Button multiplicar;
       private Button dividir;
       private TextView respuesta;
       private EditText num1;
       private EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta = findViewById(R.id.respuesta);
        num1= findViewById(R.id.numero1);
        num2= findViewById(R.id.numero2);

    suma = findViewById(R.id.botonsuma);
    suma.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
       respuesta.setText(sumar(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");
        }
    });

    resta = findViewById(R.id.botonresta);
    resta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            respuesta.setText(restar(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");
        }
    });


    multiplicar = findViewById(R.id.botonmulti);
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(multipicar(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");
            }
        });

    dividir = findViewById(R.id.botondivicion);
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(dividir(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");
            }
        });

    }
    public double sumar (int a, int b){
        return a+b;
    }
    public double restar (int a, int b){
        return a-b;
    }
    public double multipicar (int a, int b){
        return a*b;
    }
    public double dividir (double a, double b){
        int respuesta = 0;
if (b!=0){
    respuesta=a/b;
}
        return respuesta;
    }
}