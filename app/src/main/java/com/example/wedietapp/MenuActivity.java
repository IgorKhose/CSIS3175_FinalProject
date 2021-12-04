package com.example.wedietapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements MenuAdapter.ItemClickListener {

    Integer [] workoutPics = {R.drawable.lowertraing, R.drawable.strengthworkouth,
            R.drawable.yoga };
    ImageView pic;
    MenuAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        pic = findViewById(R.id.LargeImg);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        int numColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numColumns));
        adapter = new MenuAdapter(this, workoutPics);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        pic.setImageResource(adapter.getItem(position));
        Toast.makeText(getBaseContext(), "Selected activity " + (position + 1),
                Toast.LENGTH_SHORT).show();
    }
}