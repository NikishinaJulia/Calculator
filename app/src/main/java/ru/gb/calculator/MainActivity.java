package ru.gb.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultWindow;

    private Button mc;
    private Button mAddition;
    private Button mDeletion;
    private Button mr;
    private Button clean;
    private Button signReplacement;
    private Button division;
    private Button multiplication;
    private Button number1;
    private Button number2;
    private Button number3;
    private Button number4;
    private Button number5;
    private Button number6;
    private Button number7;
    private Button number8;
    private Button number9;
    private Button number0;
    private Button subtract;
    private Button addition;
    private Button result;
    private Button decimalSeparator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number0 = findViewById(R.id.button_0);
        number1 = findViewById(R.id.button_1);
        number2 = findViewById(R.id.button_2);
        number3 = findViewById(R.id.button_3);
        number4 = findViewById(R.id.button_4);
        number5 = findViewById(R.id.button_5);
        number6 = findViewById(R.id.button_6);
        number7 = findViewById(R.id.button_7);
        number8 = findViewById(R.id.button_8);
        number9 = findViewById(R.id.button_9);
        mc = findViewById(R.id.mc_button);
        mr = findViewById(R.id.mr_button);
        mAddition = findViewById(R.id.m_add_button);
        mDeletion = findViewById(R.id.mc_deletion_button);
        clean = findViewById(R.id.clean_button);
        signReplacement = findViewById(R.id.sign_replacement_button);
        division = findViewById(R.id.division_button);
        multiplication = findViewById(R.id.multiplication_button);
        subtract = findViewById(R.id.subtract_button);
        addition = findViewById(R.id.addition_button);
        result = findViewById(R.id.result_button);
        decimalSeparator = findViewById(R.id.decimal_separator_button);

        resultWindow = findViewById(R.id.result_window);

        number0.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("0");
        });

        number1.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("1");
        });

        number2.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("2");
        });

        number3.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("3");
        });

        number4.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("4");
        });

        number5.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("5");
        });

        number6.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("6");
        });

        number7.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("7");
        });

        number8.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("8");
        });

        number9.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("9");
        });

        decimalSeparator.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append(",");
        });

        addition.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("+");
        });

        multiplication.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("*");
        });

        division.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("/");
        });

        subtract.setOnClickListener(v -> {
            resultWindow = (TextView) findViewById(R.id.result_window);
            resultWindow.append("-");
        });


    }


}