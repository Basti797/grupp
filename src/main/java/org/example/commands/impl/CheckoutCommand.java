package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;
import org.example.store.Main;

public class CheckoutCommand extends Command {
    private Main main;
    public CheckoutCommand(Main main){
        super("walk to checkout");
        this.main = main;
    }

    @Override
    public void exec(String[] args) {
        main.getCommandManager().getInput("list wares");
        System.out.println("Your total ");

    }
}
