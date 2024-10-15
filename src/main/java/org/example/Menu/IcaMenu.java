package org.example.Menu;

import org.example.commands.CommandManager;

public class IcaMenu extends StoreMenu {
    public IcaMenu(CommandManager commandManager) {
        super(commandManager);
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the Ica menu!");
        super.Welcome();
    }
}
