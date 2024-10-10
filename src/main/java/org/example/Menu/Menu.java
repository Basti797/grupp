package org.example.Menu;

import org.example.commands.CommandManager;

public abstract class Menu {
    protected CommandManager commandManager;
    public Menu(CommandManager commandManager){
        this.commandManager = commandManager;
    }

    public abstract void Welcome();

}
