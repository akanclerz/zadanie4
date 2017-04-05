package com.example.artur_laptop.zadanie4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_start = (Button) findViewById(R.id.button_start);


        button_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context,Quiz.class);
                startActivity(intent);

            }
        });
    }
}
