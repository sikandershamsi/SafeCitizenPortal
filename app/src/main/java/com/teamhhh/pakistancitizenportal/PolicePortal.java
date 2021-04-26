package com.teamhhh.pakistancitizenportal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PolicePortal extends AppCompatActivity {
    ImageView emergency,history,help,profile,signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_portal);
         emergency=findViewById(R.id.btnemergency);
        history=findViewById(R.id.btnhistory);
        help=findViewById(R.id.btnhelp);
        profile=findViewById(R.id.btnprofile);
       signout=findViewById(R.id.btnsignout);
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PolicePortal.this,EmergencyRecived.class);
                startActivity(intent);

            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PolicePortal.this,CrimeHistory.class);
                startActivity(intent);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PolicePortal.this, "IN DEVELOPMENT",
                        Toast.LENGTH_LONG).show();

            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PolicePortal.this, "IN DEVELOPMENT",
                        Toast.LENGTH_LONG).show();

            }
        });
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(PolicePortal.this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("SIGN OUT")
                        .setMessage("Are you sure you want to signout ?")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(PolicePortal.this,LoginAs.class);
                                startActivity(intent);
                                finish();

                            }
                        })
                        .setNegativeButton("No",null).show();



            }
        });


    }
}