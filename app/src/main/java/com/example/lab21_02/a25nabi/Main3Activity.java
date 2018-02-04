package com.example.lab21_02.a25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void kembali_ke_activity_2(View view) {
        Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void pindah_ke_activity_4(View view) {
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        startActivity(intent);
    }

    public void kembali_ke_activity(View view) {
        Intent intent = new Intent(Main3Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
