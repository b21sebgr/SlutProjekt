package com.example.slutprojekt;

import java.math.BigDecimal;
import com.google.gson.anotations.SerializedName;

public class Item {
    @SerializedName("Name")
    public String name;
    @SerializedName("Cost")
    public BigDecimal averagePrice;
    @SerializedName("Size")
    public int itemCount;

    public Item(String name, String averagePrice, int itemCount) {
        this.name = name;
        this.averagePrice = new BigDecimal(averagePrice);
        this.itemCount = itemCount;
    }
}
