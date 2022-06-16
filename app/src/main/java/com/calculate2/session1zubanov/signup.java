package com.calculate2.session1zubanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button enter2 = (Button)findViewById(R.id.enter2);
        enter2.setOnClickListener((View.OnClickListener) this);

    }





    public void enter2(View view) {

    }

    }
