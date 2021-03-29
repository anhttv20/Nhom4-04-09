package com.example.nhom4_04_09;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nhom4_04_09.model.Cat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rev;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rev=findViewById(R.id.rev);
        GridLayoutManager layout=new GridLayoutManager(this,
                3);
        adapter=new RecyclerViewAdapter(this);
        rev.setLayoutManager(layout);
        adapter.setData(getAll());
        rev.setAdapter(adapter);
    }
    private List<Cat> getAll(){
        List<Cat> list=new ArrayList<>();
        list.add(new Cat(R.drawable.cat1,"Cat 1"));
        list.add(new Cat(R.drawable.cat2,"Cat 2"));
        list.add(new Cat(R.drawable.cat3,"Cat 3"));
        list.add(new Cat(R.drawable.cat4,"Cat 4"));
        list.add(new Cat(R.drawable.cat5,"Cat 5"));
        list.add(new Cat(R.drawable.cat6,"Cat 6"));
        return list;
    }
}
