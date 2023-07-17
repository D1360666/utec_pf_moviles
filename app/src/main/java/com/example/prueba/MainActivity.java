package com.example.prueba;

import android.content.Intent;
import android.os.Bundle;
//import android.util.Log;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prueba.model.BoletoSorteoCanasta;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtApellido;
    private EditText txtTelefono;
    private EditText txtCI;
    private TextView txtFecha;
    private TextView txtNroBoleto;

    private int numeroBoleto=0;
    private String pattern = "yyyy-mm-yy";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    private String fecha = simpleDateFormat.format(new Date());
    //TextView txtFecha = (TextView) findViewById(R.id.txtFecha);
    //TextView txtNro = (TextView) findViewById(R.id.txtBoleto);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtCI = findViewById(R.id.txtCedula);
        txtNroBoleto = findViewById(R.id.txtBoleto);
        txtFecha = findViewById(R.id.txtFecha);

        txtFecha.setText(fecha.toString());
        txtNroBoleto.setText(String.valueOf(numeroBoleto).toString());
    }

    public void validarDatos(View view){

        String nombreCliente = txtNombre.getText().toString().trim();
        String apellidoCliente = txtApellido.getText().toString().trim();
        String cedulaIdentidadString = txtCI.getText().toString().trim();
        String telefonoClienteString = txtTelefono.getText().toString().trim();

        if (nombreCliente.isEmpty() || apellidoCliente.isEmpty() || cedulaIdentidadString.isEmpty() || telefonoClienteString.isEmpty()) {
            // Se marcan los campos obligatorios que faltan con un mensaje Toast
            if (nombreCliente.isEmpty()) {
                txtNombre.setError("Campo obligatorio");
            }
            if (apellidoCliente.isEmpty()) {
                txtApellido.setError("Campo obligatorio");
            }
            if (cedulaIdentidadString.isEmpty()) {
                txtCI.setError("Campo obligatorio");
            }
            if (telefonoClienteString.isEmpty()) {
                txtTelefono.setError("Campo obligatorio");
            }
        } else {
            int cedulaIdentidad = Integer.parseInt(cedulaIdentidadString);
            int telefonoCliente = Integer.parseInt(telefonoClienteString);

            // Se crea el boleto
            BoletoSorteoCanasta boleto = new BoletoSorteoCanasta(nombreCliente, apellidoCliente, cedulaIdentidad, telefonoCliente, numeroBoleto, fecha);

            // Se muestra un mensaje Toast con los datos ingresados
            String mensaje = "Se ha ingresado el boleto para el sorteo para el cliente " + boleto.getNombre()
                    + " " + boleto.getApellido() + " con CI " + boleto.getCi();
            Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();

            // Se imprime el boleto en el LogCat
           Log.i("BoletoSorteoCanasta", boleto.toString());

            // Se borran los campos
            txtNombre.setText("");
            txtApellido.setText("");
            txtCI.setText("");
            txtTelefono.setText("");

            numeroBoleto =+1;
            txtNroBoleto.setText(String.valueOf(numeroBoleto).toString());

            //Enviando datos a otra pantalla
            Intent intent = new Intent(this, EnvioActivity.class);

            intent.putExtra("Boleto", boleto );
            startActivity(intent);
        }

    }
}