package com.example.sagefemme;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class suitedecouche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_suitedecouche);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
// Button 2: Surveillance de la mère
        findViewById(R.id.buttons2).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add("Constantes");
            items.add("lochies");
            items.add("involution utérine");
            items.add("signes de phlébite");
            items.add("complications");
            suitepop popup = suitepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "AccueilPopup");
        });

        // Button 4: Soins à la mère
        findViewById(R.id.buttons4).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add("Toilette vulvaire");
            items.add("soins du sein");
            items.add("soin sépisiotomie");
            items.add("vidange du sein");
            items.add("Anti-D");

            suitepop popup = suitepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "ExamenPopup");
        });


        // Button 10: Surveillance du N-Né
        findViewById(R.id.buttons10).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Coloration ");
            items.add("1ère miction et selle");
            items.add("Soins du cordon");
            items.add("Toilette");
            items.add("vaccinations");

            suitepop popup = suitepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "PriseEnChargePopup");
        });

        // Button 9: Conseil et orientation
        findViewById(R.id.buttons9).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Hygiène");
            items.add("Alimentation");
            items.add("Anomalies");
            items.add("Contraception");
            items.add("Orientation SMI");



            suitepop popup = suitepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SurveillancePopup");
        });

        // Button 7: Allaitement
        findViewById(R.id.buttons7).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Mise au sein");
            items.add("Bandage");
            items.add("Prévention des engorgements");
            items.add("Crevasses");


            suitepop popup = suitepop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });

    }
}