package com.example.formfillup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText morg1;
    private EditText memail1;
    private EditText mname1;
    private EditText maddr1;
    private Button mbtn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        morg1=findViewById(R.id.org1);
        memail1=findViewById(R.id.email1);
        mname1=findViewById(R.id.name1);
        maddr1=findViewById(R.id.addr1);
        mbtn2=findViewById(R.id.btn2);

        String name= getIntent().getStringExtra("key");
        morg1.setText(name);
        String name1= getIntent().getStringExtra("key1");
        memail1.setText(name1);
        String name2= getIntent().getStringExtra("key2");
        mname1.setText(name2);
        String name3= getIntent().getStringExtra("key3");
        maddr1.setText(name3);

    }
}