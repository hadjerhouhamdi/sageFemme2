package com.example.sagefemme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Déclarations des vues
        Button btn = findViewById(R.id.button3);
        TextView bienvenue = findViewById(R.id.textView3);
        TextView textView = findViewById(R.id.textView2);

        // Gestion du clic sur le bouton
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(first.this, choix.class);
            startActivity(intent);
        });
    }
}
