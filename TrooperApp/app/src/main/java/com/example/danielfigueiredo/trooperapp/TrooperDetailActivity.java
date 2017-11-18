package com.example.danielfigueiredo.trooperapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

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
}
