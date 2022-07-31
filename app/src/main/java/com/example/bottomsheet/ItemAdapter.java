package com.example.bottomsheet;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.Viewholder> {
    private List<String> mItems;
    private Itemlistener mListener;

    public ItemAdapter(List<String> items, Itemlistener listener) {
        this.mItems = items;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.setData(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public interface Itemlistener {

         void onFruitClick(String fruit);
    }


    public class Viewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private String item;

        TextView textView;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textView = itemView.findViewById(R.id.text_view);
        }

        public void setData(String fruit) {

            textView.setText(fruit);

        }


        @Override
        public void onClick(View view) {

            mListener.onFruitClick(mItems.get(getAdapterPosition()));
        }
    }
}
