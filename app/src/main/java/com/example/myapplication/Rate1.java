package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Rate1 extends AppCompatActivity {

    Button next;
    TextView textView11;
    RatingBar ratingbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate1);

        ratingbar = findViewById(R.id.ratingBar);
        Float ratingNumber = ratingbar.getRating();

        textView11 = findViewById(R.id.textView11);
        Intent intent = getIntent();
        String text2 = intent.getExtras().getString("pass");
        textView11.setText(text2);



        next = (Button)findViewById(R.id.submit);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rate1.this, End.class);
                startActivity(intent);
            }
        });



    }
}
