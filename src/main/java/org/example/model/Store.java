package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Chocolate", 35.0, "Bitter"),
                new Coke("Coke", 50, "Can"),
                new Bread("Bread", 25, "Brown")
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            product.showDetails();
        }
    }
}