package com.example.turboclone.model.home_vip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turboclone.R;

import java.util.List;

public class VipAdapter extends RecyclerView.Adapter<ViewHolder> {
    List<VipModel> list;

    public VipAdapter(List<VipModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int LayoutIdFromListItem = R.layout.item_announcement_list;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(LayoutIdFromListItem, parent, false);

        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(list.get(position), position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
