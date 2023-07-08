package com.naqib.sympleparameterandareacalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PACAOP extends AppCompatActivity {
    ImageView shapeimage;
    TextView shapename,penerangan;
    Button para,area,back;
    String shape;
    int ShapeImage;

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

        switch (shape){
            case "ELLIPSE":
            case "PENTAGON":
            case "HEXAGON":
            case "HEPTAGON":
            case "OKTAGON":
            case "NONAGON":
            case "DEKAGON":
                area.setVisibility(View.GONE);
                break;
            case "CIRCLE":
                para.setText("Circumference / Ukurlilit");
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),ChooseShape.class);
                startActivity(b);
            }
        });
    }
}