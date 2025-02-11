package org.example.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();

        // Adding different product types
        Book book1 = new Book("The Alchemist", 15.99, BookCategory.FICTION);
        Book book2 = new Book("Brief History of Time", 20.99, BookCategory.NON_FICTION);

        Clothing clothing1 = new Clothing("Men's Jacket", 49.99, ClothingCategory.MAN);
        Clothing clothing2 = new Clothing("Women's Dress", 39.99, ClothingCategory.WOMAN);

        Gadget gadget1 = new Gadget("Smartphone", 699.99, GadgetCategory.MOBILE);
        Gadget gadget2 = new Gadget("Laptop", 1299.99, GadgetCategory.LAPTOP);

        // Adding to catalog
        catalog.add(book1);
        catalog.add(book2);
        catalog.add(clothing1);
        catalog.add(clothing2);
        catalog.add(gadget1);
        catalog.add(gadget2);

        // Display catalog before discount
        ProductOperations.displayCatalog(catalog);

        // Applying discounts
        ProductOperations.applyDiscount(book1, 10);  // 10% discount on a book
        ProductOperations.applyDiscount(clothing1, 15); // 15% discount on clothing
        ProductOperations.applyDiscount(gadget1, 5); // 5% discount on a gadget

        // Display catalog after discount
        ProductOperations.displayCatalog(catalog);
    }
}
