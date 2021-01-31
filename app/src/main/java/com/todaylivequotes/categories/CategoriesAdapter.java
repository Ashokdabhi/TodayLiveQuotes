package com.todaylivequotes.categories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.todaylivequotes.R;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder> {

    private ImageList[] imageLists;

    public CategoriesAdapter(ImageList[] imageLists) {
        this.imageLists = imageLists;
    }

    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.categores_item, parent, false);
        return new CategoriesViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesViewHolder holder, int position) {
        ImageList list = imageLists[position];
        holder.img_categories.setImageResource(list.getImg());
    }

    @Override
    public int getItemCount() {
        return imageLists.length;
    }

    public static class CategoriesViewHolder extends RecyclerView.ViewHolder {
        private final ImageView img_categories;

        public CategoriesViewHolder(@NonNull View itemView) {
            super(itemView);
            img_categories = itemView.findViewById(R.id.img_categories);

        }
    }
}
