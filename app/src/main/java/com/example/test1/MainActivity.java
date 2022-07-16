package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent( getApplicationContext(),SecondActivity.class);
                startActivity(intent);

               // Toast.makeText(getApplicationContext(),"Bismillahi",Toast.LENGTH_LONG).show();
            }
        });

    }


    private void init()
    {
        btn1=findViewById(R.id.btn1);

    }

}