package org.example.commands.impl;

import org.example.commands.Command;
import org.example.store.Main;
import org.example.store.titles.impl.Employee;

import java.util.List;

public class ListEmployeeCommand extends Command {
    private Main main;
    public ListEmployeeCommand(Main main) {
        super("list employee");
        this.main = main;
    }

    @Override
    public void exec(String[] args) {
        List<Employee> employees = main.storeManager.getStore().employees;
        for (int i = 0; i < employees.size(); ++i) {
            Employee employee = employees.get(i);
            System.out.println((i+1) + ": " + employee.getName() + " in role " + employee.getClass().getSimpleName());
        }

    }
}
