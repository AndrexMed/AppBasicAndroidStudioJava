package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campo1,campo2;
    TextView etiResultado;

    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = (EditText) findViewById(R.id.campo1);
        campo2 = (EditText) findViewById(R.id.campo2);
        etiResultado = (TextView) findViewById(R.id.etiResultado);

    }

    public void onClick(View view) {

        num1=Integer.parseInt(campo1.getText().toString());
        num2=Integer.parseInt(campo2.getText().toString());

        switch (view.getId()){
            case (R.id.btnSuma):
                sumar();
                break;
            case (R.id.btnResta):
                restar();
                break;
            case (R.id.btnMultiplicar):
                multiplicar();
                break;
            case (R.id.btnDividir):
                dividir();
                break;
        }
    }

    private void sumar() {
        int suma = num1+num2;
        etiResultado.setText("El resultado de la suma es: " +suma);
    }

    private void restar() {
        int resta = num1-num2;
        etiResultado.setText("El resultado de la resta es: " +resta);
    }

    private void multiplicar() {
        int multi = num1*num2;
        etiResultado.setText("El resultado de la multiplicacion es: " +multi);
    }

    private void dividir() {
        if (num2 == 0 ){
            Toast.makeText(this, "Advertencia", Toast.LENGTH_LONG).show();
            etiResultado.setText("No se puede divir entre cero");
        }
        else {
            int division = num1/num2;
            etiResultado.setText("El resultado de la division es: " +division);
        }
    }
}