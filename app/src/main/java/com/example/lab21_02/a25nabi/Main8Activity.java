package com.example.lab21_02.a25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    public void kembali_ke_activity_7(View view) {
        Intent intent = new Intent(Main8Activity.this, Main7Activity.class);
        startActivity(intent);
    }


    public void kembali_ke_activity(View view) {
        Intent intent = new Intent(Main8Activity.this, MainActivity.class);
        startActivity(intent);
    }

    public void pindah_ke_activity_9(View view) {
        Intent intent = new Intent(Main8Activity.this, Main9Activity.class);
        startActivity(intent);
    }
}