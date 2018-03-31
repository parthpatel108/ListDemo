package com.parth.parthdev.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.parth.parthdev.listdemo.adapter.CustomeAdapter;

public class MainActivity extends AppCompatActivity {

    ListView list;
    int image[] = {R.drawable.logo_bhavesh, R.drawable.logo_dharam,R.drawable.logo_jay,R.drawable.logo_jignesh};
    String name[]={"Parth Patel","Kushal Patel","Jay Mayavansi","Jignesh Patel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);


        list.setAdapter(new CustomeAdapter(MainActivity.this,image,name));


    }
}
