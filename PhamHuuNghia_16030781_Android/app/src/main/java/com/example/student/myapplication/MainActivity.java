package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<HoaHau> arrayList;
    CustomArrayAdapter customArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        arrayList.add(new HoaHau("Ky Duyen",1990,R.drawable.kyduyen,R.drawable.america));
        arrayList.add(new HoaHau("Dang Thi Thu Thao",1998,R.drawable.dangthuthao,R.drawable.australia));
        arrayList.add(new HoaHau("Nguyen Thi Huyen",1992,R.drawable.thihuyen,R.drawable.vietnam));
        arrayList.add(new HoaHau("Do My Linh",1994,R.drawable.domylinh,R.drawable.canada));
        customArrayAdapter = new CustomArrayAdapter(MainActivity.this,R.layout.custom,arrayList);
        listView.setAdapter(customArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this,arrayList.get(position).toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
