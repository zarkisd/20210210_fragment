package com.example.a20210210_fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navi;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        //첫 화면 fragment1으로 고정
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

        navi = findViewById(R.id.navigation);
        navi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //현재 선택된 menu item의 id판별
                switch (item.getItemId()) {
                    case R.id.tab1:
                        //1. Fragment 각각 객체 생성
                        //2. 갈아끼우기
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
                        break;
                    case R.id.tab2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
                        break;
                    case R.id.tab3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment3).commit();
                        break;
                    case R.id.tab4:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment4).commit();
                        break;


                }
                // navigation에 아무 변화 없음
                return true;
            }
        });

    }
}