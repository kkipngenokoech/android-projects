package com.example.gradingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView simpleTextView = (TextView) findViewById(R.id.textView5);

        Button changeText = (Button) findViewById(R.id.button);
        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleTextView.setText("multiverse generations");
                simpleTextView.setTextColor(Color.RED);
                Toast.makeText(getApplicationContext(),"hey multiverse", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void calculateGrade(View view){
        EditText multiverse_001 = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText multiverse_practicals = (EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText multiverse_alien_awareness = (EditText) findViewById(R.id.editTextNumberDecimal3);

        int verse_001 = Integer.parseInt(multiverse_001.getText().toString());
        int verse_practicals = Integer.parseInt(multiverse_practicals.getText().toString());
        int verse_alien_awareness = Integer.parseInt(multiverse_alien_awareness.getText().toString());

        int total = verse_001 + verse_alien_awareness + verse_practicals;
        int average = total / 3;
        String grade = grade(average);

        Intent  intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("average", average);
        intent.putExtra("grade", grade);
        startActivity(intent);
    }

    public String grade(int average){
        String grade;
        grade = average > 50 ? "Pass" : "fail";
        return grade;
    }

    public void setAttribute(View view){
        TextView textView = (TextView) findViewById(R.id.textView5);
        textView.setText("I have been assigned to this textview");
        textView.setTextColor(Color.red(4));
    }
}