package com.example.mughal.justmaths;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView TextBox ;
    private Button btnOne ;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnZero;
    private Button btnAdd;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btnAns;
    private Button btnClear;
    private Button btnAllClear;

    String text = "";
    Integer Value1 = 0;
    Integer Value2 = 0;
    String sign = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextBox = findViewById(R.id.MainTextBox);
        btnOne = findViewById(R.id.one);
        btnTwo = findViewById(R.id.two);
        btnThree = findViewById(R.id.three);
        btnFour = findViewById(R.id.four);
        btnFive = findViewById(R.id.five);
        btnSix = findViewById(R.id.six);
        btnSeven = findViewById(R.id.seven);
        btnEight = findViewById(R.id.eight);
        btnNine = findViewById(R.id.nine);
        btnZero = findViewById(R.id.zero);
        btnAdd = findViewById(R.id.Add);
        btnAns = findViewById(R.id.Ans);
        btnMinus = findViewById(R.id.Minus);
        btnMultiply = findViewById(R.id.Multiply);
        btnDivide = findViewById(R.id.Divide);
        btnClear = findViewById(R.id.Clear);
        btnAllClear = findViewById(R.id.AllClear);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 text += btnOne.getText().toString();
                TextBox.setText(text);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnTwo.getText().toString();
                TextBox.setText(text);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnThree.getText().toString();
                TextBox.setText(text);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnFour.getText().toString();
                TextBox.setText(text);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnFive.getText().toString();
                TextBox.setText(text);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnSix.getText().toString();
                TextBox.setText(text);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnSeven.getText().toString();
                TextBox.setText(text);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnEight.getText().toString();
                TextBox.setText(text);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnNine.getText().toString();
                TextBox.setText(text);
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += btnZero.getText().toString();
                TextBox.setText(text);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "+";
                Value1 = Integer.parseInt(text);
                text = "";
                TextBox.setText("0");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "-";
                Value1 = Integer.parseInt(text);
                text = "";
                TextBox.setText("0");
            }

        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "*";
                Value1 = Integer.parseInt(text);
                text = "";
                TextBox.setText("0");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "/";
                Value1 = Integer.parseInt(text);
                text = "";
                TextBox.setText("0");
            }
        });

        btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (sign)
                {
                    case "+":
                        Value2 = Integer.parseInt(text);
                        text = String.valueOf(Value1 + Value2);
                        TextBox.setText(text);
                        break;

                    case "-":
                        Value2 = Integer.parseInt(text);
                        text = String.valueOf(Value1 - Value2);
                        TextBox.setText(text);
                        break;
                    case "*":
                        Value2 = Integer.parseInt(text);
                        text = String.valueOf(Value1 * Value2);
                        TextBox.setText(text);
                        break;
                    case "/":
                        Value2 = Integer.parseInt(text);
                        text = String.valueOf(Value1 / Value2);
                        TextBox.setText(text);
                        break;

                    default:
                            Toast.makeText(MainActivity.this,"Select Function !" ,Toast.LENGTH_LONG).show();
                            TextBox.setText("0");
                            break;
                }


            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = "";
                TextBox.setText("0");
            }
        });
        btnAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = "";
                TextBox.setText("");
                Value1 = 0;
                Value2 = 0;
                sign = "";
                Toast.makeText(MainActivity.this,"All Cleared",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
