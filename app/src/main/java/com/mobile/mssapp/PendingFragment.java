package com.mobile.mssapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PendingFragment extends Fragment {
    ArrayList<Messages> messages = new ArrayList<Messages>();
    RecyclerView recyclerView;

    PendingRecyclerAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setUpSms();
        View view = inflater.inflate(R.layout.fragment_pending, container, false);

        recyclerView = view.findViewById(R.id.recyclerPending);

        adapter = new PendingRecyclerAdapter(this, messages);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    private void setUpSms() {
        String sms []  = getResources().getStringArray(R.array.messages);

        for (int i = 0; i<sms.length; i++)
        {
            messages.add(new Messages(sms[i]));
        }
    }


}

