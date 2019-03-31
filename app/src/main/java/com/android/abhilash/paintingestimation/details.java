package com.android.abhilash.paintingestimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class details extends AppCompatActivity {
public Button btn;
public Button btn1;
public EditText ed1,ed2,ed3,ed4,ed5,ed6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        btn=(Button)findViewById(R.id.submitdet);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editTextb);
        ed3=(EditText)findViewById(R.id.editTextl);
        ed4=(EditText)findViewById(R.id.editText4);
        final EditText ed5= (EditText)findViewById(R.id.editTextbathl);
        final EditText ed6=(EditText)findViewById(R.id.editTextbathr);

        final TextView tv=(TextView)findViewById(R.id.textView1);




         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 tv.setText(String.valueOf((Double.valueOf(String.valueOf(ed1.getText()))*Double.valueOf(String.valueOf(ed2.getText()))*Double.valueOf(String.valueOf(ed3.getText()))) + Double.valueOf(String.valueOf(ed4.getText()))*Double.valueOf(String.valueOf(ed5.getText()))*Double.valueOf(String.valueOf(ed6.getText()))));

             }
         });


            }
}
