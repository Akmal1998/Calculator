package com.example.akmalablaev.calculatorakmal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String Result = "";
    TextView ResultField;
    Double First;
    Double Second;
    int OperationID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ResultField = (TextView)findViewById(R.id.textView);
        First = 0.0;
        Second = 0.0;
        OperationID = 0;
    }

    public void onNumberButtonClick(View v) {
        Button btn = (Button) v;
        if (Result.equals("0"))
        {
            Result = "" + btn.getText();
        } else  {
                Result = Result + btn.getText();
                }
        ResultField.setText(Result);
    }

    public void clearField (View v)
    {
        Result = "0";
        ResultField.setText(Result);
    }

    public void divisionButton(View v)
    {
        if (OperationID != 0)
        {
            equally(v);
        }
        OperationID = 1;
        First = Double.valueOf(Result);
        Second = First;
        First = 0.0;
        Result = "";
    }

    public void multipButton(View v)
    {
        if (OperationID != 0)
        {
            equally(v);
        }
        OperationID = 2;
        First = Double.valueOf(Result);
        Second = First;
        First = 0.0;
        Result = "";
    }

    public void minusButton(View v)
    {
        if (OperationID != 0)
        {
            equally(v);
        }
        OperationID = 3;
        First = Double.valueOf(Result);
        Second = First;
        First = 0.0;
        Result = "";
    }

    public void plusButton(View v)
    {
        if (OperationID != 0)
        {
            equally(v);
        }
        OperationID = 4;
        First = Double.valueOf(Result);
        Second = First;
        First = 0.0;
        Result = "";
    }

    public void equally (View v)
    {
        Double Time;
        Time = 0.0;
        First = Double.valueOf(Result);

        switch (OperationID)
        {
            case 0:
                ResultField.setText(Result);
            break;

            case 1:
                Time = (Second/First);
                Result = Time.toString();
                if (Time % 1 == 0){
                    Result = Result.substring(0, Result.length()-2);
                }
                ResultField.setText(Result);
                First = 0.0;
                break;

            case 2:
                Time = (Second*First);
                Result = Time.toString();
                if (Time % 1 == 0){
                    Result = Result.substring(0, Result.length()-2);
                }
                ResultField.setText(Result);
                First = 0.0;
                break;

            case 3:
                Time = (Second-First);
                Result = Time.toString();
                if (Time % 1 == 0){
                    Result = Result.substring(0, Result.length()-2);
                }
                ResultField.setText(Result);
                First = 0.0;
                break;

            case 4:
                Time = (Second+First);
                Result = Time.toString();
                if (Time % 1 == 0){
                    Result = Result.substring(0, Result.length()-2);
                }
                ResultField.setText(Result);
                First = 0.0;
                break;

        }

    }
}


