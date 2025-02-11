package org.example.dynamiconlinemarketplace;

import java.util.List;

public class ProductOperations {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - ((product.getPrice() * percentage) / 100);
        product.setPrice(newPrice);
    }

    public static void displayCatalog(List<? extends Product<?>> catalog) {
        System.out.printf("%-25s%-12s%-12s%n", "Name", "Price", "Catagory");
        for(Product<?> product : catalog){
            System.out.printf("%-25s%-10.2f%-12s%n", product.getName(), product.getPrice(), product.getCategory());
        }
    }
}
