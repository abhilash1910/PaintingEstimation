package com.android.abhilash.paintingestimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class apartment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment);
        final EditText ed3=(EditText) findViewById(R.id.editText9);
        final TextView t=(TextView) findViewById(R.id.textView8);

        Button btn=(Button)findViewById(R.id.button12);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(apartment.this,"Estimated Cost",Toast.LENGTH_SHORT).show();
                t.setText(String.valueOf(118 *Double.valueOf(String.valueOf(ed3.getText())) ));
            }
        });

    }
}
