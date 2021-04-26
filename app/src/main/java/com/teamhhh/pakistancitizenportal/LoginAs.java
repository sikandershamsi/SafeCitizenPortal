package com.teamhhh.pakistancitizenportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LoginAs extends AppCompatActivity {
    SwitchCompat mySwitch;
    TextView lptv,lctv,forgotPassword,addNumtext;
    EditText inputEmail,inputPassword,inputPhone;
    Button loginPolice,loginCitizen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_as);
        final ProgressBar progressBar=findViewById(R.id.progressbar);
        lptv=findViewById(R.id.loginpolicetext);
        lctv=findViewById(R.id.logincitizentext);
        forgotPassword=findViewById(R.id.forgotpassword);
        inputEmail=findViewById(R.id.email);
        inputPassword=findViewById(R.id.password);
        inputPhone=findViewById(R.id.phonenum);
        loginPolice=findViewById(R.id.btnloginpolice);
        loginCitizen=findViewById(R.id.btnlogincitizen);
        addNumtext=findViewById(R.id.enteryournumtext);
        lptv.setVisibility(View.VISIBLE);
        inputEmail.setVisibility(View.VISIBLE);
        inputPassword.setVisibility(View.VISIBLE);
        forgotPassword.setVisibility(View.VISIBLE);
        loginPolice.setVisibility(View.VISIBLE);
        loginPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputEmail.getText().toString().equals("")){
                    inputEmail.setError("Please enter an email");
                }else if(inputPassword.getText().toString().equals("")){
                  inputPassword.setError("Please enter your password");
                }else{
                    Intent intent=new Intent(LoginAs.this,PolicePortal.class);
                    startActivity(intent);
                }
            }
        });
        loginCitizen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputPhone.getText().toString().equals("")) {
                    inputPhone.setError("Please enter a valid phonenum");
                } else {
                    Intent intent = new Intent(LoginAs.this, Otpscreen.class);
                    startActivity(intent);
                }
            }
        });


        mySwitch=findViewById(R.id.myswitch);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==false){
                   /* Toast.makeText(LoginAs.this, "Police",
                            Toast.LENGTH_LONG).show();*/
                    lctv.setVisibility(View.INVISIBLE);
                    lptv.setVisibility(View.VISIBLE);
                    addNumtext.setVisibility(View.INVISIBLE);
                    inputPhone.setVisibility(View.INVISIBLE);
                    loginCitizen.setVisibility(View.INVISIBLE);
                    inputEmail.setVisibility(View.VISIBLE);
                    inputPassword.setVisibility(View.VISIBLE);
                    forgotPassword.setVisibility(View.VISIBLE);
                    loginPolice.setVisibility(View.VISIBLE);
                }
                else {
                 /*   Toast.makeText(LoginAs.this, "Citizen",
                            Toast.LENGTH_LONG).show();*/
                    lptv.setVisibility(View.INVISIBLE);
                    lctv.setVisibility(View.VISIBLE);
                    addNumtext.setVisibility(View.VISIBLE);
                    inputPhone.setVisibility(View.VISIBLE);
                    loginCitizen.setVisibility(View.VISIBLE);
                    inputEmail.setVisibility(View.INVISIBLE);
                    inputPassword.setVisibility(View.INVISIBLE);
                    forgotPassword.setVisibility(View.INVISIBLE);
                    loginPolice.setVisibility(View.INVISIBLE);


                }


            }
        });

    }
}