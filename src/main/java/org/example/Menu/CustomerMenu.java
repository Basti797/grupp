package org.example.Menu;

import org.example.commands.CommandManager;
import org.example.commands.impl.GoToStoreCommand;
import org.example.commands.impl.StopCommand;

public class CustomerMenu extends Menu {
    public CustomerMenu(CommandManager commandManager) {
        super(commandManager);
        commandManager.getCommands().clear();
        commandManager.addCommand(new StopCommand(commandManager));
        commandManager.addCommand(new GoToStoreCommand(commandManager));
    }

    @Override
    public void Welcome() {
        System.out.println("You are now in the customer menu!");
        super.Welcome();
    }
}
