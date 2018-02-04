package com.example.lab21_02.a25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

    }

    public void kembali_ke_activity_9(View view) {
        Intent intent = new Intent(Main10Activity.this, Main9Activity.class);
        startActivity(intent);
    }

    public void pindah_ke_activity_11(View view) {
        Intent intent = new Intent(Main10Activity.this, Main11Activity.class);
        startActivity(intent);
    }

    public void kembali_ke_activity(View view) {
        Intent intent = new Intent(Main10Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
