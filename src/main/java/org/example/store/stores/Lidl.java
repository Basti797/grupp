package org.example.store.stores;

import org.example.commands.CommandManager;
import org.example.store.Store;
import org.example.store.Role;
public class Lidl extends Store {
    public Lidl(CommandManager commandManager) {

        super(commandManager.getRole(), "LIDL");
        enter(commandManager.getRole());
    }

    private void welcome(){

    }
}
