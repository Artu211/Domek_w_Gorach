package com.example.domek_w_gorach;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends AppCompatActivity {
    private Button polubButton;
    private Button usunButton;
    private Button zapiszButton;
    private TextView text_polub;

    private int tealColor = Color.parseColor("#008080");
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        polubButton = findViewById(R.id.polub);
        usunButton = findViewById(R.id.usun);
        zapiszButton = findViewById(R.id.zapisz);
        text_polub = findViewById(R.id.text_polub);


        polubButton.setBackgroundColor(tealColor);
        usunButton.setBackgroundColor(tealColor);
        zapiszButton.setBackgroundColor(tealColor);

        polubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                text_polub.setText(count + " polubień");

            }
        });

    };
}