package org.example.commands.impl;

import org.example.commands.Command;
import org.example.store.Main;

public class GoToStoreCommand extends Command {
    private final Main main;
    public GoToStoreCommand(Main main) {
        super("go to");
        this.main = main;
    }

    @Override
    public void exec(String[] args) {
        main.storeManager.selectStore(args[2]);
        main.storeManager.getStore().listEmployees();

    }
}
