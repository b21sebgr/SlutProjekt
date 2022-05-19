package com.example.slutprojekt;

import java.math.BigDecimal;

public class Item {
    private String name;
    private BigDecimal averagePrice;
    private int itemCount;

    public Item(String name) {
        this.name = name;
        this.averagePrice = new BigDecimal(0);
        this.itemCount = 0;
    }

    public Item(String name, String averagePrice, int itemCount) {
        this.name = name;
        this.averagePrice = new BigDecimal(averagePrice);
        this.itemCount = itemCount;
    }

    public String getName() {
        return name;
    }

    public String getAveragePrice() {return averagePrice.toString();}

    public int getItemCount() {return itemCount;}

    public String toString() {
        return "name: " + name + " averagePrice: " + averagePrice + " itemCount: " + itemCount;
    }
}
