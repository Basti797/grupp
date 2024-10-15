package org.example.Menu;

import org.example.commands.CommandManager;
import org.example.commands.impl.ListProductsCommand;

public class LidlMenu extends StoreMenu {

    public LidlMenu(CommandManager commandManager) {
        super(commandManager);
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the Lidl menu!");
        super.Welcome();
    }
}
