package com.TritonHalley.shop.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LatestProductsAdapter extends RecyclerView.Adapter<LatestProductsAdapter.ProductsHolder> {

    @NonNull
    @Override
    public ProductsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ProductsHolder extends RecyclerView.ViewHolder {
        public ProductsHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
