package com.example.a20210210_fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragment = inflater.inflate(R.layout.fragment_fragment1, container, false);

        Button btn_naver = fragment.findViewById(R.id.btn_naver);

        btn_naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast 메시지 띄윅
                Toast.makeText(getActivity(), "click", Toast.LENGTH_SHORT).show();

                Intent myintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(myintent);


            }
        });


        return fragment;


    }
}