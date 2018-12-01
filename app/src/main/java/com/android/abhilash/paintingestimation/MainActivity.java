package com.android.abhilash.paintingestimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.button9);
       Button btn1=(Button)findViewById(R.id.button11);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Estimated Cost of Wall",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,wallactivity.class));

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Estimated Cost of Apartment",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,apartment.class));
            }
        });



    }






}
