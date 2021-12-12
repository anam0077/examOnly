package net.englishjet.taskcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnMul,btnAdd,btnSub, btnDiv, btnClear, btnEqual;
    String containerString="", calculator="", toShow="", completion="";
    Double firstContainer, secondContainer, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=findViewById(R.id.display);
        btn0=findViewById(R.id.button0);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);
        btnAdd=findViewById(R.id.button_add);
        btnSub=findViewById(R.id.button_sub);
        btnMul=findViewById(R.id.button_mul);
        btnDiv=findViewById(R.id.button_div);
        btnClear=findViewById(R.id.buttonc);
        btnEqual=findViewById(R.id.button_equ);
        btnClick();
    }

    public void btnClick(){
        btnClear.setOnClickListener((View v)-> {
                display.setText(containerString);
                containerString="";
                firstContainer=0.0;
                secondContainer=0.0;
                result=0.0;
                toShow="";
                completion="";
        });

        btnEqual.setOnClickListener((View v)-> {

                if(!containerString.isEmpty()) {
                    secondContainer = Double.parseDouble(containerString);
                }
                switch (calculator){
                    case "add":
                        result=firstContainer+secondContainer;
                        display.setText(String.format(Locale.ENGLISH,"%.0f",result));
                        break;
                    case "sub":
                        result=firstContainer - secondContainer;
                        display.setText(String.format(Locale.ENGLISH,"%.0f",result));
                        break;
                    case "mul":
                        result=firstContainer * secondContainer;
                        display.setText(String.format(Locale.ENGLISH,"%.0f",result));
                        break;
                    case "div":
                        result=firstContainer / secondContainer;
                        if((firstContainer%secondContainer)==0){
                            display.setText(String.format(Locale.ENGLISH,"%.0f",result));
                        }else {
                            toShow="" + result;
                            display.setText(toShow);
                        }
                        break;
                    default:
                        result=0.0;
                }
                containerString="";
                firstContainer=0.0;
                secondContainer=0.0;
                result=0.0;
                toShow="";
                completion="";
        });
        btnAdd.setOnClickListener((View v)-> {

                if(!containerString.isEmpty()) {
                    firstContainer = Double.parseDouble(containerString);
                }
                calculator="add";
                containerString="";
                toShow= String.format(Locale.ENGLISH,"%.0f",firstContainer)+"+";
                completion=toShow;
                display.setText(toShow);
                toShow="";
        });

        btnSub.setOnClickListener((View v)-> {

                if(!containerString.isEmpty()) {
                firstContainer = Double.parseDouble(containerString);
                }
                calculator="sub";
                containerString="";
                toShow=String.format(Locale.ENGLISH,"%.0f",firstContainer)+"-";
                completion=toShow;
                display.setText(toShow);
                toShow="";
        });

        btnMul.setOnClickListener((View)-> {

                if(!containerString.isEmpty()) {
                    firstContainer = Double.parseDouble(containerString);
                }
                calculator="mul";
                containerString="";
                toShow=String.format(Locale.ENGLISH,"%.0f",firstContainer)+"x";
                completion=toShow;
                display.setText(toShow);
                toShow="";

        });

        btnDiv.setOnClickListener((View v)-> {
                if(!containerString.isEmpty()) {
                    firstContainer = Double.parseDouble(containerString);
                }
                calculator="div";
                containerString="";
                toShow=String.format(Locale.ENGLISH,"%.0f", firstContainer)+"÷";
                completion=toShow;
                display.setText(toShow);
                toShow="";
        });

        btn0.setOnClickListener((View v) ->{
            containerString = containerString + "0";
            toShow = toShow + completion + containerString;
            display.setText(toShow);
            toShow = "";
        });

        btn1.setOnClickListener( (View v) ->{
                containerString=containerString+"1";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });


        btn2.setOnClickListener( (View v)->{
                containerString=containerString+"2";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });

        btn3.setOnClickListener((View v)-> {
                containerString=containerString+"3";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });

        btn4.setOnClickListener((View v)-> {
                containerString=containerString+"4";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });

        btn5.setOnClickListener((View v)->{
                containerString=containerString+"5";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });

        btn6.setOnClickListener((View v)-> {

                containerString=containerString+"6";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });

        btn7.setOnClickListener((View v)-> {
                containerString=containerString+"7";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });

        btn8.setOnClickListener(( View v)-> {

                containerString=containerString+"8";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });

        btn9.setOnClickListener((View v) ->{
                containerString=containerString+"9";
                toShow=toShow+completion+containerString;
                display.setText(toShow);
                toShow="";
        });
    }
}