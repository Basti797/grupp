package org.example.store;

import org.example.commands.Command;
import org.example.commands.CommandManager;


import java.util.Scanner;
import org.example.Menu.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static final CommandManager commandManager = new CommandManager();
    public static Menu menu = new WelcomeMenu(commandManager);
    public static void main(String... args) {
            
        while(commandManager.getRunning()){
//            System.out.println("Who are you? (choose between: Customer, Employee, Manager, Administrator, Cashier)");
//            commandManager.selectRole(scanner.nextLine());
            //System.out.println("What store do you want to enter? (Lidl)");
            //commandManager.selectStore(scanner.nextLine().toLowerCase());
            menu.Welcome();

            //commandManager.getStore().enter(commandManager.getRole());

            
            //System.out.print("Choose command: ");

            commandManager.getInput(scanner.nextLine());


        }
    }











}
