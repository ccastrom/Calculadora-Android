package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
/*Claudio Francisco Castro Muñoz*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sumar(View v){
         EditText txt1,txt2;
         TextView txtResultado;

         txt1=(EditText)findViewById(R.id.editTextNumber);
         txt2=(EditText)findViewById(R.id.editTextNumber2);
         txtResultado=(TextView)findViewById(R.id.textView);
         int valor1=Integer.parseInt(txt1.getText().toString());
        int valor2=Integer.parseInt(txt2.getText().toString());
        int resultado= valor1+valor2;
        txtResultado.setText("La suma es: "+resultado);

    }
    public void restar(View v){
        EditText txt1,txt2;
        TextView txtResultado;

        txt1=(EditText)findViewById(R.id.editTextNumber);
        txt2=(EditText)findViewById(R.id.editTextNumber2);
        txtResultado=(TextView)findViewById(R.id.textView);

        int valor1=Integer.parseInt(txt1.getText().toString());
        int valor2=Integer.parseInt(txt2.getText().toString());
        int resultado= valor1-valor2;
        txtResultado.setText("La resta es: "+resultado);

    }

    public void multiplicar(View v){
        EditText txt1,txt2;
        TextView txtResultado;

        txt1=(EditText)findViewById(R.id.editTextNumber);
        txt2=(EditText)findViewById(R.id.editTextNumber2);
        txtResultado=(TextView)findViewById(R.id.textView);

        int valor1=Integer.parseInt(txt1.getText().toString());
        int valor2=Integer.parseInt(txt2.getText().toString());
        int resultado= valor1*valor2;
        txtResultado.setText("La multiplicación es: "+resultado);

    }
    public void dividir(View v){
        EditText txt1,txt2;
        TextView txtResultado;

        txt1=(EditText)findViewById(R.id.editTextNumber);
        txt2=(EditText)findViewById(R.id.editTextNumber2);
        txtResultado=(TextView)findViewById(R.id.textView);

        int valor1=Integer.parseInt(txt1.getText().toString());
        int valor2=Integer.parseInt(txt2.getText().toString());
        if(valor2==0){
            txtResultado.setText("No se puede dividir por 0");
        }else{
            int resultado= valor1/valor2;
            txtResultado.setText("La division es: "+resultado);
        }



    }
}