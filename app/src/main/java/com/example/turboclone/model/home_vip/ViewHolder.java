package com.example.turboclone.model.home_vip;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turboclone.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView carImage;
    public TextView carPrice, carModel, carInformation, carDate, carSalon;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.carImage = itemView.findViewById(R.id.imageViewCarImage);
        this.carPrice = itemView.findViewById(R.id.textViewPrice);
        this.carModel = itemView.findViewById(R.id.textViewModel);
        this.carInformation = itemView.findViewById(R.id.textViewInformation);
        this.carDate = itemView.findViewById(R.id.textViewDate);
        this.carSalon = itemView.findViewById(R.id.textViewSalon);
    }

    public void bindData(VipModel item, int position) {
        carImage.setImageResource(item.getCarImage());
        carPrice.setText((item.getCarPrice()));
        carModel.setText(item.getCarModel());
        carInformation.setText(item.getCarInformation());
        carDate.setText(item.getCarDate());
        if (item.getCarSalon() == 1) {
            carSalon.setVisibility(View.VISIBLE);
        } else {
            carSalon.setVisibility(View.INVISIBLE);
        }
    }
}
