package org.example.model;

public class Coke extends ProductForSale{
    private double litre = 0.33;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("It is a "+litre+"-litre bottle of coke.");
    }
}
