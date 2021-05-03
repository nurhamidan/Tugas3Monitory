package com.nurhamidan.tugas2monitoriapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
    }

    public void showBiodataActivity(View v) {
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);
    }
}