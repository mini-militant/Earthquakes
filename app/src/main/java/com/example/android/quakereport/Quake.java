package com.example.android.quakereport;

import android.media.MediaPlayer;

/**
 * Created by shailesh on 24/6/17.
 */

public class Quake {
    private double Magnitude;
    private String Place;
    private long TimeInMilliSecond;
    private String url;

    public Quake(double magnitude,String place,long timeinms,String webUrl){
        Magnitude=magnitude;
        Place=place;
        TimeInMilliSecond=timeinms;
        url=webUrl;
    }
    public double getMagnitude(){
        return Magnitude;
    }
    public String getPlace(){
        return Place;
    }
    public  long getTimeInMilliSecond(){
        return TimeInMilliSecond;
    }
    public String getUrl(){
        return url;
    }
}
