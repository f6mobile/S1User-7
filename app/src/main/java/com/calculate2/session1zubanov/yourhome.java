package com.calculate2.session1zubanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class yourhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourhome);
        Button knopadd = (Button) findViewById(R.id.knopadd);
        knopadd.setOnClickListener((View.OnClickListener) this);
    }

    public void registration(View view) {

    }
    public void onClick(View view) {
        Intent i = new Intent(this, kitchen.class);
        startActivity(i);
    }
}