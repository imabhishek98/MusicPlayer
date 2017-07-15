package com.example.temp.musicplayer;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by temp on 7/15/2017.
 */

public class MusicAdapter implements ArrayAdapter {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Music_dt temp = getItem(position);


        return super.getView(position, convertView, parent);
    }
}
