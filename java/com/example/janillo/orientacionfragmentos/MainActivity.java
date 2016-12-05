package com.example.janillo.orientacionfragmentos;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();

        if (d.getRotation() == Surface.ROTATION_90){
            Fhorizontal fragment1 = new Fhorizontal();
            fragmentTransaction.replace(android.R.id.content, fragment1)
                    .commit();
        }else {
            Fvertical fragment2 = new Fvertical();
            fragmentTransaction.replace(android.R.id.content, fragment2)
                    .commit();
        }

    }
}
