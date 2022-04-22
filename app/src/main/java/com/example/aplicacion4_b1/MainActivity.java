package com.example.aplicacion4_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Atributos -> componentes visuales
    private EditText etPalabra;
    private Button btnContar;
    private Switch swVocales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        btnContar.setOnClickListener(view -> evaluarVocal());
        //Un string imaginenlo como un vector con posiciones
        //hola
        //0123
        //String auxiliar = "hola"
        //auxiliar.chartAt(indice)
        //auxiliar.charAt(0) = 'h'
    }

    private void inicializarVistas() {
        etPalabra = findViewById(R.id.etPalabra);
        btnContar = findViewById(R.id.btnContar);
        swVocales = findViewById(R.id.swVocales);
    }

    private void mostrarResultado() {
        //Toast es una ventana emergente temporal
        //que sale en la parte inferior de la aplicacion
        //para brindar cierta información al usuario.
        //Lo pueden asemejar a los popups de programacion web
        //pero en su version mas básico
        /*
          La ventana Toast necesita configurar algunos parametros
          que se le envia a un metodo llamado .makeText
            - contexto: pantalla donde se va a dibujar esa ventana
            - cadena String: mensaje a mostrar.
            - Duracion de la ventana: Existen ya constantes definidas para eso
         */
        String auxiliar = "Viernes";
        Toast.makeText(this, auxiliar, Toast.LENGTH_LONG)
                .show();
    }

    private void evaluarVocal() {
        //Cuando sea un valor booleano el get usa la palabra is
        if(swVocales.isChecked()) {
            mostrarResultado();
        } else {
            Toast.makeText(this,"Mala suerte", Toast.LENGTH_LONG).show();
        }
    }
}




















