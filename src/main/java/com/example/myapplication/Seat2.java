package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Seat2 extends AppCompatActivity {
    Button next, previous;
    TextView textView11;
    String text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat2);

        textView11 = findViewById(R.id.textView11);
        Intent intent = getIntent();
        String text = intent.getExtras().getString("pass");
        textView11.setText(text);
        text2 = text;

        next = (Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Seat2.this, Ticket2.class);
                intent.putExtra("pass", text2);
                startActivity(intent);
            }
        });

        previous = (Button)findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Seat2.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
