package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add (View v){
        EditText t1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText t2 = (EditText) findViewById(R.id.editTextNumberDecimal2);

        int n = Integer.parseInt(t1.getText().toString());
        int n1 = Integer.parseInt(t2.getText().toString());

        int answer = n + n1;

        TextView results = (TextView) findViewById(R.id.editTextNumberDecimal5);
//        results.setText("The sum is: "+answer);
        results.setText(Integer.toString(answer));
    }
}