package com.example.a4_petage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Date;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edtYear);
        textView = findViewById(R.id.txtRes);
        button = findViewById(R.id.btnCaculate);


        button.setOnClickListener(view -> {
            int petAge = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(editText.getText().toString());
            textView.setText(String.valueOf(petAge));
        });

    }
}