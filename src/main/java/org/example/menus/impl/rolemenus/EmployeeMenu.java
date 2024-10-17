package org.example.menus.impl.rolemenus;

import org.example.commands.impl.ExitStoreCommand;
import org.example.commands.impl.GoToStoreCommand;
import org.example.commands.impl.StopCommand;
import org.example.menus.Menu;
import org.example.store.Main;

public class EmployeeMenu extends Menu {
    public EmployeeMenu(Main main) {
        super(main);
        main.getCommandManager().addCommand(new StopCommand(main));
        main.getCommandManager().addCommand(new GoToStoreCommand(main));
        main.getCommandManager().addCommand(new ExitStoreCommand(main));
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the employee menu!");
        super.Welcome();
    }
}
