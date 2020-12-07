package com.example.simampus;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.BukuView> {
    public BukuAdapter(Buku buku, DBHelperBuku helper) {
    }

    @NonNull
    @Override
    public BukuView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BukuView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BukuView extends RecyclerView.ViewHolder {
        public BukuView(@NonNull View itemView) {
            super(itemView);
        }
    }
}
