package org.example.menus.impl;

import org.example.commands.impl.AddToBasketCommand;
import org.example.commands.impl.ListAddedProductsCommand;
import org.example.commands.impl.ListProductsCommand;
import org.example.menus.Menu;
import org.example.store.Main;
import org.example.store.titles.impl.Customer;

public class StoreMenu extends Menu {
    private Main main;
    public StoreMenu(Main main) {
        super(main);
        this.main = main;

        if (main.storeManager.getRole() instanceof Customer) {
            main.getCommandManager().addCommand(new ListProductsCommand(main));
            main.getCommandManager().addCommand(new AddToBasketCommand(main));
            main.getCommandManager().addCommand(new ListAddedProductsCommand(main));
        }
    }

    @Override
    public void Welcome() {
        super.Welcome();
    }
}
