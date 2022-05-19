package com.example.slutprojekt;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListAdapterViewHolder> {

    private List<Item> items;

    public ListAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ListAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.item = items.get(position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ListAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private Button details;
        private Item item;
        public ListAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_name);
            details = itemView.findViewById(R.id.details_button);
            details.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("item", (Parcelable) item);
                    startActivity(intent);
                }
            });
        }
    }

    public void setContentList(List<Item> items) {
        this.items = items;
        this.notifyDataSetChanged();
    }
}
