package com.example.gradingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        int average = getIntent().getIntExtra("average", 0);
        String grade = getIntent().getStringExtra("grade");

        TextView gradeView = (TextView) findViewById(R.id.textView2);
        gradeView.setText("Average: "+average+" Grade: "+grade);
    }
}