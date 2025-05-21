package com.example.sagefemme;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class pmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pmi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Button 1: Accueil et identification
        findViewById(R.id.buttons1).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add("Participation à la consultation");
            pmipop popup = pmipop.newInstance(items);
            popup.show(getSupportFragmentManager(), "AccueilPopup");
        });

        // Button 2: Examen clinique et paraclinique
        findViewById(R.id.buttons2).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add("Interrogatoire");
            items.add("Examen (général + obstétrical)");
            items.add("TV");
            items.add("Bilan");
            items.add("FCV");
            items.add("Carnet de suivi");

            pmipop popup = pmipop.newInstance(items);
            popup.show(getSupportFragmentManager(), "ExamenPopup");
        });


        // Button 3: Prise en charge
        findViewById(R.id.buttons3).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Examen obstétrical (inspection, palpation,TV…)");
            items.add("Dépistage pathologies");
            items.add("Vaccins");

            pmipop popup = pmipop.newInstance(items);
            popup.show(getSupportFragmentManager(), "PriseEnChargePopup");
        });

        // Button 4: Surveillance materno-fœtale
        findViewById(R.id.buttons4).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Examen gynéco");
            items.add("Ablation des fils");
            items.add("Rééducation périnéale");
            items.add("Médicaments");
            items.add("Orientation PF");



            pmipop popup = pmipop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SurveillancePopup");
        });

        // Button 5: Suivi et documentation
        findViewById(R.id.buttons5).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Allaitement");
            items.add("Croissance");
            items.add("Développement psychomoteur");
            items.add("Rééducation périnéale");
            items.add("Vaccination");
            items.add("Carnet de santé");

            pmipop popup = pmipop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        findViewById(R.id.buttons6).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add("Maladies carentielles");
            items.add("Diarrhées");
            items.add("malnutrition");
            items.add("Orientation");

            pmipop popup = pmipop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
    }
}