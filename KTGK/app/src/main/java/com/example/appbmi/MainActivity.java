package com.example.appbmi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText tvHeight, tvWeight;
    Button btn_Tinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvWeight = findViewById(R.id.tvWeight);
        tvHeight = findViewById(R.id.tvHeight);
        btn_Tinh = findViewById(R.id.btn_tinh);
        btn_Tinh.setOnClickListener(v -> {
            String h = tvHeight.getText().toString();
            String w = tvWeight.getText().toString();
            if (h.isEmpty() || w.isEmpty()){
                Toast.makeText(this, "Vui lòng nhập đủ thông tin!", Toast.LENGTH_SHORT).show();
                return;
            }
            double height = Double.parseDouble(h);
            double weight = Double.parseDouble(w);
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("height", height);
            intent.putExtra("weight", weight);
            startActivity(intent);
        });

    }
}