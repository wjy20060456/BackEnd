package com.farreaching.homepage.entity;

import java.sql.Date;

public class BondEntity {

    private Date date;
    private float rate;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
