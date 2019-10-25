package com.example.androidsimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float num1, num2;
    Float Sum, Multiple, Average;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnSum = (Button) findViewById(R.id.btn_Sum);
        final Button btnMultiple = (Button) findViewById(R.id.btn_Multipe);
        final Button btnAverage = (Button) findViewById(R.id.btn_Average);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sum();

            }
        });
        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiple();
            }
        });
        btnAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Average();
            }
        });
    }

    public void Sum() {
        final TextView tv_result = (TextView) findViewById(R.id.result);
        final EditText edit_text_num1 = (EditText) findViewById(R.id.edit_text_num1);
        final EditText edit_text_num2 = (EditText) findViewById(R.id.edit_text_num2);

        num1 = Integer.parseInt(edit_text_num1.getText().toString());
        num2 = Integer.parseInt(edit_text_num2.getText().toString());
        Sum = num1 + num2;
        tv_result.setText("" + Sum);
    }

    public void Multiple() {
        final TextView tv_result = (TextView) findViewById(R.id.result);
        final EditText edit_text_num1 = (EditText) findViewById(R.id.edit_text_num1);
        final EditText edit_text_num2 = (EditText) findViewById(R.id.edit_text_num2);

        num1 = Integer.parseInt(edit_text_num1.getText().toString());
        num2 = Integer.parseInt(edit_text_num2.getText().toString());

        Multiple = num1 * num2;
        tv_result.setText("" + Multiple);
    }

    public void Average() {
        final TextView tv_result = (TextView) findViewById(R.id.result);
        final EditText edit_text_num1 = (EditText) findViewById(R.id.edit_text_num1);
        final EditText edit_text_num2 = (EditText) findViewById(R.id.edit_text_num2);

        num1 = Integer.parseInt(edit_text_num1.getText().toString());
        num2 = Integer.parseInt(edit_text_num2.getText().toString());

        Average = (num1 + num2) / 2;
        tv_result.setText("" + Average);
    }
}
