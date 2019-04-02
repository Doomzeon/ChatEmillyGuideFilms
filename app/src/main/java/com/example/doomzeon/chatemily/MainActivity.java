package com.example.doomzeon.chatemily;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText messageUser;
    private ImageButton buttonSend;
    private RecyclerView listaSms;
    private ArrayAdapter arrayAdapter;
    private ArrayList<Masseges> masseges= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///
        messageUser = (EditText) findViewById(R.id.messageUser);
        buttonSend = (ImageButton) findViewById(R.id.sendMessage);
        listaSms=(RecyclerView) findViewById(R.id.listaSms);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String massege = messageUser.getText().toString();

                masseges.add(new Masseges(massege,true));

                masseges.add(new Masseges("hHAHAH",false));

                MyReciclerViewAdapter myReciclerViewAdapter = new MyReciclerViewAdapter(MainActivity.this, masseges);
                listaSms.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                listaSms.setAdapter(myReciclerViewAdapter);

               // ListViewAdapterMasseges myAdapter= new ListViewAdapterMasseges(MainActivity.this, masseges);

                //listaSms.setAdapter(myAdapter);

                /*arrayAdapter = new ArrayAdapter(MainActivity.this,R.layout.my_massege_layout,R.id.message_body_me, massege);
                listaSms=(ListView) findViewById(R.id.listaSms);
                listaSms.setAdapter(arrayAdapter);*/

            }
        });

    }

}
