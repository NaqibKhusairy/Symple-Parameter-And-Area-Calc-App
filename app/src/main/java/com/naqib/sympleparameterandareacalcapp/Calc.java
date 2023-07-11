package com.naqib.sympleparameterandareacalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Calc extends AppCompatActivity {
    TextView calc,shapename,formula;
    ImageView shapeimage;
    EditText num1,num2,num3,num4,result;
    Button Btncalc,back;
    String calculation,shape,Formula,Required1,Required2,Required3,Required4;
    double pi=3.142,rslt,r,a,b,c,h,w,l,d;

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    public void getresult(){
        try{
            switch (shape){
                case "CIRCLE":
                    if(calculation.equals("CIRCUMFERENCE / UKURLILIT")){
                        r=Double.parseDouble(num1.getText().toString());
                        rslt=2*pi*r;
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        r=Double.parseDouble(num1.getText().toString());
                        rslt=pi*r*r;
                    }
                    break;
                case "ELLIPSE":
                    if(calculation.equals("AREA / LUAS")){
                        a=Double.parseDouble(num1.getText().toString());
                        b=Double.parseDouble(num2.getText().toString());
                        rslt=pi*a*b;
                    }
                    break;
                case "TRIANGLE":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        b=Double.parseDouble(num2.getText().toString());
                        c=Double.parseDouble(num3.getText().toString());
                        rslt=a+b+c;
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        h=Double.parseDouble(num1.getText().toString());
                        b=Double.parseDouble(num2.getText().toString());
                        rslt=(h*b)*1/2;
                    }
                    break;
                case "SQUARE":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=4*a;
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=a*a;
                    }
                    break;
                case "RECTANGLE":
                    if(calculation.equals("PERIMETER")){
                        w=Double.parseDouble(num1.getText().toString());
                        l=Double.parseDouble(num2.getText().toString());
                        rslt=2*(w+l);
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        w=Double.parseDouble(num1.getText().toString());
                        l=Double.parseDouble(num2.getText().toString());
                        rslt=(w*l);
                    }
                    break;
                case "RHOMBUS":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=4*a;
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        h=Double.parseDouble(num1.getText().toString());
                        w=Double.parseDouble(num2.getText().toString());
                        rslt=(h*w)*1/2;
                    }
                    break;
                case "KITE":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        b=Double.parseDouble(num2.getText().toString());
                        rslt=2*(a+b);
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        h=Double.parseDouble(num1.getText().toString());
                        w=Double.parseDouble(num2.getText().toString());
                        rslt=(w*h)*1/2;
                    }
                    break;
                case "PARALLELOGRAM":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        b=Double.parseDouble(num2.getText().toString());
                        rslt=2*(a+b);
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        b=Double.parseDouble(num1.getText().toString());
                        h=Double.parseDouble(num2.getText().toString());
                        rslt=b*h;
                    }
                    break;
                case "TRAPEZOID":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        b=Double.parseDouble(num2.getText().toString());
                        c=Double.parseDouble(num3.getText().toString());
                        d=Double.parseDouble(num4.getText().toString());
                        rslt=a+b+c+d;
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        a=Double.parseDouble(num1.getText().toString());
                        b=Double.parseDouble(num2.getText().toString());
                        h=Double.parseDouble(num3.getText().toString());
                        rslt=(a+b)*1/2*h;
                    }
                    break;
                case "PENTAGON":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=5*a;
                    }
                    break;
                case "HEXAGON":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=6*a;
                    }
                    break;
                case "HEPTAGON":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=7*a;
                    }
                    break;
                case "OCTAGON":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=8*a;
                    }
                    break;
                case "NONAGON":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=9*a;
                    }
                    break;
                case "DECAGON":
                    if(calculation.equals("PERIMETER")){
                        a=Double.parseDouble(num1.getText().toString());
                        rslt=10*a;
                    }
                    break;
                default:
                    rslt=0;
            }
            result.setText(String.format("%.2f", rslt));
        } catch (Exception e) {
            switch (shape){
                case "CIRCLE":
                    if(calculation.equals("CIRCUMFERENCE / UKURLILIT")){
                        Required1="Please enter the value of r";
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of r";
                    }
                    break;
                case "ELLIPSE":
                    if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of a";
                        Required2="Please enter the value of b";
                    }
                    break;
                case "TRIANGLE":
                    if(calculation.equals("PERIMETER")){
                        Required1="Please enter the value of a";
                        Required2="Please enter the value of b";
                        Required3="Please enter the value of c";
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of h";
                        Required2="Please enter the value of b";
                    }
                    break;
                case "SQUARE":
                    if(calculation.equals("PERIMETER")){
                        Required1="Please enter the value of a";
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of a";
                    }
                    break;
                case "RECTANGLE":
                    if(calculation.equals("PERIMETER")){
                        Required1="Please enter the value of w";
                        Required2="Please enter the value of l";
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of w";
                        Required2="Please enter the value of l";
                    }
                    break;
                case "RHOMBUS":
                    if(calculation.equals("PERIMETER")){
                        Required1="Please enter the value of a";
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of h";
                        Required2="Please enter the value of w";
                    }
                    break;
                case "KITE":
                    if(calculation.equals("PERIMETER")){
                        Required1="Please enter the value of a";
                        Required2="Please enter the value of b";
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of h";
                        Required2="Please enter the value of w";
                    }
                    break;
                case "PARALLELOGRAM":
                    if(calculation.equals("PERIMETER")){
                        Required1="Please enter the value of a";
                        Required2="Please enter the value of b";
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of b";
                        Required2="Please enter the value of h";
                    }
                    break;
                case "TRAPEZOID":
                    if(calculation.equals("PERIMETER")){
                        Required1="Please enter the value of a";
                        Required2="Please enter the value of b";
                        Required3="Please enter the value of c";
                        Required4="Please enter the value of d";
                    }
                    else if(calculation.equals("AREA / LUAS")){
                        Required1="Please enter the value of a";
                        Required2="Please enter the value of b";
                        Required3="Please enter the value of h";
                    }
                    break;
                case "PENTAGON":
                case "HEXAGON":
                case "HEPTAGON":
                case "OCTAGON":
                case "NONAGON":
                case "DECAGON":
                    if(calculation.equals("PERIMETER")){
                        Required1="Please enter the value of a";
                    }
                    break;
                default:
                    rslt=0;
            }
            if((num1.getText().toString()).isEmpty()&&(num2.getText().toString()).isEmpty()&&(num3.getText().toString()).isEmpty()&&(num4.getText().toString()).isEmpty()){
                num1.setError(Required1);
                num2.setError(Required2);
                num3.setError(Required3);
                num4.setError(Required4);
            }
            else if((num1.getText().toString()).isEmpty()){
                num1.setError(Required1);
            }
            else if((num2.getText().toString()).isEmpty()){
                num2.setError(Required2);
            }
            else if((num3.getText().toString()).isEmpty()){
                num3.setError(Required3);
            }
            else if((num4.getText().toString()).isEmpty()){
                num4.setError(Required4);
            }
            result.setVisibility(View.GONE);
        }
    }

    public void formla(){
        switch (shape){
            case "CIRCLE":
                if(calculation.equals("CIRCUMFERENCE / UKURLILIT")){
                    Formula="2πr";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of r");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="πr^2";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of r");
                }
                shapeimage.setImageResource(R.drawable.one);
                break;
            case "ELLIPSE":
                if(calculation.equals("PERIMETER")){
                    Formula="-";
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="πab";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                    num2.setHint("Enter value of b");
                }
                shapeimage.setImageResource(R.drawable.two);
                break;
            case "TRIANGLE":
                if(calculation.equals("PERIMETER")){
                    Formula="a+b+c";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num3.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                    num2.setHint("Enter value of b");
                    num3.setHint("Enter value of c");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="1/2(h*b)";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of h");
                    num2.setHint("Enter value of b");
                }
                shapeimage.setImageResource(R.drawable.three);
                break;
            case "SQUARE":
                if(calculation.equals("PERIMETER")){
                    Formula="4a";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="a^2";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                shapeimage.setImageResource(R.drawable.four);
                break;
            case "RECTANGLE":
                if(calculation.equals("PERIMETER")){
                    Formula="2(w+l)";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of w");
                    num2.setHint("Enter value of l");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="w*l";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of w");
                    num2.setHint("Enter value of l");
                }
                shapeimage.setImageResource(R.drawable.five);
                break;
            case "RHOMBUS":
                if(calculation.equals("PERIMETER")){
                    Formula="4a";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="1/2(h*w)";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of h");
                    num2.setHint("Enter value of w");
                }
                shapeimage.setImageResource(R.drawable.six);
                break;
            case "KITE":
                if(calculation.equals("PERIMETER")){
                    Formula="2(a+b)";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                    num2.setHint("Enter value of b");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="1/2(h*w)";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of h");
                    num2.setHint("Enter value of w");
                }
                shapeimage.setImageResource(R.drawable.seven);
                break;
            case "PARALLELOGRAM":
                if(calculation.equals("PERIMETER")){
                    Formula="2(a+b)";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                    num2.setHint("Enter value of b");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="b*h";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of b");
                    num2.setHint("Enter value of h");
                }
                shapeimage.setImageResource(R.drawable.eight);
                break;
            case "TRAPEZOID":
                if(calculation.equals("PERIMETER")){
                    Formula="a+b+c+d";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num3.setVisibility(View.VISIBLE);
                    num4.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                    num2.setHint("Enter value of b");
                    num3.setHint("Enter value of c");
                    num4.setHint("Enter value of d");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="1/2(a+b)h";
                    num1.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    num3.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                    num2.setHint("Enter value of b");
                    num3.setHint("Enter value of h");
                }
                shapeimage.setImageResource(R.drawable.nine);
                break;
            case "PENTAGON":
                if(calculation.equals("PERIMETER")){
                    Formula="5a";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="-";
                }
                shapeimage.setImageResource(R.drawable.ten);
                break;
            case "HEXAGON":
                if(calculation.equals("PERIMETER")){
                    Formula="6a";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="-";
                }
                shapeimage.setImageResource(R.drawable.eleven);
                break;
            case "HEPTAGON":
                if(calculation.equals("PERIMETER")){
                    Formula="7a";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="-";
                }
                shapeimage.setImageResource(R.drawable.twelve);
                break;
            case "OCTAGON":
                if(calculation.equals("PERIMETER")){
                    Formula="8a";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="-";
                }
                shapeimage.setImageResource(R.drawable.thirdteen);
                break;
            case "NONAGON":
                if(calculation.equals("PERIMETER")){
                    Formula="9a";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="-";
                }
                shapeimage.setImageResource(R.drawable.fourthteen);
                break;
            case "DECAGON":
                if(calculation.equals("PERIMETER")){
                    Formula="10a";
                    num1.setVisibility(View.VISIBLE);
                    num1.setHint("Enter value of a");
                }
                else if(calculation.equals("AREA / LUAS")){
                    Formula="-";
                }
                shapeimage.setImageResource(R.drawable.fifteen);
                break;
            default:
                Formula="";
        }

        formula.setText(Formula);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        calc=findViewById(R.id.calc);
        shapename=findViewById(R.id.shapename);
        shapeimage=findViewById(R.id.shapeimg);
        formula=findViewById(R.id.formula);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        result=findViewById(R.id.resl);
        Btncalc=findViewById(R.id.calcbtn);
        back=findViewById(R.id.back);

        num1.setVisibility(View.GONE);
        num2.setVisibility(View.GONE);
        num3.setVisibility(View.GONE);
        num4.setVisibility(View.GONE);

        result.setVisibility(View.GONE);
        result.setEnabled(false);

        shape=getIntent().getStringExtra("shape");
        calculation=(getIntent().getStringExtra("calculation")).toUpperCase();

        calc.setText(calculation);
        shapename.setText(shape);

        formla();

        Btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setVisibility(View.VISIBLE);
                getresult();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),PACAOP.class);
                if(shape.equals("CIRCLE")){
                    i.putExtra("image",R.drawable.circle);
                }
                else if(shape.equals("ELLIPSE")){
                    i.putExtra("image",R.drawable.ellipse);
                }
                else if(shape.equals("TRIANGLE")){
                    i.putExtra("image",R.drawable.triangle);
                }
                else if(shape.equals("SQUARE")){
                    i.putExtra("image",R.drawable.square);
                }
                else if(shape.equals("RECTANGLE")){
                    i.putExtra("image",R.drawable.rectangle);
                }
                else if(shape.equals("RHOMBUS")){
                    i.putExtra("image",R.drawable.rhombus);
                }
                else if(shape.equals("KITE")){
                    i.putExtra("image",R.drawable.kite);
                }
                else if(shape.equals("PARALLELOGRAM")){
                    i.putExtra("image",R.drawable.parallelogram);
                }
                else if(shape.equals("TRIPEZIOD")){
                    i.putExtra("image",R.drawable.trapezoid);
                }
                else if(shape.equals("PENTAGON")){
                    i.putExtra("image",R.drawable.pentagon);
                }
                else if(shape.equals("HEXAGON")){
                    i.putExtra("image",R.drawable.hexagon);
                }
                else if(shape.equals("HEPTAGON")){
                    i.putExtra("image",R.drawable.heptagon);
                }
                else if(shape.equals("OKTAGON")){
                    i.putExtra("image",R.drawable.oktagon);
                }
                else if(shape.equals("NONAGON")){
                    i.putExtra("image",R.drawable.nonagon);
                }
                else if(shape.equals("DEKAGON")){
                    i.putExtra("image",R.drawable.dekagon);
                }
                i.putExtra("shape",shape);
                startActivity(i);
            }
        });
    }
}