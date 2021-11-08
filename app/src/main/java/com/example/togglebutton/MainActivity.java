    package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

    public class MainActivity extends AppCompatActivity {

        public final void setColorFilter (int color, PorterDuff.Mode mode)

        ImageView iv;
        ToggleButton tg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton)
                toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            iv.setColorFilter(getResources().getColor(R.color.black));
                        }else{
                            iv.setColorFilter(null);
                        }
                    }
                });
        


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