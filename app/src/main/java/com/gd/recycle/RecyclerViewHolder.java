package com.gd.recycle;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private ImageView imgView;
    private TextView  txtView;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        imgView = itemView.findViewById(R.id.red_img);
        txtView = itemView.findViewById(R.id.red_txt);


    }

    public TextView getTxtView(){
        return txtView;
    }

}