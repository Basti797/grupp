package org.example.Menu;

import org.example.commands.CommandManager;
import org.example.commands.impl.SelectRoleCommand;
import org.example.commands.impl.StopCommand;


public class WelcomeMenu extends Menu{
    public WelcomeMenu(CommandManager commandManager) {
        super(commandManager);
        commandManager.addCommand(new SelectRoleCommand(commandManager));
        commandManager.addCommand(new StopCommand(commandManager));
    }

    @Override
    public void Welcome() {
        System.out.println("Welcome to StoreApp");
        super.Welcome();
    }
}
