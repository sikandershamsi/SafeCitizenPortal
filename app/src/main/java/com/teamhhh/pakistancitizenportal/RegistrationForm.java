package com.teamhhh.pakistancitizenportal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class RegistrationForm extends AppCompatActivity {
    Button saVe;
    EditText Name,Email,Dob,City;
    Calendar myCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        saVe=findViewById(R.id.save);
        Name=findViewById(R.id.name);
        Email=findViewById(R.id.email);
        Dob=findViewById(R.id.dob);
        City=findViewById(R.id.city);

        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                String myFormat = "yyyy-MM-dd"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                Dob.setText(sdf.format(myCalendar.getTime()));
            }

        };
        Dob.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                myCalendar = Calendar.getInstance();
                new DatePickerDialog(RegistrationForm.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
                return true; // consume touch even
            }
        });

        saVe.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (Name.getText().toString().equals("")) {
                                            Name.setError("Please your fullname");
                                        } else if (Email.getText().toString().equals("")) {
                                            Email.setError("Please enter your password");
                                        }
                                        else if (Dob.getText().toString().equals("")) {
                                           Dob.setError("Please enter your password");
                                        }
                                        else if (City.getText().toString().equals("")) {
                                            City.setError("Please enter your password");
                                        }else {
                                            Intent intent = new Intent(RegistrationForm.this, CitizenPortal.class);
                                            startActivity(intent);
                                        }
                                    }
                                }
        );
    }
}