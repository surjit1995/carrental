package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String name;
    TextView tvname;
    Spinner spcars;
    ImageView imgcars;
    EditText etrentrate,etdays,etpayment;
    RadioGroup rgage;


    Integer rent[]={100,300,200,240,340,180};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvname=findViewById(R.id.welcomename);
        Intent act = getIntent();
        name =act.getStringExtra("Name");
        tvname.setText(name);
    }
}
