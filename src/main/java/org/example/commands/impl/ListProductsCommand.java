package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;

public class ListProductsCommand extends Command {
    private CommandManager commandManager;
    public ListProductsCommand(CommandManager commandManager) {
        super("list products");
        this.commandManager = commandManager;
    }

    @Override
    public void exec(String[] args) {
        commandManager.getStore().getStoreItems().entrySet().stream().forEach(System.out::println);
    }
}
