package com.semeruk.daggerlesson2.activity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.semeruk.daggerlesson2.R;
import com.semeruk.daggerlesson2.app.DemoApplication;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DemoApplication) getApplication())
                .getComponent()
                .inject(this);

        sharedPreferences.edit()
                .putString("status", "success!")
                .apply();
    }
}