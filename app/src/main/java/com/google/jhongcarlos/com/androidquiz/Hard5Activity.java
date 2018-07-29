package com.google.jhongcarlos.com.androidquiz;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Hard5Activity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button next;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard5);

        radioGroup = (RadioGroup) findViewById(R.id.choices);
        next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                if (radioButton.getText().equals("Dangerous Permissions")) {
                    Score.Addscore();
                    Hard_score.Addscore();
                }
                Intent i = new Intent(Hard5Activity.this, HardResultActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
