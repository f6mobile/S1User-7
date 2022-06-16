package com.calculate2.session1zubanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class prof extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof);
    }

    public void signout(View view) {
        Intent intent;
        intent = new Intent(this, addroom.class);
        startActivity(intent);
    }

    public void saveback(View view) {
        Intent intent;
        intent = new Intent(this, addroom.class);
        startActivity(intent);
    }
}