package com.example.danielfigueiredo.trooperapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.danielfigueiredo.trooperapp.Adapter.TrooperAdapter;
import com.example.danielfigueiredo.trooperapp.Model.Tropper.Trooper;
import com.example.danielfigueiredo.trooperapp.Util.Constants;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TrooperAdapter.OnItemClickListener, View.OnLongClickListener{

    private RecyclerView rvTroopers;
    private ArrayList<Trooper> troopers;
    private TrooperAdapter trooperAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTroopers = findViewById(R.id.rv_trooper);
        this.populateRecyclerView();
    }

    private void populateRecyclerView() {
        troopers = TrooperRepository.tryGettingFromSharedPreferences(getSharedPreferences(Constants.PREFS_NAME, MODE_PRIVATE));

        rvTroopers.setLayoutManager(new LinearLayoutManager(this));

        trooperAdapter = new TrooperAdapter(troopers, this, this);
        rvTroopers.setAdapter(trooperAdapter);
    }

    @Override
    public void onItemClick(Trooper trooper) {
        Intent intent = new Intent(this, TrooperDetailActivity.class);
        intent.putExtra(Constants.TROOPER_EXTRA, trooper);
    }

    @Override
    protected void onStop() {
        super.onStop();
        TrooperRepository.saveToSharedPreferences(troopers, getSharedPreferences(Constants.PREFS_NAME, MODE_PRIVATE));
    }

    @Override
    public boolean onLongClick(final View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.exluir_title)
            .setMessage(R.string.excluir_message)
            .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    int position = rvTroopers.getChildLayoutPosition(v);
                    troopers.remove(position);
                    trooperAdapter.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this, R.string.excluido, Toast.LENGTH_SHORT).show();
                }
            })
            .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).show();
        return true;
    }
}
