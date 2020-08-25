package com.wxt.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapate adapater=new adapate(fruitList);
        recyclerView.setAdapter(adapater);
    }
    public void init(){
        for(int i=0;i<2;i++){
            Fruit A=new Fruit("a",R.drawable.b);
            fruitList.add(A);
            Fruit B=new Fruit("a",R.drawable.c);
            fruitList.add(B);
            Fruit C=new Fruit("a",R.drawable.d);
            fruitList.add(C);
            Fruit D=new Fruit("a",R.drawable.e);
            fruitList.add(D);
            Fruit E=new Fruit("a",R.drawable.f);
            fruitList.add(E);
            Fruit F=new Fruit("a",R.drawable.h);
            fruitList.add(F);
            Fruit G=new Fruit("a",R.drawable.i);
            fruitList.add(G);
            Fruit H=new Fruit("a",R.drawable.m);
            fruitList.add(H);







        }

    }
}
