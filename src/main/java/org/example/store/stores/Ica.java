package org.example.store.stores;


import org.example.commands.CommandManager;
import org.example.store.Store;

public class Ica extends Store {
    public Ica(CommandManager commandManager) {
        super(commandManager.getRole(), "ICA");
        enter(commandManager.getRole());
    }

    @Override
    protected void populateItems() {
        storeItems.put("Olive Oil (1L)", 120);    // Price in SEK
        storeItems.put("Organic Honey (500g)", 150);
        storeItems.put("Salmon (1kg)", 250);
        storeItems.put("Almond Butter (300g)", 170);
        storeItems.put("Imported Cheese (500g)", 200);
        storeItems.put("Steak (1kg)", 300);
        storeItems.put("Luxury Chocolate (200g)", 90);
        storeItems.put("Truffle Oil (100ml)", 180);
        storeItems.put("Organic Wine (750ml)", 220);
        storeItems.put("Gourmet Coffee Beans (500g)", 140);
        storeItems.put("Saffron (1g)", 100);
    }
}
