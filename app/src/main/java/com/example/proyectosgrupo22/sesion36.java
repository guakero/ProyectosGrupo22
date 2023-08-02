package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class sesion36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion36);


    }

    public void MostrarElTexto(View view){
        EditText cajaDeTexto = findViewById(R.id.etCajaDeTexto);
        Toast.makeText(getApplicationContext(),cajaDeTexto.getText(),Toast.LENGTH_LONG).show();
    }

    public void obternerForma (View view){
        CheckBox opcionCarro = findViewById(R.id.opCarro);
        CheckBox opcionMoto = findViewById(R.id.opMoto);
        CheckBox opcionBici = findViewById(R.id.opBici);

        String carro = "\nCarro:"+opcionCarro.isChecked();
        String moto = "\nMoto:"+opcionMoto.isChecked();
        String bici = "\nBici:"+opcionBici.isChecked();

        Toast.makeText(getApplicationContext(),carro+moto+bici,Toast.LENGTH_LONG).show();

    }

}