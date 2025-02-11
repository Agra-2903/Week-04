package org.example.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private List<T> listOfItems = new ArrayList<>();

    public void addItem(T item){
        listOfItems.add(item);
    }

    public List<? extends WarehouseItem> getItems(){
        return listOfItems;
    }

}
