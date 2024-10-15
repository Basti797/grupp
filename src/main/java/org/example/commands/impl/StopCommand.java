package org.example.commands.impl;

import org.example.commands.Command;
import org.example.commands.CommandManager;
import org.example.store.Main;

public class StopCommand extends Command {
    private final Main main;
    public StopCommand(Main main) {
        super("stop");
        this.main = main;
    }

    @Override
    public void exec(String[] args) {
        System.out.println("Exiting program!");
        main.getCommandManager().setRunning(false);
    }
}
