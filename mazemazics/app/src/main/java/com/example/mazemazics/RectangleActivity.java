package com.example.mazemazics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RectangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

    }

    public void onClickCalculateArea(View view){
        EditText length = findViewById(R.id.editTextLength);
        EditText width = findViewById(R.id.editTextWidth);

        int Length = Integer.parseInt(length.getText().toString());
        int Width = Integer.parseInt(width.getText().toString());

        int Area = Length * Width;
        TextView Result = findViewById(R.id.textResult);
        Result.setText(Integer.toString(Area));
    }
}