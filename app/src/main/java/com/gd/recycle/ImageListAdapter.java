package com.gd.recycle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageListAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{
    private int imgInt;

    public ImageListAdapter(int num){
        this.imgInt = num;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.red_item,parent,false);
        Log.d("imgInt", Integer.toString(imgInt));
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.getTxtView().setText(String.valueOf((position+1)*10));
    }

    @Override
    public int getItemCount() {
        Log.d("imgInt", Integer.toString(imgInt));
        return imgInt;
    }
}
