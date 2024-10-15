package org.example.menus.impl.storemenus;


import org.example.menus.impl.StoreMenu;
import org.example.store.Main;

public class WillysMenu extends StoreMenu {
    public WillysMenu(Main main) {
        super(main);
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the Willys menu!");
        super.Welcome();
    }
}
