package com.example.turboclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.turboclone.model.home_vip.VipAdapter;
import com.example.turboclone.model.home_vip.VipModel;
import com.example.turboclone.model.last_announcement.LastAnnouncementAdapter;
import com.example.turboclone.model.last_announcement.LastAnnouncementModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView vipList = view.findViewById(R.id.recycleViewVipAnnouncement);

        LinearLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        vipList.setLayoutManager(layoutManager);

        VipAdapter vipAdapter = new VipAdapter(getVipList());
        vipList.setAdapter(vipAdapter);

        RecyclerView LastAnnouncementList = view.findViewById(R.id.recycleViewLastAnnouncement);

        LinearLayoutManager layoutManagerLastAnnouncement = new GridLayoutManager(getContext(), 2);
        LastAnnouncementList.setLayoutManager(layoutManagerLastAnnouncement);

        LastAnnouncementAdapter lastAnnouncementAdapter = new LastAnnouncementAdapter(getLastAnnouncementList());
        LastAnnouncementList.setAdapter(lastAnnouncementAdapter);

        return  view;
    }



    private List<VipModel> getVipList() {
        List<VipModel> list  = new ArrayList<>();

        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 1));
        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new VipModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));


        return list;
    }

    private List<LastAnnouncementModel> getLastAnnouncementList() {
        List<LastAnnouncementModel> list  = new ArrayList<>();

        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 1));
        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));
        list.add(new LastAnnouncementModel(R.drawable.car, "31 800 AZN", "Baic X 55","2014, 1.6L, 171 000 km", "Sumqayıt, 4 may 2021", 0));


        return list;
    }
}