package com.cookandroid.sharetoy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

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
                System.out.println("버튼 눌림");
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","swing");
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","frandimal");
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","cocomong");
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","redcar");
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","racing_car");
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","camera");
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","jazz");
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","basketball");
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","cut_fruit");
                startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), SubInformation.class);
                intent.putExtra("ibid","turtle");
                startActivity(intent);
            }
        });


        return v;

    }

}