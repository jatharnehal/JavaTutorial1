package com.example.akshay.javatutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.akshay.javatutorial.R.*;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
   Context context;
   String[] items;
    public CustomAdapter(Context context,String[] items)
    {
        this.context=context;
        this.items=items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View row=layoutInflater.inflate(layout.javatopic,parent,false);
        Item item=new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        ((Item)holder).name.setText(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
    public class Item extends RecyclerView.ViewHolder
    {
        TextView name;
        public Item(View itemView)
        {
            super(itemView);
            name=itemView.findViewById(R.id.textView);
        }
    }
}