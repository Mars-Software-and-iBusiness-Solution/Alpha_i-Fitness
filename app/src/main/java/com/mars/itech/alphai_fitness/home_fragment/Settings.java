package com.mars.itech.alphai_fitness.home_fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.mars.itech.alphai_fitness.Home_Directory.Favorite_iFit;
import com.mars.itech.alphai_fitness.Home_Directory.Feed_iFit;
import com.mars.itech.alphai_fitness.Home_Directory.Home_iFit;
import com.mars.itech.alphai_fitness.Home_Directory.Map_iFit;
import com.mars.itech.alphai_fitness.Home_Directory.Shops_iFit;
import com.mars.itech.alphai_fitness.MainActivity;
import com.mars.itech.alphai_fitness.R;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);



        NavigationView navigationView = findViewById(R.id.sidenavigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {

                int id = item.getItemId();

                if (id == R.id.editprofile)
                {
                    Intent editpro = new Intent(Settings.this, Edit_Profile.class);
                    startActivity(editpro);
                    finish();
                }
                else if(id == R.id.trackmyprogress)
                {

                    Intent trackpro = new Intent(Settings.this, Track_Progress.class );
                    startActivity(trackpro);
                    finish();
                }
                else if(id == R.id.basic_workouts)
                {

                    Intent basicwork = new Intent(Settings.this, Check_Health.class);
                    startActivity(basicwork);
                    finish();
                }
                else if(id == R.id.findmeaworkout)
                {

                    Intent findtrain = new Intent(Settings.this, Basic_Workouts.class);
                    startActivity(findtrain);
                    finish();
                }
                else if(id == R.id.consultacoach)
                {

                    Intent mytrain = new Intent(Settings.this, My_Trainer.class);
                    startActivity(mytrain);
                    finish();
                }else if(id == R.id.search_user)
                {

                    Intent shareex = new Intent(Settings.this, Share_Experience.class);
                    startActivity(shareex);
                    finish();
                }
                else if(id == R.id.settings)
                {

                    Intent settings = new Intent(Settings.this, Settings.class);
                    startActivity(settings);
                    finish();
                }
                else if(id == R.id.logout)
                {

                    Toast.makeText(Settings.this, "You Have been Sign-out successfully!", Toast.LENGTH_SHORT).show();
                    finish();
                    FirebaseAuth.getInstance().signOut();
                    Intent loginIntent = new Intent(Settings.this, MainActivity.class );
                    startActivity(loginIntent);


                }


                return true;

            }
        });

    }

    @Override
    public void onBackPressed() {
        // do your back button logic here
        // you can have conditions or whatever you want to do.
        // change to different fragment, go to different activity, etc.

        Intent registerIntent = new Intent(Settings.this, Home_iFit.class);
        startActivity(registerIntent);
        finish();

    }
}