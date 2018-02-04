package com.example.lab21_02.a25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    public void kembali_ke_activity_6(View view) {
        Intent intent = new Intent(Main7Activity.this, Main6Activity.class);
        startActivity(intent);
    }

    public void pindah_ke_activity_8(View view) {
        Intent intent = new Intent(Main7Activity.this, Main8Activity.class);
        startActivity(intent);
    }

    public void kembali_ke_activity(View view) {
        Intent intent = new Intent(Main7Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
