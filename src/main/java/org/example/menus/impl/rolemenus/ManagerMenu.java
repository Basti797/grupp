package org.example.menus.impl.rolemenus;

import org.example.commands.impl.ListEmployeeCommand;
import org.example.commands.impl.PutEmployeeAtStoreCommand;
import org.example.menus.Menu;
import org.example.store.Main;

public class ManagerMenu extends Menu {

    public ManagerMenu(Main main) {
        super(main);
        main.getCommandManager().addCommand(new PutEmployeeAtStoreCommand(main));
        main.getCommandManager().addCommand(new ListEmployeeCommand(main));

    }

    @Override
    public void Welcome() {
        System.out.println("Welcome manager");
        super.Welcome();
    }
}
