package org.example.commands.impl;

import org.example.commands.Command;
import org.example.store.Role;

public class IcaCommand extends Command {
    public Role role;
    public IcaCommand(Role role) {
        super("ica");
        this.role = role;
    }

    @Override
    public void exec(String[] args) {
        System.out.println("You are now in ica!");

    }

    public void printCommands(){

    }
}
