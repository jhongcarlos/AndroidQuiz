package com.google.jhongcarlos.com.androidquiz;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HardResultActivity extends AppCompatActivity {

    TextView result;
    Button home,med;
    String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_result);
        res = String.valueOf(Score.score);

        result = (TextView) findViewById(R.id.textView6);
        result.setText(String.valueOf(Hard_score.score));
        home = (Button) findViewById(R.id.next);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked();
                Intent i = new Intent(HardResultActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        med = (Button) findViewById(R.id.med);
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked();
                Intent i = new Intent(HardResultActivity.this, AllScore.class);
                startActivity(i);
                finish();
            }
        });
    }
    public void clicked(){
        NotificationCompat.Builder mbuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.logo)
                .setContentTitle("You scored "+res)
                .setContentText("Thank you for taking the Android Test!");
        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0,mbuilder.build());
    }
}
