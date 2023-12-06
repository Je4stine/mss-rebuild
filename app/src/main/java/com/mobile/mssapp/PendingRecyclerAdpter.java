package com.mobile.mssapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class PendingRecyclerAdapter extends RecyclerView.Adapter<PendingRecyclerAdapter.CompleteViewHolder> {

    PendingFragment context;
    ArrayList<Messages> messages;

    public PendingRecyclerAdapter(PendingFragment context, ArrayList<Messages> messages) {
        this.context = context;
        this.messages = messages;
    }

    @NonNull
    @Override
    public CompleteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context.getContext());
        View view = layoutInflater.inflate(R.layout.pendingview, parent, false);

        return new PendingRecyclerAdapter.CompleteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CompleteViewHolder holder, int position) {
        holder.tvMessage.setText(messages.get(position).getMessages());

    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public static class CompleteViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvMessage;
        public CompleteViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMessage = itemView.findViewById(R.id.tvMessage);
        }
    }
}




