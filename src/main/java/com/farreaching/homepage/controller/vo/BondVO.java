package com.farreaching.homepage.controller.vo;

import com.farreaching.homepage.entity.BondEntity;
import lombok.Data;

@Data
public class BondVO {
    private float date;
    private float rate;

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}

