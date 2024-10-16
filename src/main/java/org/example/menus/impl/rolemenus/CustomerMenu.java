package org.example.menus.impl.rolemenus;

import org.example.commands.impl.CheckoutCommand;
import org.example.commands.impl.GoToStoreCommand;
import org.example.commands.impl.StopCommand;
import org.example.menus.Menu;
import org.example.store.Main;


public class CustomerMenu extends Menu {
    public CustomerMenu(Main main) {
        super(main);
        main.getCommandManager().addCommand(new StopCommand(main));
        main.getCommandManager().addCommand(new GoToStoreCommand(main));
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the customer menu!");
        super.Welcome();
    }
}
