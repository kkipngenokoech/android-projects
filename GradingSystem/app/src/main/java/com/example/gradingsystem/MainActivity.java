package com.example.gradingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}