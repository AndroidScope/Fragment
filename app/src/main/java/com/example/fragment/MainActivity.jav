package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.fragment.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnDataSentListener {
ActivityMainBinding binding;
OnDataSentListener listener;
    String a="cccc";
char c[]={'c','m'};
int a[]={5,2,7,9};
String s="mnc";
String d="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        for(int i=0;i<c.length;i++){
            d=""+s.charAt(i);
        }
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i!=j) {
                    if (a[i] > a[j]) {
                        int c = a[i];
                        a[i] = a[j];
                        a[j] = a[i];
                    }
                }
            }
        }
        String u="";
        Boolean value=false;
        int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
        char z[]={'c','v','f'};
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            al.add(z[i]);
        }
        for(int i=0;i<a.length;i++){

            if((a[i]+"").contains(u)|| value){
               for(int j=0;j<a.length;j++){
                   if(a[i]==a[j]){
                       u=a[i]+""+u;
                       Log.d("vvvvv",u);
                   }

               }



            }



        }

        listener= (OnDataSentListener) this;
        binding.sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Fragmentone one=new Fragmentone();
                transaction.replace(R.id.frame,one).addToBackStack(null);
                transaction.commit();
            }
        });
        binding.replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Fragmenttwo two=new Fragmenttwo();
                transaction.replace(R.id.frame,two).addToBackStack(null);
                transaction.commit();
            }
        });
    }

    @Override
    public void onDataSent(String data) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
       Fragmentone one= new Fragmentone();
        Bundle bundle = new Bundle();
        bundle.putInt("year", 2017);  // Key, value
        one.setArguments(bundle);
        transaction.replace(R.id.frame,one).addToBackStack(null);
        transaction.commit();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        listener.onDataSent("fff");

    }
}
