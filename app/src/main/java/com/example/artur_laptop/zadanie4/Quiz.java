package com.example.artur_laptop.zadanie4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.artur_laptop.zadanie4.R.layout.quiz;

/**
 * Created by Artur-laptop on 2017-04-05.
 */

public class Quiz extends AppCompatActivity{

    /*
    protected int oblicz()
    {

        if()
    }

    */

    String wyjscie;
    int wynik = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(quiz);
        //Button summit = (Button) findViewById(R.id.summit);

        final RadioGroup r1 = (RadioGroup) findViewById(R.id.r1);
        final RadioGroup r2 = (RadioGroup) findViewById(R.id.r2);
        final RadioGroup r3 = (RadioGroup) findViewById(R.id.r3);
        final RadioGroup r4 = (RadioGroup) findViewById(R.id.r4);
        final RadioGroup r5 = (RadioGroup) findViewById(R.id.r5);

        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.r1t){
                    wynik++;
                wyjscie = "Gratualcje! Poprawna odpowiedz! Obecny wynik: " + wynik;
            }
                else
            wyjscie = "Błędna odpowiedź! Obecny wynik: " + wynik;
                Toast.makeText(getApplicationContext(),wyjscie, Toast.LENGTH_LONG).show();
                //if (checkedId == R.id.r1t || checkedId == R.id.r1f)
                    for(int i = 0; i < group.getChildCount(); i++)
                    {
                        (r1.getChildAt(i)).setEnabled(false);
                    }
            }
        });

        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.r2t) {
                    wynik++;
                    wyjscie = "Gratualcje! Poprawna odpowiedz! Obecny wynik: " + wynik;
                }
                else
                    wyjscie = "Błędna odpowiedź! Obecny wynik: " + wynik;
                Toast.makeText(getApplicationContext(),wyjscie, Toast.LENGTH_LONG).show();
                //if (checkedId == R.id.r2t || checkedId == R.id.r2f)
                    for(int i = 0; i < group.getChildCount(); i++)
                    {
                        (r2.getChildAt(i)).setEnabled(false);
                    }
            }
        });

        r3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.r3t){
                    wynik++;
                wyjscie = "Gratualcje! Poprawna odpowiedz! Obecny wynik: " + wynik;
            }
                else
            wyjscie = "Błędna odpowiedź! Obecny wynik: " + wynik;
                Toast.makeText(getApplicationContext(),wyjscie, Toast.LENGTH_LONG).show();
                //if (checkedId == R.id.r3t || checkedId == R.id.r3f)
                    for(int i = 0; i < group.getChildCount(); i++)
                    {
                        (r3.getChildAt(i)).setEnabled(false);
                    }
            }
        });

        r4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.r4t){
                    wynik++;
                wyjscie = "Gratualcje! Poprawna odpowiedz! Obecny wynik: " + wynik;
            }
                else
            wyjscie = "Błędna odpowiedź! Obecny wynik: " + wynik;
                Toast.makeText(getApplicationContext(),wyjscie, Toast.LENGTH_LONG).show();
                //if (checkedId == R.id.r4t || checkedId == R.id.r4f)
                    for(int i = 0; i < group.getChildCount(); i++)
                    {
                        (r4.getChildAt(i)).setEnabled(false);
                    }
            }
        });

        r5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (checkedId == R.id.r5t){
                    wynik++;
                wyjscie = "Gratualcje! Poprawna odpowiedz! Obecny wynik: " + wynik;
            }
                else
            wyjscie = "Błędna odpowiedź! Obecny wynik: " + wynik;
                Toast.makeText(getApplicationContext(),wyjscie, Toast.LENGTH_LONG).show();
                //if (checkedId == R.id.r5t || checkedId == R.id.r5f)
                    for(int i = 0; i < group.getChildCount(); i++)
                    {
                        (r5.getChildAt(i)).setEnabled(false);
                    }
                wyjscie = "KONIEC GRY! WYNIK: " + wynik + "pkt";
                Toast.makeText(getApplicationContext(),wyjscie,Toast.LENGTH_LONG).show();
            }
        });
    }

}
