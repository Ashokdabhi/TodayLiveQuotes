package com.todaylivequotes.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.todaylivequotes.HomeActivity;
import com.todaylivequotes.R;
import com.todaylivequotes.categories.CategoriesAdapter;
import com.todaylivequotes.categories.ImageList;


public class QuotesFragment extends Fragment {
    private Context mContext;

    public QuotesFragment(HomeActivity context) {
        this.mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quotes, container, false);
        initComponent(view);
        return view;
    }

    private void initComponent(View view) {
        RecyclerView rv_quotes = view.findViewById(R.id.rv_quotes);
        rv_quotes.setLayoutManager(new LinearLayoutManager(mContext));
        rv_quotes.setHasFixedSize(true);
        CategoriesAdapter adapter = new CategoriesAdapter(imageLists);
        rv_quotes.setAdapter(adapter);
    }

    ImageList[] imageLists = new ImageList[]{
            new ImageList(R.drawable.motivational_1),
            new ImageList(R.drawable.motivational_2),
            new ImageList(R.drawable.motivational_3),
            new ImageList(R.drawable.motivational_4),
            new ImageList(R.drawable.motivational_5),
            new ImageList(R.drawable.love_1),
            new ImageList(R.drawable.love_2),
            new ImageList(R.drawable.love_3),
            new ImageList(R.drawable.love_4),
            new ImageList(R.drawable.love_5),
            new ImageList(R.drawable.family_1),
            new ImageList(R.drawable.family_2),
            new ImageList(R.drawable.family_3),
            new ImageList(R.drawable.family_4),
            new ImageList(R.drawable.family_5)
    };
}
