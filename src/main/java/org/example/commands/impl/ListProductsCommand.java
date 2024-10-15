package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;
import org.example.store.Main;

public class ListProductsCommand extends Command {
    private Main main;
    public ListProductsCommand(Main main) {
        super("list products");
        this.main = main;
    }

    @Override
    public void exec(String[] args) {
        main.storeManager.getStore().getStoreItems().entrySet().forEach(System.out::println);
    }
}
