package org.example.Menu;

import org.example.commands.CommandManager;
import org.example.commands.impl.SelectRoleCommand;
import org.example.commands.impl.StopCommand;
import org.example.store.Main;


public class WelcomeMenu extends Menu{
    public WelcomeMenu(CommandManager commandManager) {
        super(commandManager);
        commandManager.addCommand(new SelectRoleCommand(commandManager));
        commandManager.addCommand(new StopCommand(commandManager));
    }

    @Override
    public void Welcome() {
        System.out.println("- Select role");
        System.out.println("- Stop");
    }
}
