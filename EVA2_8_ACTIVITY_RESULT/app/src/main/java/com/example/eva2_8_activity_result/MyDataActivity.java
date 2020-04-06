package com.example.eva2_8_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyDataActivity extends AppCompatActivity implements ListView.OnItemClickListener, View.OnClickListener {
    ListView listRest;

    String[] resDatos = {
      "Bombay",
      "Pancake Paradise",
      "HolaManolo",
      "Tomato Salads",
      "No se",
      "dxdxdXDXDx"
    };

    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data);
        listRest = findViewById(R.id.listRest);
        listRest.setOnItemClickListener(this);
        listRest.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, resDatos));
        listRest.setOnItemClickListener(this);
        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent inDatos = new Intent();
        inDatos.putExtra("aaaa", resDatos[position]);
        setResult(Activity.RESULT_OK,inDatos);
        finish();

    }

    @Override
    public void onClick(View v) {
        setResult(Activity.RESULT_OK);
        finish();
    }
}
