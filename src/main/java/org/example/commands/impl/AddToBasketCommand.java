package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;
import org.example.store.Main;
import org.example.store.titles.impl.Customer;

public class AddToBasketCommand extends Command {
    private final Main main;

    public AddToBasketCommand(Main main) {
        super("add to basket");
        this.main = main;
        if (!(main.roleManager.getRole() instanceof Customer)) {
            throw new IllegalArgumentException("AddToBasketCommand can only be run by Customer");
        }
    }

    @Override
    public void exec(String[] args) {
        if (args == null || args.length < 1) {
            System.err.println("Please select an item");
            return;
        }
        StringBuilder arguments = new StringBuilder();
        for (int i = 0; i < args.length; ++i) {
            arguments.append(args[i]);
            if (i != args.length - 1 && !args[i].isEmpty()) {
                arguments.append(" ");
            }
        }

        String selection = arguments.toString();
        main.storeManager.getStore().getStoreItems().entrySet().stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(selection))
                .findAny()
                .ifPresent(entry -> {
                    Customer customer = (Customer) main.roleManager.getRole();
                    customer.addToBasket(entry.getKey(), entry.getValue());
                    System.out.println("Added " + entry.getKey() + "(" + entry.getValue() + " SEK) to " + customer.getName() + "'s basket");
                });
    }
}
