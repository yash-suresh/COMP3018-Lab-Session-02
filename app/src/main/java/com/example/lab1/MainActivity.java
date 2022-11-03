package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    //entry point of the application when started

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CatCard> catList = new ArrayList<CatCard>();
        String[] catNames = getResources().getStringArray(R.array.cat_names);

        for(int i = 0; i <= 7; i++)
        {
            CatCard catcatCard = new CatCard();
            catcatCard.resourceID = getResources().getIdentifier("@drawable/cat"+i,
                    "drawable", getPackageName());

            catcatCard.catName = catNames[i];
            catList.add(catcatCard);

        }

        RecyclerView recyclerView = findViewById(R.id.recycler1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CatRecyclerViewAdapter adapter = new CatRecyclerViewAdapter(this, catList);
        recyclerView.setAdapter(adapter);


    }
}