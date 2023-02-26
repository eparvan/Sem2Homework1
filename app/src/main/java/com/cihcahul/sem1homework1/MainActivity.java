package com.cihcahul.sem1homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTriangle = (Button) findViewById(R.id.btnTriangle);
        btnTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TriangleActivity.class);
                startActivity(intent);
            }
        });

        Button btnCircle = (Button) findViewById(R.id.btnCircle);

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CircleActivity.class);
                startActivity(intent);
            }
        });

        Button btnRectangle = (Button) findViewById(R.id.btnRectangle);

        btnRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RectangleActivity.class);
                startActivity(intent);
            }
        });


    }
}