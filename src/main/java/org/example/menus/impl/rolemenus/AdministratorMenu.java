package org.example.menus.impl.rolemenus;

import org.example.commands.impl.PutEmployeeAtRegisterCommand;
import org.example.menus.Menu;
import org.example.store.Main;

public class AdministratorMenu extends Menu {
    public AdministratorMenu(Main main) {
        super(main);
        main.getCommandManager().addCommand(new PutEmployeeAtRegisterCommand(main));
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the admin menu!");
        super.Welcome();
    }
}
