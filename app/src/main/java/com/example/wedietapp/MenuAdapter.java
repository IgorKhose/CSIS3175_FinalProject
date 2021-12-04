package com.example.wedietapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class MenuAdapter extends RecyclerView.Adapter {
    private Integer [] nData;
    private LayoutInflater nInflator;
    private ItemClickListener itemClickListener;

    public void setClickListener (ItemClickListener listener){
        itemClickListener = listener;
    }

    public MenuAdapter(Context context, Integer [] data){
        nInflator = LayoutInflater.from(context);
        nData = data;
    }
    public Integer getItem(int id){
        return  nData[id];
    } //  should get data on the list by id

    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = nInflator.inflate(R.layout.recycleview_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).imageView.setImageResource(nData[position]);
    }

    @Override
    public int getItemCount() {
        return nData.length;
    } // length of data is returned

    public class  ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.SmallImg);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(itemClickListener != null) {
                itemClickListener.onItemClick(v, getAdapterPosition());
            }

        }
    }
    public interface ItemClickListener{
        void onItemClick(View view, int position);
    }
}
