package com.gd.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        SecondFragment fragment = new SecondFragment();
        transaction.replace(R.id.sample_fragment, fragment);
        transaction.commit();
    }
}