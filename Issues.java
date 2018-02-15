package com.company;

public class Issues {
    private String date;
    private String item;

    public Issues(String date, String item) {
        this.date = date;
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public String getItem() {
        return item;
    }
}
