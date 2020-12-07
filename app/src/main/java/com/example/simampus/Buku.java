package com.example.simampus;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Buku extends AppCompatActivity {

    RecyclerView bukuRv;
    DBHelperBuku helper;
    LayoutInflater inflater;
    View dialogView;
    TextView TvKode, TvJudul, TvPenulis, TvPenerbit, TvTahunTerbit, TvJmlHalaman, TvRakBuku, TvTglMasukBuku, TvKategori;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku);
        initialized();
    }

    private void initialized() {
        helper = new DBHelperBuku(this);
        bukuRv.setAdapter(new BukuAdapter(this,helper));

    }

}