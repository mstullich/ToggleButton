    package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

    public class MainActivity extends AppCompatActivity {

        ImageView iv;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            ToggleButton Tb1 = (ToggleButton) findViewById(R.id.Tb1);
            ToggleButton Tb2 = (ToggleButton) findViewById(R.id.Tb2);
            ToggleButton Tb3 = (ToggleButton) findViewById(R.id.Tb3);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);


            Tb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Tb1.isChecked()) {
                        imageView.setColorFilter(Color.parseColor("#81F10606"));
                    } else {
                        imageView.setColorFilter(null);
                    }
                }
            });
            Tb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Tb2.isChecked()) {
                        imageView.setColorFilter(Color.parseColor("#8103A9F4"));
                    } else {
                        imageView.setColorFilter(null);
                    }
                }
            });

            Tb3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Tb3.isChecked()) {
                        imageView.setColorFilter(Color.parseColor("#9C4CAF50"));
                    } else {
                        imageView.setColorFilter(null);
                    }
                }
            });








        }
    }