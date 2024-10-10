package org.example.Menu;

import org.example.commands.CommandManager;
import org.example.commands.impl.GoToStore;
import org.example.commands.impl.StopCommand;

public class CustomerMenu extends Menu{
    public CustomerMenu(CommandManager commandManager) {
        super(commandManager);
        commandManager.addCommand(new StopCommand(commandManager));
        commandManager.addCommand(new GoToStore(commandManager));
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the customer menu!");
        System.out.println("- go to <store>");
        System.out.println("- Stop");
    }
}
