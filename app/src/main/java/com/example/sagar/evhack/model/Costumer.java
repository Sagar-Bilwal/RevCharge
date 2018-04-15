package com.example.sagar.evhack.model;

/**
 * Created by SAGAR on 15-04-2018.
 */

public class Costumer
{
    private String station;
    private String _id;
    private String location;
    private String time;
    private String date;
    Costumer(String station,String _id,String location,String time,String date)
    {

        this.station = station;
        this.location = location;
        this.time = time;
        this.date = date;
        this._id=_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
