package com.naqib.sympleparameterandareacalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView penerangn;
    Button Start;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penerangn=findViewById(R.id.textView2);
        Start=findViewById(R.id.button);

        penerangn.setText("This app is used to help you to calculate the Parameter or the Area of the shape\n" +
                "Please Choose Your Shape");

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {{
                Toast.makeText(getApplicationContext(), "Welcome to Parameter and Area Calcuator", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),ChooseShape.class);
                startActivity(i);
            }
            }
        });
    }
}