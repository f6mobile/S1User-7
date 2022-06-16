package com.calculate2.session1zubanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kitchen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);


    }

    public void light22(View view) {
        Intent intent;
        intent = new Intent(this, light.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent;
        intent = new Intent(this, prof.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent;
        intent = new Intent(this, addroom.class);
        startActivity(intent);
    }
}