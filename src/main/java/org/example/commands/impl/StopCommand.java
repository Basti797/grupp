package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;

public class StopCommand extends Command {
    private final CommandManager commandManager;
    public StopCommand(CommandManager commandManager) {
        super("stop");
        this.commandManager = commandManager;
    }

    @Override
    public void exec(String[] args) {
        System.out.println("Exiting program!");
        commandManager.setRunning(false);
    }
}
