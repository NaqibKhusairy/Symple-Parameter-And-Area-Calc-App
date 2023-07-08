package com.naqib.sympleparameterandareacalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChooseShape extends AppCompatActivity {
    LinearLayout crcl,ellps,tri,sq,rec,rhom,kte,parall,triped,penta,hexa,hepta,okta,nona,deka;
    TextView Crcl,Ellps,Tri,Sq,Rec,Rhom,Kte,Parall,Triped,Penta,Hexa,Hepta,Okta,Nona,Deka;
    String shape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_shape);
        Crcl=findViewById(R.id.bulat2);
        Ellps=findViewById(R.id.bujur2);
        Tri=findViewById(R.id.segitiga2);
        Sq=findViewById(R.id.segiempatsama2);
        Rec=findViewById(R.id.segiempattepat2);
        Rhom=findViewById(R.id.rhombus2);
        Kte=findViewById(R.id.layanglayang2);
        Parall=findViewById(R.id.parallelogram2);
        Triped=findViewById(R.id.trapizeum2);
        Penta=findViewById(R.id.pentagon2);
        Hexa=findViewById(R.id.hexagon2);
        Hepta=findViewById(R.id.heptagon2);
        Okta=findViewById(R.id.oktagon2);
        Nona=findViewById(R.id.nonagon2);
        Deka=findViewById(R.id.dekagon2);

        crcl=findViewById(R.id.bulat);
        ellps=findViewById(R.id.bujur);
        tri=findViewById(R.id.segitiga);
        sq=findViewById(R.id.segiempatsama);
        rec=findViewById(R.id.segiempattepat);
        rhom=findViewById(R.id.rhombus);
        kte=findViewById(R.id.layanglayang);
        parall=findViewById(R.id.parallelogram);
        triped=findViewById(R.id.trapizeum);
        penta=findViewById(R.id.pentagon);
        hexa=findViewById(R.id.hexagon);
        hepta=findViewById(R.id.heptagon);
        okta=findViewById(R.id.oktagon);
        nona=findViewById(R.id.nonagon);
        deka=findViewById(R.id.dekagon);

        crcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Crcl.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.circle);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        ellps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Ellps.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.ellipse);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Tri.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.triangle);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Sq.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.square);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Rec.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.rectangle);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        rhom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Rhom.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.rhombus);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        kte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Kte.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.kite);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        parall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Parall.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.parallelogram);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        triped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Triped.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.trapezoid);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        penta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Penta.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.pentagon);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        hexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Hexa.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.hexagon);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        hepta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Hepta.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.heptagon);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        okta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Okta.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.oktagon);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        nona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Nona.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.nonagon);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });

        deka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shape=Deka.getText().toString();
                Intent c = new Intent(getApplicationContext(),PACAOP.class);
                c.putExtra("image",R.drawable.dekagon);
                c.putExtra("shape",shape);
                startActivity(c);
            }
        });
    }
}