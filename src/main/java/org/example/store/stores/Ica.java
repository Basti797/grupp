package org.example.store.stores;


import org.example.commands.CommandManager;
import org.example.store.Role;
import org.example.store.Store;
public class Ica extends Store {
    public Ica(CommandManager commandManager) {
        super(commandManager.getRole(), "ICA");
        enter(commandManager.getRole());
    }

    private void welcome(){

    }




}
