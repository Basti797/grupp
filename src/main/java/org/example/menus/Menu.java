package org.example.menus;


import org.example.store.Main;

public abstract class Menu {
    protected Main main;
    public Menu(Main main){
        this.main = main;
        main.getCommandManager().getCommands().clear();
    }

    public void Welcome() {
        System.out.println("commands: ");
        for (int i = 0; i < main.getCommandManager().getCommands().size(); ++i) {
            System.out.print(main.getCommandManager().getCommands().get(i).getName());
            if (i != main.getCommandManager().getCommands().size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
