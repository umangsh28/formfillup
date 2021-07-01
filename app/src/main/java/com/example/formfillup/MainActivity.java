package com.example.formfillup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText morg;
    private EditText memail;
    private EditText mname;
    private EditText maddr;
    private Button mbtn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        morg=findViewById(R.id.org);
        memail=findViewById(R.id.email);
        mname=findViewById(R.id.name);
        maddr=findViewById(R.id.addr);
        mbtn1=findViewById(R.id.btn1);

        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("key",morg.getText().toString());
                intent.putExtra("key1",memail.getText().toString());
                intent.putExtra("key2",mname.getText().toString());
                intent.putExtra("key3",maddr.getText().toString());
                startActivity(intent);
            }
        });

    }

}
