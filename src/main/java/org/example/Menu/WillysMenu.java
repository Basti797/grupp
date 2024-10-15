package org.example.Menu;

import org.example.commands.CommandManager;

public class WillysMenu extends StoreMenu{
    public WillysMenu(CommandManager commandManager) {
        super(commandManager);
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the Willys menu!");
        super.Welcome();
    }
}
