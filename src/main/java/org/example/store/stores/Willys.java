package org.example.store.stores;

import org.example.commands.CommandManager;
import org.example.store.Role;
import org.example.store.Store;

public class Willys extends Store {
    public Willys(CommandManager commandManager) {
        super(commandManager.getRole(), "Willys");

        enter(commandManager.getRole());
    }

    @Override
    protected void populateItems() {
        storeItems.put("Apple", 5);   // Price in SEK
        storeItems.put("Banana", 3);
        storeItems.put("Carrot", 2);
        storeItems.put("Tomato", 4);
        storeItems.put("Cucumber", 6);
        storeItems.put("Potato", 2);
        storeItems.put("Onion", 3);
        storeItems.put("Garlic", 1);
        storeItems.put("Lettuce", 7);
        storeItems.put("Spinach", 8);
        storeItems.put("Yogurt", 9);
        storeItems.put("Water bottle", 5);
    }

}
