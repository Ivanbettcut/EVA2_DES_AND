package com.example.eva2_3_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent inSMS;
    EditText editText;
    EditText editText2;
    Button btnEnvSMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnvSMS = findViewById(R.id.btnEnvSMS);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        btnEnvSMS.setOnClickListener(
            new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sTel = "smsto:" + editText.getText().toString();
                String sSMS = editText2.getText().toString();
                inSMS = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
                inSMS.putExtra("sms_body", "El mensaje es este");
                startActivity(inSMS);
            }
        }
        );
    }




}
