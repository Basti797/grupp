package org.example.store;

import org.example.commands.Command;
import org.example.commands.CommandManager;


import java.util.Scanner;
import org.example.Menu.*;
import org.example.store.stores.StoreManager;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private final CommandManager commandManager = new CommandManager(this);
    public final StoreManager storeManager = new StoreManager(this);
    public Menu menu = new WelcomeMenu(this);

    public static void main(String... args) {
        Main main = new Main();

        while(main.commandManager.getRunning()){
            main.menu.Welcome();

            main.commandManager.getInput(scanner.nextLine());
        }
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }
}
