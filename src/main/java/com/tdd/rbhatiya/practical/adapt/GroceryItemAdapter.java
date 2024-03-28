package com.tdd.rbhatiya.practical.adapt;

public class GroceryItemAdapter implements GroceryItem {
    private GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getGroceryStore() {
        return null;
    }

    public void adaptGrocery() {
    }
}
