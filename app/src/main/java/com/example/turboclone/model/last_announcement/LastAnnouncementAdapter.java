package com.example.turboclone.model.last_announcement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turboclone.R;

import java.util.List;

public class LastAnnouncementAdapter extends RecyclerView.Adapter<LastAnnouncementHolder>  {
    List<LastAnnouncementModel> list;

    public LastAnnouncementAdapter(List<LastAnnouncementModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public LastAnnouncementHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int LayoutIdFromListItem = R.layout.item_announcement_list;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(LayoutIdFromListItem, parent, false);

        return new LastAnnouncementHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LastAnnouncementHolder holder, int position) {
        holder.bindData(list.get(position), position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
