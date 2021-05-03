package com.nurhamidan.tugas2monitoriapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SayHaiActivity extends AppCompatActivity {

    public static final String FROM = "com.nurhamidan.tugas2monitoriapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);
        TextView txtNamaPanggilan = (TextView) findViewById(R.id.hai);
        Intent intent = getIntent();
        String namaPanggilan = intent.getStringExtra(BiodataActivity.FROM);
        txtNamaPanggilan.setText("Beres! Sekarang " + namaPanggilan + " udah bisa ngecek penggunaan HP " + namaPanggilan + " tiap hari buat bantu " + namaPanggilan + " ngatur waktu :)");
    }

    public void keluarAplikasi(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra(FROM, true);
        startActivity(intent);
    }
}