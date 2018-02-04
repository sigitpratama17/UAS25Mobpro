package com.example.lab21_02.a25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void kembali_ke_activity_3(View view) {
        Intent intent = new Intent(Main4Activity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void pindah_ke_activity_5(View view) {
        Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
        startActivity(intent);
    }

    public void kembali_ke_activity(View view) {
        Intent intent = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
