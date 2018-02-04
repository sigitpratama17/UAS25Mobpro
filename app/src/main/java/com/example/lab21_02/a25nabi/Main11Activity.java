package com.example.lab21_02.a25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

    }

    public void kembali_ke_activity_10(View view) {
        Intent intent = new Intent(Main11Activity.this, Main10Activity.class);
        startActivity(intent);
    }

    public void kembali_ke_activity(View view) {
        Intent intent = new Intent(Main11Activity.this, MainActivity.class);
        startActivity(intent);
    }
}