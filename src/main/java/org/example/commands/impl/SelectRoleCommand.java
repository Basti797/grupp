package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;

public class SelectRoleCommand extends Command {
    private CommandManager commandManager;
    public SelectRoleCommand(CommandManager commandManager){
        super("selectrole");
        this.commandManager = commandManager;

    }

    @Override
    public void exec(String[] args) {
        commandManager.selectRole(args[0]);
    }
}
