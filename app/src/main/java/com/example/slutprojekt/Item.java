package com.example.slutprojekt;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class Item {
    public String name;
    @SerializedName("cost")
    public BigDecimal averagePrice;
    @SerializedName("size")
    public int itemCount;

    public Item(String name, String averagePrice, int itemCount) {
        this.name = name;
        this.averagePrice = new BigDecimal(averagePrice);
        this.itemCount = itemCount;
    }
}
