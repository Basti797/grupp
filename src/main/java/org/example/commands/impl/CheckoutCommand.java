package org.example.commands.impl;

import org.example.commands.Command;
import org.example.menus.impl.rolemenus.CustomerMenu;
import org.example.store.Main;
import org.example.store.titles.impl.Customer;

public class CheckoutCommand extends Command {
    private Main main;
    public CheckoutCommand(Main main){
        super("walk to checkout");
        this.main = main;
    }

    @Override
    public void exec(String[] args) {
        main.getCommandManager().getCommand("list basket").exec(null);
        if (main.storeManager.getRole() instanceof Customer customer){
            int sum = customer.getBasket().values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Your total is " + sum + "SEK");
            customer.clearBasket();
            main.menu = new CustomerMenu(main);
        }




    }
}
