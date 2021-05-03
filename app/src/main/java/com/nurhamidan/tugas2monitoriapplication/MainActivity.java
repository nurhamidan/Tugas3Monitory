package com.nurhamidan.tugas2monitoriapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
    NIM : 10118017
    Nama : Agung Nurhamidan
    Kelas : IF-1
    Tanggal Pengerjaan : 3 Mei 2021
    Deskripsi Pekerjaan : Untuk memenuhi tugas 3 membuat aplikasi Monitory
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getIntent().getBooleanExtra(SayHaiActivity.FROM, false)) {
            finish();
        }
    }

    public void showLoginCodeActivity(View v) {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}