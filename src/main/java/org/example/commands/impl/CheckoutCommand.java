package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;
import org.example.store.Main;

public class CheckoutCommand extends Command {
    private CommandManager commandManager;
    public CheckoutCommand(CommandManager commandManager){
        super("walk to checkout");
        this.commandManager = commandManager;
    }

    @Override
    public void exec(String[] args) {

    }
}
