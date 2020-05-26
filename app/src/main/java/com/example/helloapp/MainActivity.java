package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editext1 = findViewById(R.id.editText1);
        final EditText editext2 = findViewById(R.id.editText2);
        Button button = findViewById(R.id.button1);
        final TextView textview = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstValue = editext1.getText().toString();
                String seconValue = editext2.getText().toString();
                int solution = Integer.valueOf(firstValue) + Integer.valueOf(seconValue);
                textview.setText(String.valueOf(solution));
            }
        });
    }
}
