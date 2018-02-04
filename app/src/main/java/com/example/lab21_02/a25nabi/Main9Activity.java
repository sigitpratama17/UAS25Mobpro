package com.example.lab21_02.a25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void kembali_ke_activity_8(View view) {
        Intent intent = new Intent(Main9Activity.this, Main8Activity.class);
        startActivity(intent);
    }

    public void pindah_ke_activity_10(View view) {
        Intent intent = new Intent(Main9Activity.this, Main10Activity.class);
        startActivity(intent);
    }

    public void kembali_ke_activity(View view) {
        Intent intent = new Intent(Main9Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
