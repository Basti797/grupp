package org.example.commands.impl;

import org.example.commands.Command;
import org.example.store.Main;
import org.example.store.titles.impl.Customer;

public class ListAddedProductsCommand extends Command {

    private Main main;
    public ListAddedProductsCommand(Main main) {
        super("list basket");
        this.main = main;
        if (!(main.storeManager.getRole() instanceof Customer)) {
            throw new IllegalArgumentException("ListAddedWaresCommand can only be run by Customer");
        }
    }

    @Override
    public void exec(String[] args) {
        Customer customer = (Customer) main.storeManager.getRole();
        customer.getBasket().entrySet().forEach(System.out::println);
    }


}
