package org.example.commands.impl;

import org.example.commands.Command;
import org.example.store.Main;

public class CreateRoleCommand extends Command {
    private final Main main;
    public CreateRoleCommand(Main main){
        super("create role");
        this.main = main;

    }

    @Override
    public void exec(String[] args) {
        System.out.print("Enter your name: ");
        String name = Main.scanner.nextLine();
        System.out.println("Please select your role.");
        System.out.println("- customer");
        System.out.println("- Employee");
        main.roleManager.selectRole(Main.scanner.nextLine(), name);
    }
}
