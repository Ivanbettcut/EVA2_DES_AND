package com.example.eva2_8_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, btnContactos;
    Intent inSelRest, inSelCont;
    String misContactos = "content://contacts/people/";
    final int RESTAURANTE = 1000;
    final int CONTACTOS = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        inSelRest = new Intent(this,MyDataActivity.class);
        inSelCont = new Intent();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent inSelCont = new Intent(Intent.ACTION_VIEW, Uri.parse(misContactos));
            startActivity(inSelCont);
            startActivity(inSelRest);
            }
        });
    }
    public void onClick(View v){
        startActivityForResult(inSelRest, RESTAURANTE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case RESTAURANTE:  // que actividad devolvio datos
                if(resultCode == Activity.RESULT_OK){
                    data.getStringExtra("aaaa");
                    Toast.makeText(this,data.getStringExtra("aaaa"),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"CANCELADO POR EL USUARIO",Toast.LENGTH_SHORT).show();
                }
            case CONTACTOS:
                if (resultCode == Activity.RESULT_OK){
                    String sCont = data.getDataString();
                    Toast.makeText(this,sCont,Toast.LENGTH_SHORT);
                }
        }
    }
}
