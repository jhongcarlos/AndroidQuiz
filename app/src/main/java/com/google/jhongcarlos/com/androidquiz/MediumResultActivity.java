package com.google.jhongcarlos.com.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MediumResultActivity extends AppCompatActivity {

    TextView result;
    Button home,med;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_result);

        result = (TextView) findViewById(R.id.textView6);
        result.setText(String.valueOf(Medium_score.score));
        home = (Button) findViewById(R.id.next);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediumResultActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        med = (Button) findViewById(R.id.med);
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediumResultActivity.this, HardActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
