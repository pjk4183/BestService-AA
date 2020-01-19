package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ticket2 extends AppCompatActivity {
    Button button;
    TextView textView11;
    String text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket2);
        textView11 = findViewById(R.id.textView11);
        Intent intent = getIntent();
        String text = intent.getExtras().getString("pass");
        textView11.setText(text);
        text2 = text;


        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ticket2.this, Rate2.class);
                intent.putExtra("pass", text2);
                startActivity(intent);
            }
        });
    }
}
