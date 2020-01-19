package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    Button a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a1 = (Button)findViewById(R.id.a1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Seat1.class);
                text = getResources().getString(R.string.a1);
                intent.putExtra("pass", text);
                startActivity(intent);
            }
        });
        a3 = (Button)findViewById(R.id.a3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Seat1.class);
                text = getResources().getString(R.string.a3);
                intent.putExtra("pass", text);
                startActivity(intent);
            }
        });
        b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Seat1.class);
                text = getResources().getString(R.string.b3);
                intent.putExtra("pass", text);
                startActivity(intent);
            }
        });
        c1 = (Button)findViewById(R.id.c1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Seat2.class);
                text = getResources().getString(R.string.c1);
                intent.putExtra("pass", text);
                startActivity(intent);
            }
        });
        c4 = (Button)findViewById(R.id.c4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Seat2.class);
                text = getResources().getString(R.string.c4);
                intent.putExtra("pass", text);
                startActivity(intent);
            }
        });
        d2 = (Button)findViewById(R.id.d2);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Seat2.class);
                text = getResources().getString(R.string.d2);
                intent.putExtra("pass", text);
                startActivity(intent);
            }
        });
        d4 = (Button)findViewById(R.id.d4);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Seat2.class);
                text = getResources().getString(R.string.d4);
                intent.putExtra("pass", text);
                startActivity(intent);
            }
        });


    }
}
