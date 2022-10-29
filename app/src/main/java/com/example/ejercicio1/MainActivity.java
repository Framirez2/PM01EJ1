package com.example.ejercicio1;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity
{


   private TextView txtresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btns = (Button) findViewById(R.id.btnsumar);
        Button btnr = (Button) findViewById(R.id.btnrestar);
        Button btnm = (Button) findViewById(R.id.btnmultiplicar);
        Button btnd = (Button) findViewById(R.id.btndivision);

        txtresultado = (TextView) findViewById(R.id.txtresultado);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

sumar();
            }
        });



        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                restar();
            }
        });


        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                multiplicar();
            }
        });



        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dividir();
            }
        });






    }

    public void sumar() {

        EditText n1 = (EditText) findViewById(R.id.txtnumero1);
        EditText n2 = (EditText) findViewById(R.id.txtnumero2);
        Intent pantalla2 = new Intent(getApplicationContext(), resultados.class);

        funcionesmatematicas operaciones = new funcionesmatematicas(

                Integer.parseInt(n1.getText().toString()),

                Integer.parseInt(n2.getText().toString())
        );


        Integer resultadosuma = operaciones.suma(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString()));
        txtresultado.setText("El resultado de la Suma es :" + resultadosuma);
        pantalla2.putExtra("resultado", txtresultado.getText().toString());
        startActivity(pantalla2);
    }


    public void restar() {

        EditText n1 = (EditText) findViewById(R.id.txtnumero1);
        EditText n2 = (EditText) findViewById(R.id.txtnumero2);
        Intent pantalla2 = new Intent(getApplicationContext(), resultados.class);

        funcionesmatematicas operaciones = new funcionesmatematicas(

                Integer.parseInt(n1.getText().toString()),

                Integer.parseInt(n2.getText().toString())
        );


        Integer resultadoresta = operaciones.resta(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString()));
        txtresultado.setText("El resultado de la Resta es :" + resultadoresta);
        pantalla2.putExtra("resultado", txtresultado.getText().toString());
        startActivity(pantalla2);
    }


    public void multiplicar() {

        EditText n1 = (EditText) findViewById(R.id.txtnumero1);
        EditText n2 = (EditText) findViewById(R.id.txtnumero2);
        Intent pantalla2 = new Intent(getApplicationContext(), resultados.class);

        funcionesmatematicas operaciones = new funcionesmatematicas(

                Integer.parseInt(n1.getText().toString()),

                Integer.parseInt(n2.getText().toString())
        );


        Integer resultadomultiplicar = operaciones.multiplicacion(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString()));
        txtresultado.setText("El resultado de la Multiplicacion es :" + resultadomultiplicar);
        pantalla2.putExtra("resultado", txtresultado.getText().toString());
        startActivity(pantalla2);
    }


    public void dividir() {

        EditText n1 = (EditText) findViewById(R.id.txtnumero1);
        EditText n2 = (EditText) findViewById(R.id.txtnumero2);
        Intent pantalla2 = new Intent(getApplicationContext(), resultados.class);

        funcionesmatematicas operaciones = new funcionesmatematicas(

                Integer.parseInt(n1.getText().toString()),

                Integer.parseInt(n2.getText().toString())
        );


        Integer resultadodivision = operaciones.division(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString()));
        txtresultado.setText("El resultado de la Division es :" + resultadodivision);
        pantalla2.putExtra("resultado", txtresultado.getText().toString());
        startActivity(pantalla2);
    }







}






