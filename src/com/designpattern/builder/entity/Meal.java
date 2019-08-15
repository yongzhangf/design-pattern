package com.designpattern.builder.entity;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public float getCost() {

        float totalCost = 0.0f;

        for (Item item : items) {
            totalCost += item.price();
        }

        return totalCost;
    }

    public void showItems() {

        for (Item item : this.items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
