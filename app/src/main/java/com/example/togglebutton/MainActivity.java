    package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ToggleButton;

    public class MainActivity extends AppCompatActivity {

    ImageView iv;
    ToggleButton tg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        /*
        ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            imageView.setColorFilter(getResources().getColor(R.color.Red));
        } else {
            imageView.setColorFilter(null);
        }
    }
});
         */



    }
}