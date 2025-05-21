package com.example.sagefemme;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class cpf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cpf);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Button 1: Préparation
        findViewById(R.id.buttons1).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add("Préparer local et matériel "
                    +"(consultation,counseling,IEC)");

            planningpop popup = planningpop.newInstance(items);
            popup.show(getSupportFragmentManager(), "AccueilPopup");
        });

        // Button 2: Accueil / Counseling
        findViewById(R.id.buttons2).setOnClickListener(v -> {
            ArrayList<String> items = new ArrayList<>();
            items.add("Conduire une séance de counseling");
            items.add("IEC pour groupes cibles");


            planningpop popup = planningpop.newInstance(items);
            popup.show(getSupportFragmentManager(), "ExamenPopup");
        });


        // Button 3: Examens cliniques
        findViewById(R.id.buttons3).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Examen général ");
            items.add("Seins");
            items.add("Examen pelvien");
            items.add("Dépistage infections");


            planningpop popup = planningpop.newInstance(items);
            popup.show(getSupportFragmentManager(), "PriseEnChargePopup");
        });

        // Button 4: Actes techniques
        findViewById(R.id.buttons4).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Frottis");
            items.add("Prélèvements");
            items.add("échographie");
            items.add("Insertion/retrait DIU");


            planningpop popup = planningpop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SurveillancePopup");
        });

        // Button 5: Contraception
        findViewById(R.id.buttons5).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Prescrire/Expliquer méthodes " +
                    "(hormonale,locale, barrière)");


            planningpop popup = planningpop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        // Button 6: Suivi
        findViewById(R.id.buttons6).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Contrôle DIU");
            items.add("Effets secondaires");
            items.add("Orientation si complications");

            planningpop popup = planningpop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });
        // Button 7: Gestion / Logistique
        findViewById(R.id.buttons7).setOnClickListener(v -> {

            ArrayList<String> items = new ArrayList<>();
            items.add("Analyse des données PF");
            items.add("Calcul CMM");
            items.add("Bon de commande");
            items.add("Stockage produits");


            planningpop popup = planningpop.newInstance(items);
            popup.show(getSupportFragmentManager(), "SuiviPopup");
        });


    }

}