package com.example.appbmi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultActivity extends AppCompatActivity {
    TextView tvBMI, tvPhanloai;
    Button btn_ql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);
        tvBMI = findViewById(R.id.tvBMI);
        tvPhanloai = findViewById(R.id.tvPhanloai);
        btn_ql = findViewById(R.id.btn_ql);
         double height = getIntent().getDoubleExtra("height", 0);
         double weight = getIntent().getDoubleExtra("weight", 0);
         double bmi = weight / (height*height);
         String loai;
         if (bmi < 18.5)
             loai = "Gầy";
         else if (bmi < 25)
             loai = "Bình thường";
         else if (bmi < 30)
             loai = "Thừa cân";
         else
             loai = "Béo phì";
         tvBMI.setText(String.format("BMI: %.2f", bmi));
         tvPhanloai.setText("Phân loại: "+loai);
         btn_ql.setOnClickListener(v -> finish());

    }
}
