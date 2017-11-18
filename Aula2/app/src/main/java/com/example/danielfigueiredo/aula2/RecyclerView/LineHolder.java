package com.example.danielfigueiredo.aula2.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.danielfigueiredo.aula2.R;

/**
 * Created by daniel.figueiredo on 18/11/2017.
 */

public class LineHolder extends RecyclerView.ViewHolder {

    public TextView textView;
    public ImageView imageView;

    public LineHolder(View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.name);
        imageView = itemView.findViewById(R.id.image);
    }
}
