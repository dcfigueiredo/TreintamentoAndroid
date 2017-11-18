package com.example.danielfigueiredo.trooperapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.danielfigueiredo.trooperapp.Adapter.TrooperAdapter;
import com.example.danielfigueiredo.trooperapp.Model.Tropper.Trooper;
import com.example.danielfigueiredo.trooperapp.Util.Constants;
import com.example.danielfigueiredo.trooperapp.Util.ResourceUtil;
import com.squareup.picasso.Picasso;

import java.io.Serializable;

/**
 * Created by daniel.figueiredo on 18/11/2017.
 */

public class TrooperDetailActivity extends AppCompatActivity implements TrooperAdapter.OnItemClickListener {

    private TextView tvTrooperDesc;
    private ImageView imvTrooperImage, imvTrooplerAff;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_desc_trooper);
        this.initializeComponents();
        this.bindTrooper();
    }

    private void bindTrooper() {
        Trooper trooper = (Trooper) getIntent().getSerializableExtra(Constants.TROOPER_EXTRA);

        tvTrooperDesc.setText(trooper.getDesc());
        imvTrooplerAff.setImageResource(ResourceUtil.getResourceBaseOnAffiliation(trooper.getAffiliation()));
        Picasso.with(this)
                .load(trooper.getImgUrl())
                .into(imvTrooperImage);
    }

    private void initializeComponents() {
        tvTrooperDesc = findViewById(R.id.trooper_desc);
        imvTrooperImage = findViewById(R.id.trooper_photo);
        imvTrooplerAff = findViewById(R.id.trooper_affiliation_crest);
    }

    @Override
    public void onItemClick(Trooper trooper) {
        return;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.trooper_detail_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.star_item:
                Toast.makeText(this, "Favoritar Trooper", Toast.LENGTH_SHORT).show();
            default:
                super.onOptionsItemSelected(item);
        }
        return true;
    }
}
