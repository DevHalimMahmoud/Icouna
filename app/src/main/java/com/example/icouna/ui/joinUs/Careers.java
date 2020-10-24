package com.example.icouna.ui.joinUs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.icouna.R;

import java.util.ArrayList;

public class Careers extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careers);

        ArrayList<JoinUsItem> joinUsItemArrayList = new ArrayList<>();
        joinUsItemArrayList.add(new JoinUsItem("Android Developer", "Egypt"));
        joinUsItemArrayList.add(new JoinUsItem("IOS Developer", "Icouna"));
        joinUsItemArrayList.add(new JoinUsItem("Android Developer", "Quena"));
        joinUsItemArrayList.add(new JoinUsItem("Android Developer", "Shopra"));
        joinUsItemArrayList.add(new JoinUsItem("Android Developer", "Icouna"));
        joinUsItemArrayList.add(new JoinUsItem("Android Developer", "USA"));
        joinUsItemArrayList.add(new JoinUsItem("Android Developer", "ALEX"));
        joinUsItemArrayList.add(new JoinUsItem("Android Developer", "Cairo"));
        recyclerView = findViewById(R.id.careers_list);

        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false));


        CareersRecyclerViewAdapter careersRecyclerViewAdapter = new CareersRecyclerViewAdapter(R.layout.join_us_item, joinUsItemArrayList);

        recyclerView.setAdapter(careersRecyclerViewAdapter);
    }
}