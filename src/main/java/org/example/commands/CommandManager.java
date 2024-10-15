package org.example.commands;
import org.example.store.Main;
import java.util.ArrayList;

public class CommandManager {
    private final ArrayList<Command> commands;
    private boolean running = true;
    private final Main main;
    public CommandManager(Main main) {
        this.main = main;

        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public ArrayList<Command> getCommands() {
        return commands;
    }

    public void getInput(String input) {
        String[] commandArgs = input.toLowerCase().split(" ");

        if (commandArgs.length==0){
            throw new IllegalArgumentException("Not a valid command");
        }


        for (Command command : commands) { //add to basket smör
            if (command.getName().equalsIgnoreCase(input.toLowerCase())){
                command.exec(commandArgs);
                return;
            }
            if (command.getName().equalsIgnoreCase(commandArgs[0])){
                command.exec(commandArgs);
                return;
            }
            if (commandArgs.length>2){
                if (command.getName().equalsIgnoreCase(commandArgs[0] + " " + commandArgs[1])){
                    System.out.println("1");
                    command.exec(commandArgs);
                    return;
                }

            }

            if (input.toLowerCase().startsWith(command.getName().toLowerCase())) {
                String commandArg = input.split(command.getName())[1];
                String[] commandArgument = commandArg.split(" ");
                command.exec(commandArgument);
                return;
            }



        }
        System.out.println("No such command exists!");

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

    public boolean getRunning(){
        return running;
    }

    public void setRunning(boolean running){
        this.running = running;
    }










}
