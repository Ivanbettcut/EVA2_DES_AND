package com.example.eva2_5_contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent contacts;
    String misContactos = "content://contacts/people/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        Intent contacts = new Intent(Intent.ACTION_VIEW, Uri.parse(misContactos));
        startActivity(contacts);
    }
}
