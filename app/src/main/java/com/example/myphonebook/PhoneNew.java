package com.example.myphonebook;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhoneNew extends RecyclerView.ViewHolder{

    public TextView t_name,t_mobile;
    public PhoneNew(@NonNull  View itemView)
    {
        super(itemView);
        t_name = itemView.findViewById(R.id.txt_name);
        t_mobile = itemView.findViewById(R.id.txt_mobile);
    }
}
