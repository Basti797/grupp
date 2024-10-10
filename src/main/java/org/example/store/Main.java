package org.example.store;

import org.example.commands.Command;
import org.example.commands.CommandManager;


import java.util.Scanner;
import org.example.Menu.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static Store store = null;
    private static Role role = null;
    private static CommandManager commandManager = new CommandManager();
    public static Menu menu = new WelcomeMenu(commandManager);
    public static void main(String... args) {
            
        while(true){
//            System.out.println("Who are you? (choose between: Customer, Employee, Manager, Administrator, Cashier)");
//            commandManager.selectRole(scanner.nextLine());
            //System.out.println("What store do you want to enter? (Lidl)");
            //commandManager.selectStore(scanner.nextLine().toLowerCase());
            menu.Welcome();

            //commandManager.getStore().enter(commandManager.getRole());

            
            //System.out.print("Choose command: ");
            for (Command command : commandManager.getCommands()) {
                System.out.print(command.getName());
            }
            commandManager.getInput(scanner.nextLine());


        }
    }











}
