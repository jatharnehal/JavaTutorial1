package com.example.akshay.javatutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        Thread t1=new Thread()
        {
          public  void run()
          {
              try
              {
                  sleep(2000);
                  Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                  startActivity(intent);
                  finish();
              }
              catch (Exception e)
              {
                  e.getStackTrace();
              }
          }
        };
        t1.start();
    }
}
