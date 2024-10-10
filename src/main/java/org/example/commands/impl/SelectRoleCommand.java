package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;
import org.example.store.Main;

public class SelectRoleCommand extends Command {
    private final CommandManager commandManager;
    public SelectRoleCommand(CommandManager commandManager){
        super("select role");
        this.commandManager = commandManager;

    }

    @Override
    public void exec(String[] args) {
        System.out.println("Please select your role.");
        System.out.println("- customer");
        System.out.println("- Employee");
        commandManager.selectRole(Main.scanner.nextLine());
    }
}
