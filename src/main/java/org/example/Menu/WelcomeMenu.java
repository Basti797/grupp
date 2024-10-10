package org.example.Menu;

import org.example.commands.CommandManager;
import org.example.commands.impl.SelectRoleCommand;


public class WelcomeMenu extends Menu{
    public WelcomeMenu(CommandManager commandManager) {
        super(commandManager);
        commandManager.addCommand(new SelectRoleCommand(commandManager));
    }

    @Override
    public void Welcome() {
        System.out.println("Select role");
    }
}
