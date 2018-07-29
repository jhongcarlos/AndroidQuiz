package com.google.jhongcarlos.com.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class AllScore extends AppCompatActivity {

    TextView result;
    View viewLayout;
    Button home,med;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_score);

        result = (TextView) findViewById(R.id.textView6);
        result.setText(String.valueOf(Score.score));
        home = (Button) findViewById(R.id.next);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Easy_score.score = 0;
                Medium_score.score = 0;
                Hard_score.score = 0;
                Intent i = new Intent(AllScore.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
