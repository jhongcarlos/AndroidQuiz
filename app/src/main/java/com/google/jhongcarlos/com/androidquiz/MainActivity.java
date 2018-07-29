package com.google.jhongcarlos.com.androidquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static Button easy,medium,hard;
    View viewLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LayoutInflater layoutInflater = getLayoutInflater();
        viewLayout = layoutInflater.inflate(R.layout.credits, (ViewGroup)findViewById(R.id.custom_layout));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Toast:Gravitity.TOP",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(viewLayout);
                toast.show();
            }
        });
        easy = (Button) findViewById(R.id.easy);
        medium = (Button) findViewById(R.id.medium);
        hard = (Button) findViewById(R.id.hard);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EasyActivity.class);
                startActivity(i);
                Easy_score.reset();
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Easy_score.score!=0){
                    medium.setEnabled(true);
                    Intent i = new Intent(MainActivity.this, MediumActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this,"Please finish the Easy mode!",Toast.LENGTH_LONG).show();
                }
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Medium_score.score!=0){
                    hard.setEnabled(true);
                    Intent i = new Intent(MainActivity.this, HardActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this,"Please finish the Medium mode!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
