package com.nurhamidan.tugas2monitoriapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {

    public static final String FROM = "com.nurhamidan.tugas2monitoriapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void showSayHiActivity(View v) {
        EditText edtNamaPanggilan = (EditText) findViewById(R.id.edt_biodata_nama_panggilan);
        String namaPanggilan = edtNamaPanggilan.getText().toString();

        Intent intent = new Intent(this, SayHaiActivity.class);
        intent.putExtra(FROM, namaPanggilan);
        startActivity(intent);
    }
}