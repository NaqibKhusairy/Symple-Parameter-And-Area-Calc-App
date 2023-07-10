package com.naqib.sympleparameterandareacalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PACAOP extends AppCompatActivity {
    ImageView shapeimage;
    TextView shapename,penerangan;
    Button para,area,back;
    String shape,calculation;
    int ShapeImage;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacaop);
        shapeimage=findViewById(R.id.shapeimg);
        shapename=findViewById(R.id.shapename);
        penerangan=findViewById(R.id.penerangan);
        para=findViewById(R.id.parameter);
        area=findViewById(R.id.area);
        back=findViewById(R.id.back);

        shape=getIntent().getStringExtra("shape");
        ShapeImage=getIntent().getIntExtra("image", 0);

        shapename.setText(shape);
        shapeimage.setImageResource(ShapeImage);
        penerangan.setText("PUT EXPLANATION");

        switch (shape){
            case "ELLIPSE":
                para.setVisibility(View.GONE);
                break;
            case "PENTAGON":
            case "HEXAGON":
            case "HEPTAGON":
            case "OCTAGON":
            case "NONAGON":
            case "DECAGON":
                area.setVisibility(View.GONE);
                break;
            case "CIRCLE":
                para.setText("CIRCUMFERENCE / UKURLILIT");
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please Choose Your Shape", Toast.LENGTH_SHORT).show();
                Intent b = new Intent(getApplicationContext(),ChooseShape.class);
                startActivity(b);
            }
        });

        para.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation=para.getText().toString();
                Intent p = new Intent(getApplicationContext(),Calc.class);
                p.putExtra("calculation",calculation);
                p.putExtra("shape",shape);
                startActivity(p);
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation=area.getText().toString();
                Intent a = new Intent(getApplicationContext(),Calc.class);
                a.putExtra("calculation",calculation);
                a.putExtra("shape",shape);
                startActivity(a);
            }
        });
    }
}