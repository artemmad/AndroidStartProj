package ru.synergy.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        TextView textView = new TextView(this);
        textView.setText("Hello Android!");
        textView.setTextSize(22);

        setContentView(textView);
    }
}