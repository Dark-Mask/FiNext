package com.example.finext;

public class ExpensesModel {
    String item;
    String from;
    String cost;
    int image;

    public ExpensesModel(String item, String from, String cost, int image) {
        this.item = item;
        this.from = from;
        this.cost = cost;
        this.image = image;
    }

    public String getItem() {
        return item;
    }

    public String getFrom() {
        return from;
    }

    public String getCost() {
        return cost;
    }

    public int getImage() {
        return image;
    }
}
