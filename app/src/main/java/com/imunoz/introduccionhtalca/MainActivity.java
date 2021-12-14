package com.imunoz.introduccionhtalca;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Locale;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botonReloj;
    private int hora, minuto;
    private TextView textoHora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonReloj = findViewById(R.id.botonReloj);
        textoHora = findViewById(R.id.textoHora);
    }

    public void seleccionarHora(View view){

        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int horaSeleccionada, int minutoSeleccionado) {
                hora = horaSeleccionada;
                minuto = minutoSeleccionado;
                //botonReloj.setText(hora+":"+minuto);
                botonReloj.setText(String.format(Locale.getDefault(),"%02d:%02d",hora,minuto));
                Toast.makeText(MainActivity.this,"La hora es:" + String.format(Locale.getDefault(),"%02d:%02d",hora,minuto),Toast.LENGTH_LONG ).show();

                if(hora>12){
                    textoHora.setText((hora-12)+minuto+" PM" );
                }else{
                    textoHora.setText( hora+" AM" );
                }


            }
        };

        TimePickerDialog timePickerDialog = new TimePickerDialog(this,onTimeSetListener,hora,minuto,true);
        timePickerDialog.show();


    }

    public void lanzarActivity(View view){
        Intent intent = new Intent(this, MainActivity2.class );
        intent.putExtra("claveNueva","Esto es un extra");
        startActivity(intent);



    }




}