package com.calculate2.session1zubanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class light extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
    }

    public void backlight1(View view) {
        Intent intent;
        intent = new Intent(this, kitchen.class);
        startActivity(intent);
    }

    public void thermostat(View view) {
        Intent intent;
        intent = new Intent(this, ternostat.class);
        startActivity(intent);
    }
}