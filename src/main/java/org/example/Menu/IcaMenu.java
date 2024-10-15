package org.example.Menu;


import org.example.store.Main;

public class IcaMenu extends StoreMenu {
    public IcaMenu(Main main) {
        super(main);
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the Ica menu!");
        super.Welcome();
    }
}
