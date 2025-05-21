package com.example.sagefemme;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class sallenaissance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sallenaissance);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

// Button 1: Accueil et identification
findViewById(R.id.buttons1).setOnClickListener(v -> {

    ArrayList<String> items = new ArrayList<>();
            items.add("Accueillir la parturiente");
            items.add("Réaliser l’interrogatoire");
            items.add("Effectuer l’examen obstétrical complet");

    sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "AccueilPopup");
        });

// Button 2: Examen clinique et paraclinique
findViewById(R.id.buttons2).setOnClickListener(v -> {
ArrayList<String> items = new ArrayList<>();
            items.add("Examen général/obstétrical");
            items.add("Palpation");
            items.add("Hauteur utérine ");
            items.add("BCF");
            items.add("Toucher vaginal ");
            items.add("Examen du bassin");

sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "ExamenPopup");
        });


// Button 3: Prise en charge
findViewById(R.id.buttons3).setOnClickListener(v -> {
ArrayList<String> items = new ArrayList<>();

            items.add("Groupage Rh");
            items.add("Glycémie");
            items.add("Autres examens");
            items.add("Systématiques");

    sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "PriseEnChargePopup");
        });

// Button 4: Surveillance materno-fœtale
findViewById(R.id.buttons4).setOnClickListener(v -> {

ArrayList<String> items = new ArrayList<>();
            items.add("Partogramme");
            items.add("Courbe de contraction");
            items.add("Tococardiographie");
            items.add("Etat de la poche des eaux.");

    sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SurveillancePopup");
        });

// Button 5: Suivi et documentation
findViewById(R.id.buttons5).setOnClickListener(v -> {

ArrayList<String> items = new ArrayList<>();
            items.add("Matériel d’accouchement");
            items.add("Anesthésie");
            items.add("Solutés");
            items.add("Episiotomie");
            items.add("Monitoring");
            items.add("Forceps");

    sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });

        findViewById(R.id.buttons10).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();

            items.add("Accouchement eutocique");
            items.add("Par siège");
            items.add("Grossesse multiple");
            items.add("Episiotomie");
            items.add("Version interne");

            sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        findViewById(R.id.buttons6).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();

            items.add("Score d’Apgar");
            items.add("Aspiration oxygène");
            items.add("Massage cardiaque");
            items.add("Soins du cordon");
            items.add("Habillage");


            sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        findViewById(R.id.buttons7).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();

            items.add("Aspiration");
            items.add("Ventilation");
            items.add("Intubation");
            items.add("Cathétérisme ombilical");
            items.add("Injection");
            items.add("PH ");

            sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        findViewById(R.id.buttons8).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Surveillance 2h");
            items.add("Mise au sein");
            items.add("Nettoyage");
            items.add("Stérilisation");
            items.add("Remplissage des dossiers.");

            sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        findViewById(R.id.buttons5).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Matériel d’accouchement");
            items.add("Anesthésie");
            items.add("Solutés");
            items.add("Episiotomie");
            items.add("Monitoring");
            items.add("Forceps");

            sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        findViewById(R.id.buttons9).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();

            items.add("Déclaration de naissance");
            items.add("Certificat d’accouchement");
            items.add("Congé maternité.");


            sallenaisspop popup = sallenaisspop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });

        }
        }
