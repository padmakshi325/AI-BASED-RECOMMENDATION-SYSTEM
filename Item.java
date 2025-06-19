package com.paddu;

public class Item {
    private long id;
    private String name;
    private String category;

    public Item(long id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Item ID: " + id + ", Name: " + name + ", Category: " + category;
    }
}
