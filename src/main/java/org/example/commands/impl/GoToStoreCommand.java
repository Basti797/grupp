package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;

public class GoToStoreCommand extends Command {
    private final CommandManager commandManager;
    public GoToStoreCommand(CommandManager commandManager) {
        super("go to");
        this.commandManager = commandManager;
    }

    @Override
    public void exec(String[] args) {
        commandManager.selectStore(args[2]);

    }
}
