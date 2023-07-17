package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.prueba.model.BoletoSorteoCanasta;

public class EnvioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio);

        Intent intent = getIntent();
        BoletoSorteoCanasta boleto = (BoletoSorteoCanasta) intent.getSerializableExtra("Boleto");
        TextView tvNombre = findViewById(R.id.tvNombre);
        TextView tvApellido =findViewById(R.id.tvApellido);
        TextView tvCedula = findViewById(R.id.tvCedula);
        TextView tvTelefono = findViewById(R.id.tvTelefono);
        TextView tvBoleto = findViewById(R.id.tvBoleto);
        TextView tvFecha = findViewById(R.id.tvFecha);

        tvNombre.setText(boleto.getNombre());
        tvApellido.setText(boleto.getApellido());
        tvCedula.setText(boleto.getCi());
        tvTelefono.setText(boleto.getTelefono());
        tvFecha.setText(boleto.getFecha());
        tvBoleto.setText(boleto.getNumero());
    }

    public void volver(View view){
        //Enviando datos a otra pantalla
        Intent intent = new Intent(this, EnvioActivity.class);
        startActivity(intent);
    }

}