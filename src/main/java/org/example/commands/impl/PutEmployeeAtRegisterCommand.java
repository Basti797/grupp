package org.example.commands.impl;

import org.example.commands.Command;
import org.example.store.Main;
import org.example.store.titles.impl.Employee;
import org.example.store.titles.impl.Manager;

public class PutEmployeeAtRegisterCommand extends Command {
    private final Main main;
    public PutEmployeeAtRegisterCommand(Main main) {
        super("set employee");
        this.main = main;
        if (!(main.roleManager.getRole() instanceof Manager)) {
            throw new IllegalArgumentException("PutEmployeeAtStoreCommand can only be run by Manager");
        }
    }

    @Override
    public void exec(String[] args) {
        Manager manager = (Manager) main.roleManager.getRole();
        main.getCommandManager().getCommand("list employees").exec(null);
        System.out.print("Enter employee index: ");
        int answer = main.scanner.nextInt();
        main.scanner.nextLine();
        Employee employee = main.storeManager.getStore().employees.get(answer-1);
        main.storeManager.getStore().setEmployeeAtRegister(employee);

    }

}
