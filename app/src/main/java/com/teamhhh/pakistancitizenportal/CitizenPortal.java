package com.teamhhh.pakistancitizenportal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class CitizenPortal extends AppCompatActivity {
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    ImageView emergency,reportCrime,missingPerson,trafficLaws,ambulanceAlert,countryLaws;
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citizen_portal);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        emergency=findViewById(R.id.citienemergency);
        reportCrime=findViewById(R.id.reportcrime);
        missingPerson=findViewById(R.id.missingperson);
        trafficLaws=findViewById(R.id.trafficlaws);
        ambulanceAlert=findViewById(R.id.amubulancealert);
        countryLaws=findViewById(R.id.laws);
        emergency.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Toast.makeText(CitizenPortal.this, "IIN DEVELOPMENT",
                                                     Toast.LENGTH_LONG).show();


                                         }
                                     }
        );
        reportCrime.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Toast.makeText(CitizenPortal.this, "IIN DEVELOPMENT",
                                                     Toast.LENGTH_LONG).show();

                                         }
                                     }
        );
        missingPerson.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                           /*  Toast.makeText(CitizenPortal.this, "IIN DEVELOPMENT",
                                                     Toast.LENGTH_LONG).show();*/
                                             Intent intent=new Intent(CitizenPortal.this,MissingPerson.class);
                                             startActivity(intent);

                                         }
                                     }
        );
        trafficLaws.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent=new Intent(CitizenPortal.this,TrafficLaws.class);
                                             startActivity(intent);


                                         }
                                     }
        );
        ambulanceAlert.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Toast.makeText(CitizenPortal.this, "IN DEVELOPMENT",
                                                       Toast.LENGTH_LONG).show();


                                           }
                                       }
        );
        countryLaws.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Toast.makeText(CitizenPortal.this, "IN DEVELOPMENT",
                                                       Toast.LENGTH_LONG).show();


                                           }
                                       }
        );




        nav=findViewById(R.id.navmenu);
        drawerLayout=findViewById(R.id.drawer);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId()){
                    case R.id.item1:
                        Toast.makeText(CitizenPortal.this, "profile",
                                Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.item2:
                        Toast.makeText(CitizenPortal.this, "profile2",
                                Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.item3:
                        new AlertDialog.Builder(CitizenPortal.this)
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .setTitle("SIGN OUT")
                                .setMessage("Are you sure you want to signout ?")
                                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent intent=new Intent(CitizenPortal.this,LoginAs.class);
                                        startActivity(intent);
                                        finish();

                                    }
                                })
                                .setNegativeButton("No",null).show();


                       /* Toast.makeText(CitizenPortal.this, "profile3",
                                Toast.LENGTH_LONG).show();*/
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });
    }
}