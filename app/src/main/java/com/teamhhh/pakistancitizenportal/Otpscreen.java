package com.teamhhh.pakistancitizenportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Otpscreen extends AppCompatActivity {
    EditText inputCode1,inputCode2,inputCode3,inputCode4,inputCode5,inputCode6;
    Button nextBtn;
    String verificationId;
    TextView textMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpscreen);
        textMobile =findViewById(R.id.textmobile);
        inputCode1=findViewById(R.id.inputcode1);
        inputCode2=findViewById(R.id.inputcode2);
        inputCode3=findViewById(R.id.inputcode3);
        inputCode4=findViewById(R.id.inputcode4);
        inputCode5=findViewById(R.id.inputcode5);
        inputCode6=findViewById(R.id.inputcode6);
        nextBtn=findViewById(R.id.next);
        inputCode1.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(inputCode1.getText().toString().length()==1)     //size as per your requirement
                {
                    inputCode2.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        inputCode2.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(inputCode2.getText().toString().length()==1)     //size as per your requirement
                {
                    inputCode3.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        inputCode3.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(inputCode3.getText().toString().length()==1)     //size as per your requirement
                {
                    inputCode4.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        inputCode4.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(inputCode4.getText().toString().length()==1)     //size as per your requirement
                {
                    inputCode5.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        inputCode5.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(inputCode5.getText().toString().length()==1)     //size as per your requirement
                {
                    inputCode6.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputCode1.getText().toString().equals("")||inputCode2.getText().toString().equals("")
                ||inputCode3.getText().toString().equals("")||inputCode4.getText().toString().equals("")
                ||inputCode5.getText().toString().equals("")||inputCode6.getText().toString().equals("")) {

                    inputCode6.setError("Please enter otp");
                } else {
                    Intent intent = new Intent(Otpscreen.this, SelectIce.class);
                    startActivity(intent);
                }
            }
        });

    }
}