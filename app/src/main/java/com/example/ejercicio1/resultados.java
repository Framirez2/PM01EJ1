package com.example.ejercicio1;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class resultados extends AppCompatActivity {



  private   TextView txtresulta;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        txtresulta = (TextView) findViewById(R.id.txtresulta);
    String resultado= getIntent().getStringExtra("resultado");
    txtresulta.setText(""+resultado);




    }









    }




