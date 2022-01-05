package com.cookandroid.sharetoy;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainActivity extends Fragment {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private HomeFragment fragment1;
    private ListFragment fragment2;
    private LikeFragment fragment3;
    private ProfileFragment fragment4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button btn1 = v.findViewById(R.id.swing_more);
        Button btn2= v.findViewById(R.id.frandimal_more);
        Button btn3= v.findViewById(R.id.cocomong_more);
        Button btn4= v.findViewById(R.id.redcar_more);
        Button btn5= v.findViewById(R.id.racingcar_more);
        Button btn6= v.findViewById(R.id.camera_more);
        Button btn7= v.findViewById(R.id.jazz_more);
        Button btn8= v.findViewById(R.id.basketball_more);
        Button btn9= v.findViewById(R.id.cut_fruit_more);
        Button btn10= v.findViewById(R.id.turtle_more);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","swing");
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","frandimal");
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","cocomong");
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","redcar");
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","racing_car");
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","camera");
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","jazz");
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","basketball");
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","cut_fruit");
                startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity().getApplicationContext(), SubInformation.class);
                intent.putExtra("ibid","turtle");
                startActivity(intent);
            }
        });

        bottomNavigationView = v.findViewById(R.id.nav_view);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.home:
                        setFrag(0);
                        break;
                    case R.id.list:
                        setFrag(1);
                        break;
                    case R.id.like:
                        setFrag(2);
                        break;
                    case R.id.profile:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        fragment1 = new HomeFragment();
        fragment2 = new ListFragment();
        fragment3 = new LikeFragment();
        fragment4 = new ProfileFragment();

        setFrag(0); // 첫화면 설정
        return v;
    }


    private void setFrag(int n) {
        manager = getFragmentManager();
        transaction = manager.beginTransaction();

        switch (n) {
            case 0:
                transaction.replace(R.id.frameLayout, fragment1);
                transaction.commit();
                break;
            case 1:
                transaction.replace(R.id.frameLayout, fragment2);
                transaction.commit();
                break;
            case 2:
                transaction.replace(R.id.frameLayout, fragment3);
                transaction.commit();
                break;
            case 3:
                transaction.replace(R.id.frameLayout, fragment4);
                transaction.commit();
                break;
        }
    }
}