package org.example.model;

public class Bread extends ProductForSale{
    private int gram = 200;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("It is a "+gram+"-gram loaf of bread.");
    }
}
