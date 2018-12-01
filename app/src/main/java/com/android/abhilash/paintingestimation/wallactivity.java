package com.android.abhilash.paintingestimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class wallactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallactivity);


        final Button btn=(Button)findViewById(R.id.button);
        final EditText ed1=(EditText) findViewById(R.id.edit1);
        final EditText ed2=(EditText) findViewById(R.id.edit2);
        final EditText ed3=(EditText) findViewById(R.id.edit3);
        final TextView t=(TextView) findViewById(R.id.text1);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(wallactivity.this,"Estimated Cost",Toast.LENGTH_SHORT).show();
                t.setText(String.valueOf(Double.valueOf(String.valueOf(ed1.getText()))* Double.valueOf(String.valueOf(ed2.getText())) *Double.valueOf(String.valueOf(ed3.getText())) ));


            }
        });

    }



}
