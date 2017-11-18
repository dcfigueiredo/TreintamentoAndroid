package com.example.danielfigueiredo.aula2.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.danielfigueiredo.aula2.R;
import com.example.danielfigueiredo.aula2.StarWarsItemDto;

import java.util.ArrayList;

/**
 * Created by daniel.figueiredo on 18/11/2017.
 */

public class LineAdapter extends RecyclerView.Adapter<LineHolder>{

    private ArrayList<StarWarsItemDto> list;

    public LineAdapter(ArrayList<StarWarsItemDto> list) {
        this.list = list;
    }

    @Override
    public LineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LineHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_list_menu, parent, false));
    }

    @Override
    public void onBindViewHolder(LineHolder holder, int position) {
        holder.textView.setText(list.get(position).getNome());
        holder.imageView.setImageResource(list.get(position).getImageId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
