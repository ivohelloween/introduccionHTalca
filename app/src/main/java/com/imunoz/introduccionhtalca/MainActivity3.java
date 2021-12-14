package com.imunoz.introduccionhtalca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    private EditText nombre;
    private EditText password;
    private EditText correo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nombre = findViewById(R.id.editTextTextPersonName7);
        password = findViewById(R.id.editTextTextPassword3);
        correo = findViewById(R.id.editTextTextEmailAddress2);


    }



    public void lanzarActivity(View view){
        Intent intent = new Intent(this, MainActivity2.class );

        Contacto c = new Contacto("Ivo","Muñoz");


        intent.putExtra("nombre",nombre.getText().toString());
        intent.putExtra("password",password.getText().toString());
        intent.putExtra("correo",correo.getText().toString());

        intent.putExtra("contactoNuevo",c);

        startActivity(intent);



    }



}