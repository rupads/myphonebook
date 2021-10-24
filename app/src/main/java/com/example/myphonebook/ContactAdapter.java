package com.example.myphonebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public Context context;
    ArrayList<Phone> list = new ArrayList<>();
    public ContactAdapter(Context ctx){
        this.context = ctx;
    }
    public void setItems(ArrayList<Phone> phone){
        list.addAll(phone);
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new PhoneNew(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position)
    {
       PhoneNew vh = (PhoneNew) holder;
        Phone phone = list.get(position);
        vh.t_name.setText(phone.getName());
        vh.t_mobile.setText(phone.getMobile());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}


