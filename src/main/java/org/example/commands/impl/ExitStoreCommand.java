package org.example.commands.impl;

import org.example.commands.Command;
import org.example.menus.impl.rolemenus.CustomerMenu;
import org.example.menus.impl.rolemenus.EmployeeMenu;
import org.example.store.Main;
import org.example.store.titles.impl.Customer;
import org.example.store.titles.impl.Employee;

public class ExitStoreCommand extends Command {
    private Main main;
    public ExitStoreCommand(Main main) {
        super("exit store");
        this.main = main;
    }

    @Override
    public void exec(String[] args) {
        if (main.roleManager.getRole() instanceof Customer customer) {
            if (!customer.getBasket().isEmpty()) {
                System.out.println("Can't exit store, basket is not empty! Go to checkout.");
                return;
            }
            main.menu = new CustomerMenu(main);
            System.out.println("bye!");
            return;
        } else if (main.roleManager.getRole() instanceof Employee) {
            System.out.println("bye!");
            main.menu = new EmployeeMenu(main);
        }
    }
}
