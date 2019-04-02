package com.example.doomzeon.chatemily;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by doomzeon on 25.03.2019.
 */

public class MyReciclerViewAdapter extends RecyclerView.Adapter {

    private ArrayList<Masseges> massegesArray;

    private Context context;

    private final int EMILY_MASSEGE_SENT = 1;

    private final int USER_MASSEGE_SENT = 0;


    public MyReciclerViewAdapter(Context context, ArrayList<Masseges> massagesArray) {

        this.context = context;

        this.massegesArray = massagesArray;

    }


    @Override
    public int getItemViewType(int position) {

        Masseges massege = (Masseges) massegesArray.get(position);

        if(massege.isHoowSent()==true){

            return USER_MASSEGE_SENT;

        }else{

            return EMILY_MASSEGE_SENT;

        }

        //return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        if(viewType == USER_MASSEGE_SENT){

            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.my_massege_layout, parent, false);

            return new UserMassegeHolder(view);

        }else{

            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.emily_message_layout, parent, false);

            return new EmilyMassegeHolder(view);
        }

        //return null;
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Masseges massege =(Masseges) this.massegesArray.get(position);

        if(holder.getItemViewType()== USER_MASSEGE_SENT){

            ((UserMassegeHolder) holder) .bind(massege);

        }else{

            ((EmilyMassegeHolder) holder ).bind(massege);

        }

    }

    @Override
    public int getItemCount() {
        return this.massegesArray.size();
    }
}
