package com.calculate2.session1zubanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enter1 = (Button) findViewById(R.id.enter1);
        enter1.setOnClickListener(this);
        Button resident1 = (Button) findViewById(R.id.resident1);
        resident1.setOnClickListener(this::registration);


    }

    public void registration(View view) {

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, addroom.class);
        startActivity(i);


        }


    }

