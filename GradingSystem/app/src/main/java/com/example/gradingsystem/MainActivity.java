package com.example.gradingsystem;

import androidx.appcompat.app.AppCompatActivity;

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
        char grade = grade(average);


    }

    public char grade(int average){
        char grade;
        switch (average) {
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                grade = 'A';
                break;
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                grade = 'B';
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                grade = 'C';
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        return grade;
    }
}