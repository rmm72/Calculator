package com.example.rmmateo_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isOpPressed = false;
    private double firstNum = 0;
    private int secNumIndex = 0;
    private char currentOp;
    private int resultField = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);
        final Button num1 = findViewById(R.id.num1);
        final Button num2 = findViewById(R.id.num2);
        final Button num3 = findViewById(R.id.num3);
        final Button num4 = findViewById(R.id.num4);
        final Button num5 = findViewById(R.id.num5);
        final Button num6 = findViewById(R.id.num6);
        final Button num7 = findViewById(R.id.num7);
        final Button num8 = findViewById(R.id.num8);
        final Button num9 = findViewById(R.id.num9);
        final Button num0 = findViewById(R.id.num0);
        final Button multiply = findViewById(R.id.multiply);
        final Button divide = findViewById(R.id.divide);
        final Button minus = findViewById(R.id.minus);
        final Button plus = findViewById(R.id.plus);
        final Button equal = findViewById(R.id.equal);

        final View.OnClickListener calculatorListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final int id = v.getId();
                switch (id){
                    case R.id.num0:
                        if(resultField == 0){
                            calculatorScreen.setText("0");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("0");
                        }
                        break;
                    case R.id.num1:
//                        String displayedElements = calculatorScreen.getText().toString();
//                        int lengt = displayedElements.length();
//                        if(lengt == 1 && displayedElements == "0"){
//                            calculatorScreen.setText("");
//                        }
                        if(resultField == 0){
                            calculatorScreen.setText("1");
                            resultField = 1;
                        }else if (resultField > 0){
                            calculatorScreen.append("1");
                        }
                        //calculatorScreen.append("1");
                        break;
                    case R.id.num2:
                        if(resultField == 0){
                            calculatorScreen.setText("2");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("2");
                        }
                        break;
                    case R.id.num3:
                        if(resultField == 0){
                            calculatorScreen.setText("3");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("3");
                        }
                        break;
                    case R.id.num4:
                        if(resultField == 0){
                            calculatorScreen.setText("4");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("4");
                        }
                        break;
                    case R.id.num5:
                        if(resultField == 0){
                            calculatorScreen.setText("5");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("5");
                        }
                        break;
                    case R.id.num6:
                        if(resultField == 0){
                            calculatorScreen.setText("6");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("6");
                        }
                        break;
                    case R.id.num7:
                        if(resultField == 0){
                            calculatorScreen.setText("7");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("7");
                        }
                        break;
                    case R.id.num8:
                        if(resultField == 0){
                            calculatorScreen.setText("8");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("8");
                        }
                        break;
                    case R.id.num9:
                        if(resultField == 0){
                            calculatorScreen.setText("9");
                            resultField = 1;
                        }else if (resultField > 0) {
                            calculatorScreen.append("9");
                        }
                        break;
                    case R.id.divide:
                        String currentNumDiv = calculatorScreen.getText().toString();
                        secNumIndex = currentNumDiv.length() + 1;
                        firstNum = Double.parseDouble(currentNumDiv);
                        calculatorScreen.append("÷");
                        isOpPressed = true;
                        currentOp = '÷';
                        break;
                    case R.id.multiply:
                        String currentNumMult = calculatorScreen.getText().toString();
                        secNumIndex = currentNumMult.length() + 1;
                        firstNum = Double.parseDouble(currentNumMult);
                        calculatorScreen.append("×");
                        isOpPressed = true;
                        currentOp = '×';
                        break;
                    case R.id.minus:
                        String currentNumMin = calculatorScreen.getText().toString();
                        secNumIndex = currentNumMin.length() + 1;
                        firstNum = Double.parseDouble(currentNumMin);
                        calculatorScreen.append("-");
                        isOpPressed = true;
                        currentOp = '-';
                        break;
                    case R.id.plus:
                        String currentNumAdd = calculatorScreen.getText().toString();
                        secNumIndex = currentNumAdd.length() + 1;
                        firstNum = Double.parseDouble(currentNumAdd);
                        calculatorScreen.append("+");
                        isOpPressed = true;
                        currentOp = '+';
                        break;
                    case R.id.equal:
                        if(isOpPressed){
                            if(currentOp == '+'){
                                String currentNumb = calculatorScreen.getText().toString();
                                double secondNum = Double.parseDouble(currentNumb.substring(secNumIndex,currentNumb.length()));
                                secondNum += firstNum;
                                calculatorScreen.setText(String.valueOf(secondNum));
                                resultField = 0;
                            }
                            else if(currentOp == '-'){
                                String currentNumb = calculatorScreen.getText().toString();
                                double secondNum = Double.parseDouble(currentNumb.substring(secNumIndex,currentNumb.length()));
                                secondNum -= firstNum;
                                calculatorScreen.setText(String.valueOf(secondNum));
                                resultField = 0;
                            }else if(currentOp == '×'){
                                String currentNumb = calculatorScreen.getText().toString();
                                double secondNum = Double.parseDouble(currentNumb.substring(secNumIndex,currentNumb.length()));
                                secondNum *= firstNum;
                                resultField = 0;
                                calculatorScreen.setText(String.valueOf(secondNum));
                            }else if(currentOp == '÷'){
                                String currentNumb = calculatorScreen.getText().toString();
                                double secondNum = Double.parseDouble(currentNumb.substring(secNumIndex,currentNumb.length()));
                                secondNum /= firstNum;
                                calculatorScreen.setText(String.valueOf(secondNum));
                                resultField = 0;
                            }
                        }
                        break;
                }
            }
        };
        num1.setOnClickListener(calculatorListener);
        num2.setOnClickListener(calculatorListener);
        num3.setOnClickListener(calculatorListener);
        num4.setOnClickListener(calculatorListener);
        num5.setOnClickListener(calculatorListener);
        num6.setOnClickListener(calculatorListener);
        num7.setOnClickListener(calculatorListener);
        num8.setOnClickListener(calculatorListener);
        num9.setOnClickListener(calculatorListener);
        num0.setOnClickListener(calculatorListener);
        divide.setOnClickListener(calculatorListener);
        multiply.setOnClickListener(calculatorListener);
        plus.setOnClickListener(calculatorListener);
        minus.setOnClickListener(calculatorListener);
        equal.setOnClickListener(calculatorListener);

        final Button delete = findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String displayedElements = calculatorScreen.getText().toString();
                int leng = displayedElements.length();
                if(leng > 0){
                    displayedElements = displayedElements.substring(0,leng-1);
                    calculatorScreen.setText(displayedElements);
                }
            }
        });

        final Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calculatorScreen.setText("0");
                resultField = 0;
            }
        });
    }
}
