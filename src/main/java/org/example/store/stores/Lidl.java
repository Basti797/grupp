package org.example.store.stores;

import org.example.commands.CommandManager;
import org.example.store.Store;
import org.example.store.Role;

import java.util.HashMap;
import java.util.Map;

public class Lidl extends Store {


    public Lidl(CommandManager commandManager) {
        super(commandManager.getRole(), "LIDL");
        enter(commandManager.getRole());
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
