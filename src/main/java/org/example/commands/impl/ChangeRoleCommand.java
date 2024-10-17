package org.example.commands.impl;

import org.example.commands.Command;
import org.example.store.Main;
import org.example.store.titles.Role;
import org.example.store.titles.impl.Customer;

public class ChangeRoleCommand extends Command {
    private final Main main;

    public ChangeRoleCommand(Main main) {
        super("change role");
        this.main = main;

    }

    @Override
    public void exec(String[] args) {
        if (main.roleManager.getSavedPeople().isEmpty()) {
            System.out.println("There is no saved roles");
            return;
        }
        if (main.roleManager.getRole() instanceof Customer customer) {
            if (!customer.getBasket().isEmpty()) {
                System.out.println("Cannot change role while basket isn't empty");
                return;
            }
        }
        for (int i = 0; i < main.roleManager.getSavedPeople().size(); i++) {
            Role role = main.roleManager.getSavedPeople().get(i);
            System.out.println((i + 1) + ". " + role.name + " (" + role.getClass().getSimpleName() + ")");
        }
        System.out.print("Enter index: ");
        int choice = Main.scanner.nextInt() - 1;
        Main.scanner.nextLine();
        main.roleManager.setRole(main.roleManager.getSavedPeople().get(choice));
        System.out.println("Role changed");
    }
}
