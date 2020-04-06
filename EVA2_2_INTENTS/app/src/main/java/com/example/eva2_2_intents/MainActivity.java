package com.example.eva2_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent inTelefono;
    EditText editTextTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTel = findViewById(R.id.editTextTel);
    }
    public void onClick(View v){
        String cade = "tel:" + editTextTel.getText().toString();
                            //ACCION, DATOS
        if(v.getId()==R.id.btnDial) {
            inTelefono = new Intent(Intent.ACTION_DIAL, Uri.parse(cade));
        }else {
            inTelefono = new Intent(Intent.ACTION_CALL,Uri.parse(cade));
        }
        startActivity(inTelefono);
    }
}
