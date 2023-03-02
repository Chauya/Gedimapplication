package com.example.gedimatapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gedimatapplication.ImportReal;
import com.example.gedimatapplication.R;

public class MainActivity extends AppCompatActivity {

    private Button btnEnter = null;
    MySQLiteOpenDAO bdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtention des références sur le bouton de l'activity
        btnEnter = (Button)findViewById(R.id.btnEnter);

        // Ecouteur sur le bouton de l'activity
        btnEnter.setOnClickListener(EcouteurBouton);

        // Création de la BDD embarquée
        bdd = new MySQLiteOpenDAO(MainActivity.this);
    }

    public View.OnClickListener EcouteurBouton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent importGo = new Intent(MainActivity.this, ImportReal.class);
            startActivity(importGo);
        }
    };

}