package ru.synergy.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ToInfActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_inf);

        tv = (TextView) findViewById(R.id.tv);
        String str = getIntent().getStringExtra("et");
        tv.setText(str);
    }
}