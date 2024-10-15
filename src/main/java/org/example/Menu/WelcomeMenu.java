package org.example.Menu;


import org.example.commands.impl.SelectRoleCommand;
import org.example.commands.impl.StopCommand;
import org.example.store.Main;


public class WelcomeMenu extends Menu{
    public WelcomeMenu(Main main) {
        super(main);
        main.getCommandManager().addCommand(new SelectRoleCommand(main));
        main.getCommandManager().addCommand(new StopCommand(main));

    }

    @Override
    public void Welcome() {
        System.out.println("Welcome to StoreApp");
        super.Welcome();
    }
}
