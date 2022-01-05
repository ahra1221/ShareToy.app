package com.cookandroid.sharetoy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


    public class MainActivity extends AppCompatActivity {
        private static final String TAG = "Main_Activity";

        private BottomNavigationView mBottomNavigationView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mBottomNavigationView=findViewById(R.id.nav_view);

            //첫 화면 띄우기
            getSupportFragmentManager().beginTransaction().add(R.id.frame_container,new HomeFragment()).commit();

            //case 함수를 통해 클릭 받을 때마다 화면 변경하기
            mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.home :
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new HomeFragment()).commit();
                            break;
                        case R.id.reserve:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new ReserveFragment()).commit();
                            break;
                        case R.id.like:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new LikeFragment()).commit();
                            break;
                        case R.id.profile:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new ProfileFragment()).commit();
                            break;

                    }
                    return true;
                }
            });
        }
    }