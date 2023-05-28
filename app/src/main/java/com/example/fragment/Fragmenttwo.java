package com.example.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmenttwo extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("ccc","onattach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater l, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("ccc","oncreateview");
        View v= l.inflate(R.layout.frame2, container, false);
        return  v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("ccc","onview created");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("ccc","onstart");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("ccc","ondestroyview");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("ccc","ondestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("ccc","ondetach");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("ccc","onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("ccc","onstop");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("ccc","onresume");
    }


}