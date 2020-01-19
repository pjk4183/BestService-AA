package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;


public class MainActivity extends AppCompatActivity {
    Button btn;
    private long backBtnTime = 0;
    EditText lastedit, firstedit, locator;



    AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        updateUI();

    }

    private void updateUI() {
        lastedit = (EditText)findViewById(R.id.lastedit);
        firstedit = (EditText)findViewById(R.id.firstedit);
        locator = (EditText)findViewById(R.id.locator);
        btn = (Button) findViewById(R.id.btn);

        awesomeValidation.addValidation(MainActivity.this,R.id.lastedit,"[a-zA-Z\\s]+",R.string.lastedit);
        awesomeValidation.addValidation(MainActivity.this,R.id.firstedit,"[a-zA-Z\\s]+",R.string.firstedit);
        awesomeValidation.addValidation(MainActivity.this,R.id.locator,"[a-zA-Z0-9\\s]+",R.string.locator);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(awesomeValidation.validate()){
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Error",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    @Override
    public void onBackPressed() {
        long curTime = System.currentTimeMillis(); //현재시간을 밀리세컨드로 변경
        long gapTime = curTime - backBtnTime;

        //한번더 눌렀을때
        if (0 <= gapTime && 2000 >= gapTime){
            super.onBackPressed();
        }
        //한번 눌렀을때
        else{
            backBtnTime = curTime;
            Toast.makeText(this, "Pressing Back Button will close the app", Toast.LENGTH_SHORT).show();
        }
    }
}
