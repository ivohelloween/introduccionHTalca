package com.imunoz.introduccionhtalca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textoMostrar1;
    private TextView textoMostrar2;
    private TextView textoMostrar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textoMostrar1 = findViewById(R.id.textoMostrar1);
        textoMostrar2 = findViewById(R.id.textoMostrar2);
        textoMostrar3 = findViewById(R.id.textoMostrar3);
        String nombre = getIntent().getStringExtra("nombre");
        String password = getIntent().getStringExtra("password");
        String correo = getIntent().getStringExtra("correo");
        Contacto nuevo = (Contacto) getIntent().getSerializableExtra("contactoNuevo");

        textoMostrar1.setText(nuevo.getNombre());
        textoMostrar2.setText(nuevo.getApeellido());
        textoMostrar3.setText(correo);

    }
}