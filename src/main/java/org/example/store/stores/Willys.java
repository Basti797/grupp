package org.example.store.stores;

import org.example.commands.CommandManager;
import org.example.store.Role;
import org.example.store.Store;

public class Willys extends Store {
    public Willys(CommandManager commandManager) {

        super(commandManager.getRole(), "Willys");
        enter(commandManager.getRole());
    }

    private void welcome(){

    }
}
