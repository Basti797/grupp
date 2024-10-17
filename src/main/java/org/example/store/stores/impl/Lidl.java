package org.example.store.stores.impl;

import org.example.store.Main;
import org.example.store.stores.Store;

public class Lidl extends Store {


    public Lidl(Main main) {
        super(main.roleManager.getRole(), "LIDL");
        enter(main.roleManager.getRole());
    }

    @Override
    protected void populateItems() {
        // Adding items to the store with their prices in SEK
        storeItems.put("Apple", 20);   // Price in SEK
        storeItems.put("Banana", 10);
        storeItems.put("Orange", 15);
        storeItems.put("Milk", 30);
        storeItems.put("Bread", 25);
        storeItems.put("Eggs", 40);
        storeItems.put("Butter", 50);
    }
}
