package com.example.java_galaktion_nizharadze;

import java.sql.Date;

public class Flight {
    private String location;
    private String  destination;
    private Date date;
    private int sits;
    private int price;

    public Flight(String location, String destination, Date date, int sits, int price) {
        this.location = location;
        this.destination = destination;
        this.date = date;
        this.sits = sits;
        this.price = price;
    }

    public Flight() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSits() {
        return sits;
    }

    public void setSits(int sits) {
        this.sits = sits;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
