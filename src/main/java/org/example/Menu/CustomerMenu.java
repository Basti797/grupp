package org.example.Menu;

import org.example.commands.CommandManager;
import org.example.commands.impl.IcaCommand;

public class CustomerMenu extends Menu{
    public CustomerMenu(CommandManager commandManager) {
        super(commandManager);
        commandManager.addCommand(new IcaCommand(commandManager.getRole()));
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the customer menu!");
    }
}
