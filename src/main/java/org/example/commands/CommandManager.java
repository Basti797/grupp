package org.example.commands;

import org.example.Menu.CustomerMenu;
import org.example.commands.impl.IcaCommand;
import org.example.store.Main;
import org.example.store.stores.Ica;
import org.example.store.stores.Lidl;
import org.example.store.stores.Willys;
import org.example.store.Store;
import org.example.store.Role;
import org.example.store.titles.*;

import java.util.ArrayList;

public class CommandManager {
    private Role role;
    private Store store;
    private final ArrayList<Command> commands;

    public CommandManager() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public ArrayList<Command> getCommands() {
        return commands;
    }

    public void getInput(String input) {
        String[] commandArgs = input.split(" ");


        if (commandArgs.length==0){
            throw new IllegalArgumentException("Not a valid command");
        }

        for (Command command : commands){
            if (command.getName().equalsIgnoreCase(commandArgs[0])){
                command.exec(commandArgs);
                return;
            }


        }
        throw new NullPointerException("No such command exists.");

        /*if (role instanceof Customer customer) {
            System.out.println("Choose command: add, pay");
            switch (commandArgs[0].toLowerCase()) {
                case "add" -> customer.addToBasket(commandArgs[1]);
                case "pay" -> {
                    System.out.print(customer.getName() + " paid for: ");
                    for (String item : customer.getBasket()) {
                        System.out.print(item + ",");
                    }
                }
            }
        } else if (role instanceof Administrator) {
            System.out.println("Choose command: add_cashier, add_employee");
            switch (commandArgs[0].toLowerCase()) {
                case "add_cashier" ->
                case "add_employee" ->
            }
        } else if (role instanceof Manager) {
            System.out.println("Choose command: add_cashier");
        }*/
    }


    public void selectStore(String storeSelection) {
        switch (storeSelection) {
            case "lidl":
                store = new Lidl(role);
                break;
            case "Willys":
                store = new Willys(role);
                break;
            case "ica":
                store = new Ica(role);
                break;
            default:
                store = new Lidl(role);
        }
    }

    public Role getRole() {
        if (role == null) {
            System.out.println("No role selected");
        }

        return this.role;
    }

    public Store getStore() {
        return this.store;
    }

    public void selectRole(String roleString) {
        switch (roleString.toLowerCase()) {
            case "manager":
                role = new Manager();
                break;
            case "cashier":
                role = new Cashier();
                break;
            case "customer":
                role = new Customer();
                Main.menu = new CustomerMenu(this);
                break;
            case "employee":
                role = new Employee();
                break;
            case "adminstrator":
                role = new Administrator();
                break;
            default:
                role = new Customer();
                break;
        }
    }

}
