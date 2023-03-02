package com.example.gedimatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.gedimatapplication.MySQLiteOpenHelper;
import com.example.gedimatapplication.R;

import org.w3c.dom.Text;

public class ImportReal extends AppCompatActivity {

    private TextView urlView;
    private MySQLiteOpenHelper mySQLiteOpenHelper;
    MySQLiteOpenDAO bdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_import_real);

        // Obtention des références sur la vue de l'activité
        urlView = (TextView)findViewById(R.id.urlView);

        // Ecouteur sur les items


        //urlView = (TextView) findViewById(R.id.urlView);

        // Creation d'un objet Realisation
        //Realisation R = new Realisation();
        // Ajout des propriétés à la réalisation
        //R.setId(1);
        //R.setTitre("Ouioui2");
        //R.setDescription("Ouioui");
        //R.setNbGaimes(5);
        // Insertion des objets Realisation
        //bdd.insertReal(R);

        // Creation d'un objet Votant
        //Votant V = new Votant();
        // Ajout des propriétés au votant
        //V.setCode("15dr26gh36jk");
        //V.setMail("ouioui@gmail.com");
        //V.setDateUtilisation("2023-12-12");
        //V.setDateAccord("2023-12-12");
        //bdd.insertVote(V);

    }

}