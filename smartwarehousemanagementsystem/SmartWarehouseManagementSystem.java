package org.example.smartwarehousemanagementsystem;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to storages
        electronicsStorage.addItem(new Electronics("Laptop", 1200.50));
        electronicsStorage.addItem(new Electronics("Smartphone", 799.99));

        groceriesStorage.addItem(new Groceries("Apple", 2.99));
        groceriesStorage.addItem(new Groceries("Milk", 1.49));

        furnitureStorage.addItem(new Furniture("Sofa", 499.99));
        furnitureStorage.addItem(new Furniture("Dining Table", 799.00));

        // Displaying items using the wildcard method
        System.out.println("Electronics:");
        for(WarehouseItem e: electronicsStorage.getItems()){
            System.out.println("Name: " + e.getName());
            System.out.println("Price: " + e.getPrice());
        }

        System.out.println("\nGroceries:");
        for(WarehouseItem g: groceriesStorage.getItems()){
            System.out.println("Name: " + g.getName());
            System.out.println("Price: " + g.getPrice());
        }

        System.out.println("\nFurniture:");
        for(WarehouseItem f: furnitureStorage.getItems()){
            System.out.println("Name: " + f.getName());
            System.out.println("Price: " + f.getPrice());
        }
    }
}
