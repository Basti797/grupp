package org.example.store.titles;

import org.example.store.Role;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Role {
    private ArrayList<String> basket;
    public Customer() {
        this.name = "Johan";
        basket = new ArrayList<>();
    }

    public ArrayList<String> getBasket(){
        return basket;
    }

    public void addToBasket(String thingToAdd){
        basket.add(thingToAdd);
    }
}
