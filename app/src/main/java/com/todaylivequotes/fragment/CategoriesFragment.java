package com.todaylivequotes.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.todaylivequotes.HomeActivity;
import com.todaylivequotes.R;
import com.todaylivequotes.categories.CategoriesActivity;


public class CategoriesFragment extends Fragment implements View.OnClickListener {
    private Context mContext;

    public CategoriesFragment(HomeActivity context) {
        this.mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container, false);
        initComponent(view);
        return view;
    }

    private void initComponent(View v) {
        Button btn_family = v.findViewById(R.id.btn_family);
        btn_family.setOnClickListener(this);
        Button btn_love = v.findViewById(R.id.btn_love);
        btn_love.setOnClickListener(this);
        Button btn_motivational = v.findViewById(R.id.btn_motivational);
        btn_motivational.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_family) {
            Intent categoriesIntent = new Intent(mContext, CategoriesActivity.class);
            categoriesIntent.putExtra("key", "family");
            startActivity(categoriesIntent);
        } else if (view.getId() == R.id.btn_love) {
            Intent categoriesIntent = new Intent(mContext, CategoriesActivity.class);
            categoriesIntent.putExtra("key", "love");
            startActivity(categoriesIntent);
        } else if (view.getId() == R.id.btn_motivational) {
            Intent categoriesIntent = new Intent(mContext, CategoriesActivity.class);
            categoriesIntent.putExtra("key", "motivational");
            startActivity(categoriesIntent);
        }
    }
}
