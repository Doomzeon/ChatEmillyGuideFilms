package com.example.doomzeon.chatemily;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by doomzeon on 25.03.2019.
 */

class UserMassegeHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public UserMassegeHolder(View view) {

        super(view);

        textView = (TextView)view.findViewById(R.id.message_body_me);

    }


    public void bind (Masseges massege){

        textView.setText(massege.getMassege());

    }

}
