package org.example.menus.impl;


import org.example.commands.impl.CreateRoleCommand;
import org.example.commands.impl.StopCommand;
import org.example.menus.Menu;
import org.example.store.Main;


public class WelcomeMenu extends Menu {
    public WelcomeMenu(Main main) {
        super(main);
        main.getCommandManager().addCommand(new StopCommand(main));
    }

    @Override
    public void Welcome() {
        System.out.println("Welcome to StoreApp");
        super.Welcome();
    }
}
