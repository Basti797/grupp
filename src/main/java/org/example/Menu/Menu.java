package org.example.Menu;

import org.example.commands.CommandManager;

public abstract class Menu {
    protected CommandManager commandManager;
    public Menu(CommandManager commandManager){
        this.commandManager = commandManager;
        commandManager.getCommands().clear();
    }

    public void Welcome() {
        System.out.println("commands: ");
        for (int i = 0; i < commandManager.getCommands().size(); ++i) {
            System.out.print(commandManager.getCommands().get(i).getName());
            if (i != commandManager.getCommands().size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
