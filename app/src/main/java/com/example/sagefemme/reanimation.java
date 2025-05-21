package com.example.sagefemme;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class reanimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reanimation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Button 1: Réception et installation
        findViewById(R.id.buttons1).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add(".Recevoir et installer une opérée");

            urgencepop popup = urgencepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "AccueilPopup");
        });

        // Button 2: Surveillance post-opératoire
        findViewById(R.id.buttons2).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add(".Surveillance en réanimation");
            items.add(".après curetage");
            items.add(".cerclage");
            items.add(".curage");
            urgencepop popup = urgencepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "ExamenPopup");
        });


        // Button 3: Réanimation
        findViewById(R.id.buttons3).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add(".Participer à la réanimation cardio-respiratoire");

            urgencepop popup = urgencepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "PriseEnChargePopup");
        });

        // Button 4: Transfusion
        findViewById(R.id.buttons4).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add(".Pratiquer une transfusion avec hémovigilance (prescription médicale)");

            urgencepop popup = urgencepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SurveillancePopup");
        });

        // Button 5: Surveillance des paramètres
        findViewById(R.id.buttons5).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add(".Monitorage invasif / non-invasif");
            items.add(".surveillance hémodynamique, douleur");

            urgencepop popup = urgencepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });

        // Button 6: Dépistage des complications
        findViewById(R.id.buttons6).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add(".Complications post-anesthésiques et post-opératoires");

            urgencepop popup = urgencepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });

        // Button 7: Documentation Travail en équipe
        findViewById(R.id.buttons7).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add(".Transcrire examens");
            items.add(".traitements sur les dossiers");
            urgencepop popup = urgencepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        // Button 8: Travail en équipe
        findViewById(R.id.buttons8).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add(".Prise en charge en équipe pluridisciplinaire");

            urgencepop popup = urgencepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });

    }

}