package com.example.sagefemme;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class GHR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ghr);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Button 1: Accueil et identification
        findViewById(R.id.buttons2).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add(".Accueillir la gestante");
            items.add(".Faire l’anamnèse");
            items.add(".l’installer confortablement");

            GHRPOP popup = GHRPOP.newInstance(items);
            popup.show(getSupportFragmentManager(), "AccueilPopup");
        });

        // Button 2: Examen clinique et paraclinique
        findViewById(R.id.buttons4).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add(".Examen général/obstétrical");
            items.add(".Échographie");
            items.add(".Radio");
            items.add(".Tococardiographie");

            GHRPOP popup = GHRPOP.newInstance(items);
            popup.show(getSupportFragmentManager(), "ExamenPopup");
        });


        // Button 3: Prise en charge
        findViewById(R.id.buttons10).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add(".Amniocentèse");
            items.add(".Surveillance après exploration");
            items.add(".Diagnostic/pronostic");

            GHRPOP popup = GHRPOP.newInstance(items);
            popup.show(getSupportFragmentManager(), "PriseEnChargePopup");
        });

        // Button 4: Surveillance materno-fœtale
        findViewById(R.id.buttons7).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add(".Monitoring");
            items.add(".Fiche de surveillance");
            items.add(".Soins nécessaires.");

            GHRPOP popup = GHRPOP.newInstance(items);
            popup.show(getSupportFragmentManager(), "SurveillancePopup");
        });

        // Button 5: Suivi et documentation
        findViewById(R.id.buttons9).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add(".Transcrire examens et soins");
            items.add(".Prévenir les infections");
            items.add(".Accompagnement au bloc");

            GHRPOP popup = GHRPOP.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
    }
}
