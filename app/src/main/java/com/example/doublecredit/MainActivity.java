package com.example.doublecredit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         double s = 1000; double p = 5; double d = s; int r = 0; int y = 0; int m = 0;
         while (d<=2000) {
             d = (d*p/1200)+d;
             r = r + 1;
         }
         y = r / 12; m = r % 12;
        Log.d("MyLog", "The amount will become" + String.valueOf(d));
        Log.d("MyLog", "trough " + String.valueOf(y));
        Log.d("MyLog", "years and " + String.valueOf(m));
        Log.d("MyLog", "months");
    }
}