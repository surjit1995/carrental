package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etusername,etpassword,etcustomername;
    Button btnsignin,btncancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername=findViewById(R.id.username);
        etpassword=findViewById(R.id.password);
        etcustomername=findViewById(R.id.customername);

        btnsignin=findViewById(R.id.signin);
        btncancel=findViewById(R.id.cancel);

        btnsignin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.signin:
                if(!etusername.getText().toString().equals("") && !etpassword.getText().equals("") && !etcustomername.getText().equals("")) {
                    Intent act = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(act);

                    String customername = etcustomername.getText().toString();
                    act.putExtra("Name",customername);
                    startActivity(act);
                }
                else
                    Toast.makeText(getApplicationContext(),"Please fill All fields",Toast.LENGTH_SHORT).show();

                break;
            case R.id.cancel:

                Intent act1 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(act1);

                break;
        }

    }
}
