package org.example.Menu;

import org.example.commands.CommandManager;
import org.example.commands.impl.AddToBasketCommand;
import org.example.commands.impl.ListProductsCommand;
import org.example.store.titles.Customer;

public class StoreMenu extends Menu {
    private CommandManager commandManager;
    public StoreMenu(CommandManager commandManager) {
        super(commandManager);
        this.commandManager = commandManager;

        if (commandManager.getRole() instanceof Customer) {
            commandManager.addCommand(new ListProductsCommand(commandManager));
            commandManager.addCommand(new AddToBasketCommand(commandManager));
        }
    }

    @Override
    public void Welcome() {
        super.Welcome();
    }
}
