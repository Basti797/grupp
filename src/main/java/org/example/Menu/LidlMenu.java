package org.example.Menu;

import org.example.store.Main;

public class LidlMenu extends StoreMenu {

    public LidlMenu(Main main) {
        super(main);
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the Lidl menu!");
        super.Welcome();
    }
}
