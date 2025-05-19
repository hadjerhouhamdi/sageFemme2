package com.example.sagefemme;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class choix extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_choix);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(choix.this, sallenaissance.class);
            startActivity(intent);
        });
        Button btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(choix.this, suitedecouche.class);
            startActivity(intent);
        });
        Button btn2 = findViewById(R.id.button3);
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(choix.this, GHR.class);
            startActivity(intent);
        });
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(v -> {
            Intent intent = new Intent(choix.this, reanimation.class);
            startActivity(intent);
        });
        Button btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(v -> {
            Intent intent = new Intent(choix.this, pmi.class);
            startActivity(intent);
        });
        Button btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(v -> {
            Intent intent = new Intent(choix.this, cpf.class);
            startActivity(intent);
        });
    }
}