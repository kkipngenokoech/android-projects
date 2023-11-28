package com.example.mazemazics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CuboidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
    }
    public void onClickCalculateVolume(View view){
        EditText length = findViewById(R.id.editTextLength);
        EditText width = findViewById(R.id.editTextWidth);
        EditText height = findViewById(R.id.editTextHeight);

        int Length = Integer.parseInt(length.getText().toString());
        int Width = Integer.parseInt(width.getText().toString());
        int Height = Integer.parseInt(height.getText().toString());

        int Volume = Length * Width * Height;
        TextView Result = findViewById(R.id.textResult);
        Result.setText(Integer.toString(Volume));
    }
}