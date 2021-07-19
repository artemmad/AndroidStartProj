package ru.synergy.androidstartproj;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Output;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComeBackActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText et;
    private Button push;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_come_back);

        et = (EditText) findViewById(R.id.editText);
        push = (Button) findViewById(R.id.push);

        push.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        String string = et.getText().toString();
        intent.putExtra("tv", string);
        setResult(RESULT_OK, intent);
        finish();
    }
}