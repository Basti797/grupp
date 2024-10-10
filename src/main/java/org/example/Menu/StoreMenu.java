package org.example.Menu;

import org.example.commands.CommandManager;

public class StoreMenu extends Menu{
    private CommandManager commandManager;
    public StoreMenu(CommandManager commandManager) {
        super(commandManager);
        this.commandManager = commandManager;
    }

    @Override
    public void Welcome() {

    }
}
