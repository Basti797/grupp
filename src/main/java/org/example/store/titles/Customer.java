package org.example.store.titles;

import org.example.store.Role;

import java.util.HashMap;
import java.util.Map;

public class Customer extends Role {
    private String name;
    private Map<String, Integer> basket;
    public Customer(String name) {
        super(name);
        this.name = name;
        basket = new HashMap<>();
    }

    public Map<String, Integer> getBasket(){
        return basket;
    }

    public void addToBasket(String thingToAdd, int cost){
        basket.put(thingToAdd, cost);
    }
}
