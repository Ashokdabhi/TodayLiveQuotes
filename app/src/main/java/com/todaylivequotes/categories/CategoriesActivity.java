package com.todaylivequotes.categories;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.todaylivequotes.R;

import java.util.Objects;

public class CategoriesActivity extends AppCompatActivity {

    private String getKey;
    private CategoriesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getKey = getIntent().getStringExtra("key");
        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            TextView toolbar_title = toolbar.findViewById(R.id.toolbar_title);
            toolbar_title.setText(getKey);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
                }
            });
        }
    }

    private void initComponent() {
        RecyclerView rv_categories = findViewById(R.id.rv_categories);
        rv_categories.setLayoutManager(new LinearLayoutManager(this));
        rv_categories.setHasFixedSize(true);
        switch (getKey) {
            case "family":
                adapter = new CategoriesAdapter(imageFamily);
                break;
            case "love":
                adapter = new CategoriesAdapter(imageLove);
                break;
            case "motivational":
                adapter = new CategoriesAdapter(imageMotivational);
                break;
        }
        rv_categories.setAdapter(adapter);
    }

    ImageList[] imageFamily = new ImageList[]{
            new ImageList(R.drawable.family_1),
            new ImageList(R.drawable.family_2),
            new ImageList(R.drawable.family_3),
            new ImageList(R.drawable.family_4),
            new ImageList(R.drawable.family_5)
    };
    ImageList[] imageLove = new ImageList[]{
            new ImageList(R.drawable.love_1),
            new ImageList(R.drawable.love_2),
            new ImageList(R.drawable.love_3),
            new ImageList(R.drawable.love_4),
            new ImageList(R.drawable.love_5)
    };
    ImageList[] imageMotivational = new ImageList[]{
            new ImageList(R.drawable.motivational_1),
            new ImageList(R.drawable.motivational_2),
            new ImageList(R.drawable.motivational_3),
            new ImageList(R.drawable.motivational_4),
            new ImageList(R.drawable.motivational_5)
    };
}