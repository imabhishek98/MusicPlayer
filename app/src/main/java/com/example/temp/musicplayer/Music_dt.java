package com.example.temp.musicplayer;

/**
 * Created by temp on 7/15/2017.
 */

public class Music_dt {

    private String s_name, a_name;
    public Music_dt(String song_name, String album_name)
    {
        s_name=song_name;
        a_name=album_name;

    }

    public String getS_name()
    {
            return s_name;
    }


    public String getA_name()
    {
            return a_name;
    }

}
