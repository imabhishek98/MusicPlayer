package com.example.temp.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Music_dt>  first_arrayList= new ArrayList<Music_dt>();
        first_arrayList.add(new Music_dt("Mere Rashke Qamar","Baadshaho"));
        first_arrayList.add(new Music_dt("Jungle Rules","French Montanna"));
        first_arrayList.add(new Music_dt("Jagga Jasoos","Pritam Chakraborty"));
        first_arrayList.add(new Music_dt("Rich Love","Rich Love"));
        first_arrayList.add(new Music_dt("Toilet","Vickey Prasad"));


        ListView listView = (ListView) findViewById(R.id.first_list_view);




    }
}
