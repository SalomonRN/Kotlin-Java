package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class principal extends AppCompatActivity {

    private Button sig;
    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        sig = findViewById(R.id.b_sigam);
        nombre = findViewById(R.id.id_nom);

        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = nombre.getText().toString().trim();

                if (TextUtils.isEmpty(n)){

                    Toast.makeText(principal.this, "No se ha registrado ningun nombre, vuele a intentarlo", Toast.LENGTH_SHORT).show();

                }else {

                    Intent i = new Intent(principal.this, MainActivity.class);
                    i.putExtra("name", n);
                    startActivity(i);

                }


            }
        });

    }
}
