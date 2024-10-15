package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;
import org.example.store.titles.Customer;

public class ListAddedProductsCommand extends Command {

    private CommandManager commandManager;
    public ListAddedProductsCommand(CommandManager manager) {
        super("list products");
        this.commandManager = manager;
        if (!(commandManager.getRole() instanceof Customer)) {
            throw new IllegalArgumentException("ListAddedWaresCommand can only be run by Customer");
        }
    }

    @Override
    public void exec(String[] args) {
        Customer customer = (Customer) commandManager.getRole();
        customer.getBasket().entrySet().forEach(System.out::println);
    }


}
